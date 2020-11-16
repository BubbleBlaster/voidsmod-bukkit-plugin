package voidsmod.voidsmod;

import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

public class EnderStaff {
    public static void teleportPlayer(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        p.launchProjectile(EnderPearl.class);
    }
}
