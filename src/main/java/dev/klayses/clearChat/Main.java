package dev.klayses.clearChat;

import dev.klayses.clearChat.commands.ClearChatCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static String NO_PERMISSION_MESSAGE = "You do not have permission to execute this command!";
    public static String clearchat_perm_use = "clearchat.use";

    @Override
    public void onEnable() {
        getLogger().info("ClearChat Plugin enabled!");
        getLogger().info("Author: Mynny");
        getLogger().info("Discord: http://discord.seasonworld.net");

        this.getCommand("clearchat").setExecutor(new ClearChatCommand());

    }

    @Override
    public void onDisable() {
        getLogger().info("ClearChat Plugin disabled!");
    }
}
