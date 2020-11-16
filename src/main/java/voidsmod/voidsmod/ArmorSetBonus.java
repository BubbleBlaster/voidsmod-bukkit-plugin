package voidsmod.voidsmod;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;

public class ArmorSetBonus {
    public static void checkForSetBonus(PlayerMoveEvent e) {
        Player p = e.getPlayer();

        ItemStack helmet = p.getInventory().getHelmet();
        ItemStack chest = p.getInventory().getChestplate();
        ItemStack leggings = p.getInventory().getLeggings();
        ItemStack boots = p.getInventory().getBoots();

        if (helmet == null || chest == null || leggings == null || boots == null) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);

            List<Entity> ent;
            ent = p.getNearbyEntities(40,40,40);
            for (Entity entity: ent) {
                entity.setGlowing(false);
            }
            return;
        }

        if (helmet.getType() == Material.IRON_HELMET
                && chest.getType() == Material.IRON_CHESTPLATE
                && leggings.getType() == Material.IRON_LEGGINGS
                && boots.getType() == Material.IRON_BOOTS) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 0));
        }

        if (helmet.getType() == Material.DIAMOND_HELMET
                && chest.getType() == Material.DIAMOND_CHESTPLATE
                && leggings.getType() == Material.DIAMOND_LEGGINGS
                && boots.getType() == Material.DIAMOND_BOOTS) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 0));
            p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000000, 0));
        }

        if (helmet.getType() == Material.CHAINMAIL_HELMET
                && chest.getType() == Material.CHAINMAIL_CHESTPLATE
                && leggings.getType() == Material.CHAINMAIL_LEGGINGS
                && boots.getType() == Material.CHAINMAIL_BOOTS) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 1));
        }

        if (helmet.getType() == Material.LEATHER_HELMET
                && chest.getType() == Material.LEATHER_CHESTPLATE
                && leggings.getType() == Material.LEATHER_LEGGINGS
                && boots.getType() == Material.LEATHER_BOOTS) {
            List<Entity> ent = new ArrayList<Entity>();
            ent = p.getNearbyEntities(40,40,40);
            for (Entity entity: ent) {
                entity.setGlowing(true);
            }
        }
    }
}
