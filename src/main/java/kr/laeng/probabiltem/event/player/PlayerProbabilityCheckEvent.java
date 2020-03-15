package kr.laeng.probabiltem.event.player;

import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerProbabilityCheckEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;

    private final String previousEventName;
    private final PlayerInteractEvent playerInteractEvent;
    private final double probability;
    private double extraPoint;

    public PlayerProbabilityCheckEvent(PlayerInteractEvent previousEvent, double probability, double extraPoint) {
        super(previousEvent.getPlayer());
        this.previousEventName = previousEvent.getEventName();
        this.playerInteractEvent = previousEvent;

        this.probability = probability;
        this.extraPoint = extraPoint;

    }

    public String getPreviousEventName() {
        return previousEventName;
    }

    public PlayerInteractEvent getPlayerInteractEvent() {
        return playerInteractEvent;
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
