package black.server;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Status implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equals("status")) {
            sender.sendMessage("");
            sender.sendMessage("§fInformações do servidor:");
            sender.sendMessage("");
            sender.sendMessage("§fPlayers: §a" + Bukkit.getOnlinePlayers().size());
            sender.sendMessage("§fVersão do servidor: §a" + Bukkit.getServer().getVersion().split(": ")[1].replaceAll("\\)", ""));
            sender.sendMessage("§fTps: §a");
            sender.sendMessage("§fRam: §a");
            sender.sendMessage("§fCpus: §a" + Runtime.getRuntime().availableProcessors());
            sender.sendMessage("");
        }
        if (label.equals("server")) {
            sender.sendMessage("");
            sender.sendMessage("§fInformações do servidor:");
            sender.sendMessage("");
            sender.sendMessage("§fPlayers: §a" + Bukkit.getOnlinePlayers().size());
            sender.sendMessage("§fVersão do servidor: §a" + Bukkit.getServer().getVersion().split(": ")[1].replaceAll("\\)", ""));
            sender.sendMessage("§fTps: §a");
            sender.sendMessage("§fRam: §a");
            sender.sendMessage("§fCpus: §a" + Runtime.getRuntime().availableProcessors());
            sender.sendMessage("");
        }
        return false;
    }
}