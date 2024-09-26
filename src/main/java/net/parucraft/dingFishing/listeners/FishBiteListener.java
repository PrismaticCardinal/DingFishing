package net.parucraft.dingFishing.listeners;
import net.parucraft.dingFishing.commands.ToggleCommand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.Sound;
import org.bukkit.event.player.PlayerFishEvent;

/**
 * <h1>FishBiteListener</h1>
 * Listens for when a fish bites
 */
public class FishBiteListener implements Listener{
    /**
     * <h1>onFishBite</h1>
     * Plays a noise when a fish bites if /dftoggle is enabled
     * @param event
     */
    @EventHandler
    public void onFishBite(PlayerFishEvent event) {
        Player player = event.getPlayer();
        if(ToggleCommand.getIsEnabled(player) && event.getState() == PlayerFishEvent.State.BITE) {
            player.getWorld().playSound(player.getLocation(),Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
        }
    }
}
