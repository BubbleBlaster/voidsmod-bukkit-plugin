package voidsmod.voidsmod;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

public class MidasTouch {
    public static void doMidasTouch(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Block b = p.getTargetBlock(null, 20);
        if (b.getType() == Material.AIR) {
            return;
        } else if (b.getType() == Material.BEDROCK) {
            return;
        } else {
            b.setType(Material.GOLD_BLOCK);
        }
    }
}
