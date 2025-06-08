package dev.klayses.clearChat.commands;

import dev.klayses.clearChat.Main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ClearChatCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender.hasPermission(Main.clearchat_perm_use)) {
            for (Player player : Bukkit.getOnlinePlayers()) {
                for (int i = 0; i < 256; i++) {
                    player.sendMessage("");
                }
                player.sendMessage(ChatColor.of("#ff4400") + "The chat has been cleared!");
                player.playSound(player, Sound.ENTITY_VILLAGER_WORK_CARTOGRAPHER, 1, 1);
            }
        } else {
            sender.sendMessage(ChatColor.of("#ff4400") + Main.NO_PERMISSION_MESSAGE);
        }
        return false;
    }
}
