package voidsmod.voidsmod;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Voidsmod extends JavaPlugin {
    @Override
    public void onEnable() {
        CustomItems cs = new CustomItems();
        cs.createCustomItems();

        Listener listener = new Listener() {
            @EventHandler
            public void onPlayerMove(PlayerMoveEvent e) {
                ArmorSetBonus.checkForSetBonus(e);
            }
            @EventHandler
            public void onPlayerInteract(PlayerInteractEvent e) {
                Player p = e.getPlayer();
                if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("midas " +
                        "touch")) {
                    MidasTouch.doMidasTouch(e);
                }
                if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("ender" +
                        " " +
                        "staff")) {
                    EnderStaff.teleportPlayer(e);
                }
            }
        };
        Bukkit.getPluginManager().registerEvents(listener, this);
    }
}
