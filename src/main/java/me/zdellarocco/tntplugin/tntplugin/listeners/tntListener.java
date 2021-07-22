package me.zdellarocco.tntplugin.tntplugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class tntListener implements Listener {

    @EventHandler
    public void blockPlaceEvent(BlockPlaceEvent event) {
        Block block = event.getBlock();
        Material material = block.getType();
        Player player = event.getPlayer();

        if(material.equals(Material.TNT) && !player.isOp()) {
            block.setType(Material.AIR);
            player.sendMessage(ChatColor.RED + (ChatColor.BOLD + (ChatColor.ITALIC + "You can not place that block :(")));
        }
    }

}
