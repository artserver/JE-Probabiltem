package kr.laeng.probabiltem;

import kr.laeng.probabiltem.event.player.PlayerItemGetEvent;
import kr.laeng.probabiltem.event.player.PlayerProbabilityCheckEvent;
import kr.laeng.probabiltem.material.MaterialType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class EventListener implements Listener {
    private HashMap<String, Boolean> canceled = new HashMap<>();

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
        // 칼을 들고 오른쪽 클릭하면 획득성공 확률을 알 수 있다.

        Player player = event.getPlayer();
        Block block = event.getClickedBlock();

        if (block == null || block.isEmpty()) return;

        ItemStack clickedItem = new ItemStack(block.getTypeId(), 1, block.getData());
        ItemStack handItem = player.getInventory().getItemInMainHand();

        if (isSwordItem(handItem)) { //칼로 블럭을 부술 수 있는 버그가 있다.
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (isCanSwordInteractiveToItem(clickedItem)) return;

                double probability = ProbabiltemAPI.getPlayerProbability(player, MaterialType.get(clickedItem));
                double extraPoint = 0.0d;

                PlayerProbabilityCheckEvent ev = new PlayerProbabilityCheckEvent(event, probability, extraPoint);
                Bukkit.getPluginManager().callEvent(ev);

                if (ev.isCancelled()) return;

                probability = ev.getProbability();
                extraPoint = ev.getExtraPoint();

                double finalPoint = probability + extraPoint;

                ChatColor chatColor = ChatColor.GREEN;

                if (finalPoint < 90.0d) chatColor = ChatColor.YELLOW;
                if (finalPoint < 40.0d) chatColor = ChatColor.RED;

                player.sendActionBar(String.format("%s아이템 획득률: %d%%", chatColor, (int) finalPoint));

            } else {
                event.setCancelled(true);
                canceled.replace(player.getName(), false);
            }
        }

    }

    //@EventHandler(priority = EventPriority.NORMAL)
    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event) {
        // 블럭을 부순다.

        Player player = event.getPlayer();
        Block block = event.getBlock();

        if (block == null || block.isEmpty()) return;

        ItemStack blockItem = new ItemStack(block.getTypeId(), 1, block.getData());

        if (!isBreakMaterialType(blockItem)) return;

        double probability = ProbabiltemAPI.getPlayerProbability(player, MaterialType.get(blockItem));
        double extraPoint = 0.0d;
        List<ItemStack> successItems = (List<ItemStack>) block.getDrops();
        List<ItemStack> failItems = new ArrayList<>();

        PlayerItemGetEvent ev = new PlayerItemGetEvent(event, probability, extraPoint, successItems, failItems);
        Bukkit.getPluginManager().callEvent(ev);

        if (ev.isCancelled()) return;

        event.setDropItems(false);

        probability = ev.getProbability();
        extraPoint = ev.getExtraPoint();
        successItems = ev.getSuccessItems();
        failItems = ev.getFailItems();

        addItemToPlayerInventory(player, successItems, failItems, probability, extraPoint);
    }

    @EventHandler
    public void onEntityDeathEvent(EntityDeathEvent event) {
        // 몬스터를 잡는다.

        LivingEntity entity = event.getEntity();

        if (entity instanceof Player || entity.getKiller() == null) return;

        Player player = entity.getKiller();
        List<ItemStack> dropItems = event.getDrops();

        if (dropItems.isEmpty()) return;

        double probability = ProbabiltemAPI.getPlayerProbability(player, MaterialType.get(dropItems.get(0)));
        double extraPoint = 0.0d;
        List<ItemStack> successItems = dropItems;
        List<ItemStack> failItems = new ArrayList<>();

        PlayerItemGetEvent ev = new PlayerItemGetEvent(event, probability, extraPoint, successItems, failItems);
        Bukkit.getPluginManager().callEvent(ev);

        if (ev.isCancelled()) return;

        event.getDrops().clear();

        probability = ev.getProbability();
        extraPoint = ev.getExtraPoint();
        successItems = ev.getSuccessItems();
        failItems = ev.getFailItems();

        addItemToPlayerInventory(player, successItems, failItems, probability, extraPoint);
    }

    @EventHandler
    public void onPlayerItemDamageEvent(PlayerItemDamageEvent event) {
        String playerName = event.getPlayer().getName();

        if (!canceled.get(playerName)) {
            canceled.replace(playerName, true);
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        canceled.put(event.getPlayer().getName(), true);
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        canceled.remove(event.getPlayer().getName());
    }

    private void addItemToPlayerInventory(Player player, List<ItemStack> successItems, List<ItemStack> failItems, double probability, double extraPoint) {
        Random random = new Random();
        double floatNumber = random.nextFloat();
        double finalPoint = Math.min(probability + extraPoint, 100.0d) / 100;
        List<ItemStack> resultItems = failItems;
        String message = ChatColor.RED + "아이템 획득 실패";

        if (finalPoint == 1.0d || (floatNumber < finalPoint)) {
            resultItems = successItems;
            message = ChatColor.GREEN + "아이템 획득 성공";
        }

        if (!resultItems.isEmpty()) {
            for (ItemStack resultItem : resultItems) {
                player.getInventory().addItem(resultItem);
            }
        }

        player.sendActionBar(message);
    }

    private boolean isBreakMaterialType(ItemStack itemStack) {
        MaterialType mType = MaterialType.get(itemStack);
        List<MaterialType> allowMTypes = new ArrayList<>();

        allowMTypes.add(MaterialType.FARMING);
        allowMTypes.add(MaterialType.MINING);
        allowMTypes.add(MaterialType.GATHERING);
        allowMTypes.add(MaterialType.FELLING);

        return allowMTypes.contains(mType);
    }

    private boolean isMaterialType(MaterialType materialType, ItemStack itemStack) {
        MaterialType mType = MaterialType.get(itemStack);
        return materialType == mType;
    }

    private boolean isSwordItem(ItemStack itemStack) {
        List<Material> sword = new ArrayList<>();

        sword.add(Material.WOOD_SWORD);
        sword.add(Material.IRON_SWORD);
        sword.add(Material.GOLD_SWORD);
        sword.add(Material.DIAMOND_SWORD);

        return sword.contains(itemStack.getType());
    }

    private boolean isCanSwordInteractiveToItem(ItemStack itemStack) {
        List<Material> items = new ArrayList<>();

        items.add(Material.WORKBENCH);
        items.add(Material.FURNACE);
        items.add(Material.BURNING_FURNACE);
        items.add(Material.STORAGE_MINECART);
        items.add(Material.CHEST);
        items.add(Material.ENDER_CHEST);
        items.add(Material.HOPPER);
        items.add(Material.HOPPER_MINECART);
        items.add(Material.DROPPER);
        items.add(Material.DISPENSER);
        items.add(Material.ENCHANTMENT_TABLE);
        items.add(Material.CAULDRON);
        items.add(Material.BEACON);
        items.add(Material.ANVIL);
        items.add(Material.DARK_OAK_DOOR);
        items.add(Material.ACACIA_DOOR);
        items.add(Material.BIRCH_DOOR);
        items.add(Material.JUNGLE_DOOR);
        items.add(Material.SPRUCE_DOOR);
        items.add(Material.TRAP_DOOR);
        items.add(Material.WOOD_DOOR);
        items.add(Material.WOODEN_DOOR);
        items.add(Material.COMMAND);
        items.add(Material.COMMAND_CHAIN);
        items.add(Material.COMMAND_MINECART);
        items.add(Material.COMMAND_REPEATING);
        items.add(Material.BLACK_SHULKER_BOX);
        items.add(Material.BLUE_SHULKER_BOX);
        items.add(Material.BROWN_SHULKER_BOX);
        items.add(Material.CYAN_SHULKER_BOX);
        items.add(Material.GRAY_SHULKER_BOX);
        items.add(Material.GREEN_SHULKER_BOX);
        items.add(Material.LIGHT_BLUE_SHULKER_BOX);
        items.add(Material.LIME_SHULKER_BOX);
        items.add(Material.MAGENTA_SHULKER_BOX);
        items.add(Material.ORANGE_SHULKER_BOX);
        items.add(Material.PINK_SHULKER_BOX);
        items.add(Material.PURPLE_SHULKER_BOX);
        items.add(Material.RED_SHULKER_BOX);
        items.add(Material.SILVER_SHULKER_BOX);
        items.add(Material.WHITE_SHULKER_BOX);
        items.add(Material.YELLOW_SHULKER_BOX);
        items.add(Material.BOAT);
        items.add(Material.BOAT_JUNGLE);
        items.add(Material.BOAT_SPRUCE);
        items.add(Material.BOAT_ACACIA);
        items.add(Material.BOAT_BIRCH);
        items.add(Material.BOAT_DARK_OAK);

        return items.contains(itemStack.getType());
    }
}
