package com.iridium.iridiumcore.multiversion;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class IridiumInventory_V1_9_R1 extends IridiumInventory {
    @Override
    public Inventory getTopInventory(Player player) {
        return player.getOpenInventory().getTopInventory();
    }
}