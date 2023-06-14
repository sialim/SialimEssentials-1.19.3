package me.sialim.sialimessentials;

import me.sialim.sialimessentials.commands.HurtCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class SialimEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[SialimEssentials] Plugin successfully booted with no fatal errors.");
        getCommand("hurt").setExecutor(new HurtCommand());
    }
}
