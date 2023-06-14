package me.sialim.sialimessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HurtCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(sender instanceof Player p){
            if(args.length==0){
                p.sendMessage(ChatColor.GREEN + "[SialimEssentials/Success] Player " + p.getDisplayName() + " eliminated by " + p.getDisplayName());
                p.setHealth(0.0);
            }else{
                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);
                if(target==null){
                    p.sendMessage(ChatColor.RED + "[SialimEssentials/Error] Invalid argument. Target offline/non-existent.");
                }else{
                    p.sendMessage(ChatColor.GREEN + "[SialimEssentials/Success] Player " + target.getDisplayName() + " eliminated by " + p.getDisplayName());
                    target.sendMessage(ChatColor.GREEN + "[SialimEssentials/Success] Player " + target.getDisplayName() + " eliminated by " + p.getDisplayName());
                    target.setHealth(0.0);
                }
            }
        }

        return true;
    }
}
