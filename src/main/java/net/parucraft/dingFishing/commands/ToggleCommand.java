package net.parucraft.dingFishing.commands;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import java.util.UUID;
import java.util.HashMap;

/**
 * <h1>ToggleCommand</h1>
 * Toggles DingFishing on/off for the player
 * @author ParuPatch
 */
public class ToggleCommand implements CommandExecutor {
    private static final HashMap<UUID, Boolean> playerToggleMap = new HashMap<>();
    private static boolean isEnabled = false; //Variable for if DingFishing is enabled for the player

    /**
     * <h1>getIsEnabled</h1>
     * Getter method for isEnabled
     * @param player
     * @return If dftoggle is enabled
     */
    public static boolean getIsEnabled(Player player) {
        return playerToggleMap.getOrDefault(player.getUniqueId(), false);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("dftoggle")) {
            if(sender instanceof Player player) {
                UUID playerId = player.getUniqueId();
                boolean isEnabled = playerToggleMap.getOrDefault(playerId, false);
                playerToggleMap.put(playerId, !isEnabled);
                player.sendMessage("DingFishing has been " + (!isEnabled ? "enabled" : "disabled"));
            }
        }
        return true;
    }
}
