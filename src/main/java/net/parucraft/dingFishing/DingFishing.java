package net.parucraft.dingFishing;

import net.parucraft.dingFishing.commands.ToggleCommand;
import net.parucraft.dingFishing.listeners.FishBiteListener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * <h1>DingFishing</h1>
 * Plays a sound for a player when a fish bites
 * @author ParuPatch
 */
public final class DingFishing extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("================================");
        System.out.println("DingFishing Successfully Enabled");
        System.out.println("================================");
        getCommand("dftoggle").setExecutor(new ToggleCommand());
        getServer().getPluginManager().registerEvents(new FishBiteListener(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("=================================");
        System.out.println("DingFishing Successfully Disabled");
        System.out.println("=================================");
    }
}
