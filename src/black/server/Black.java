package black.server;

import org.bukkit.plugin.java.*;

public class Black extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("status").setExecutor(new Status());
        getCommand("server").setExecutor(new Status());
    }

    @Override
    public void onDisable() {

    }
}