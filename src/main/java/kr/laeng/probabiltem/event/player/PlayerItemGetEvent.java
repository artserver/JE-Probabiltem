package kr.laeng.probabiltem.event.player;

import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class PlayerItemGetEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;

    private final String previousEventName;
    private final BlockBreakEvent blockBreakEvent;
    private final EntityDeathEvent entityDeathEvent;
    private List<ItemStack> successItems;
    private List<ItemStack> failItems;
    private final double probability;
    private double extraPoint;

    public PlayerItemGetEvent(BlockBreakEvent previousEvent, double probability, double extraPoint, List<ItemStack> successItems, List<ItemStack> failItems) {
        super(previousEvent.getPlayer());

        this.previousEventName = previousEvent.getEventName();
        this.blockBreakEvent = previousEvent;
        this.entityDeathEvent = null;

        this.probability = probability;
        this.extraPoint = extraPoint;
        this.successItems = successItems;
        this.failItems = failItems;
    }

    public PlayerItemGetEvent(EntityDeathEvent previousEvent, double probability, double extraPoint, List<ItemStack> successItems, List<ItemStack> failItems) {
        super(previousEvent.getEntity().getKiller());

        this.previousEventName = previousEvent.getEventName();
        this.blockBreakEvent = null;
        this.entityDeathEvent = previousEvent;

        this.probability = probability;
        this.extraPoint = extraPoint;
        this.successItems = successItems;
        this.failItems = failItems;
    }

    public String getPreviousEventName() {
        return previousEventName;
    }

    public BlockBreakEvent getBlockBreakEvent() {
        return blockBreakEvent;
    }

    public EntityDeathEvent getEntityDeathEvent() {
        return entityDeathEvent;
    }

    public double getProbability() {
        return this.probability;
    }

    public double getExtraPoint() {
        return this.extraPoint;
    }

    public void setExtraPoint(double extraPoint) {
        this.extraPoint = extraPoint;
    }

    public double addExtraPoint(double extraPoint) {
        this.extraPoint += extraPoint;
        return this.extraPoint;
    }

    public List<ItemStack> getSuccessItems() {
        return successItems;
    }

    public void setSuccessItems(List<ItemStack> successItems) {
        this.successItems = successItems;
    }

    public List<ItemStack> getFailItems() {
        return failItems;
    }

    public void setFailItems(List<ItemStack> failItems) {
        this.failItems = failItems;
    }

    public boolean isCancelled() {
        return this.cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
