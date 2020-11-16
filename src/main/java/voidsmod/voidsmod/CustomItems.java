package voidsmod.voidsmod;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;

public class CustomItems implements Listener {

    public void createCustomItems() {
        ItemStack enderStaff = new ItemStack(Material.STICK, 1);
        ItemMeta meta = enderStaff.getItemMeta();
        List<String> enderStaff_lore = new ArrayList<String>();
        enderStaff_lore.add("VOIDSMOD: infinite ender pearls!");
        meta.setLore(enderStaff_lore);
        meta.setDisplayName("Ender Staff");
        enderStaff.setItemMeta(meta);
        enderStaff_lore.add("A staff of the elder gods...");
        enderStaff.getItemMeta().setLore(enderStaff_lore);

        ShapedRecipe r = new ShapedRecipe(enderStaff);
        r.shape(" ca"," bc","b  ");
        r.setIngredient('a', Material.DIAMOND);
        r.setIngredient('b', Material.BLAZE_ROD);
        r.setIngredient('c', Material.ENDER_PEARL);
        Voidsmod.getPlugin(Voidsmod.class).getServer().addRecipe(r);
    }
}