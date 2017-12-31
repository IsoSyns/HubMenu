package hubmenu.menuGUI;

/*
 * The MIT License
 *
 * Copyright 2016 BadEntities.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import hubmenu.creditsSTG.CreditsAPI;
import hubmenu.wardrobeGUI.WardrobeShop;

public class AccessoriesMenu implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§4Pet Shop")) {
			e.setCancelled(true);
		}else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("3Hat Shop")) {
			e.setCancelled(true);
		}else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§6Trail Shop")) {
			e.setCancelled(true);
		}else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§bPerk Shop")) {
			e.setCancelled(true);
		}else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§aWardrobe Shop")) {
			e.setCancelled(true);
			p.closeInventory();
			WardrobeShop.openWardrobeShop(p);
		}else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§aHead Shop")) {
			e.setCancelled(true);
		}else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§aVote Shop")) {
			e.setCancelled(true);
		}else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§aPlayer Info")) {
			e.setCancelled(true);
		}
	}
	
	public void Accessories(Player p) {
		Inventory Accessories = Bukkit.createInventory(null, 27, "Accessories Menu");
		//Pets
		ItemStack AccessoriesPet = new ItemStack(Material.BONE, 1);
		ItemMeta AccessoriesPetmeta = AccessoriesPet.getItemMeta();
		AccessoriesPetmeta.setDisplayName("§4Pet Shop");
		AccessoriesPetmeta.setLore(Arrays.asList("§eNeed A New Pet? Click Me! "));
		AccessoriesPet.setItemMeta(AccessoriesPetmeta);
		Accessories.setItem(1, AccessoriesPet);
		//Hats
		ItemStack AccessoriesHat = new ItemStack(Material.GOLD_HELMET, 1);
		ItemMeta AccessoriesHatmeta = AccessoriesHat.getItemMeta();
		AccessoriesHatmeta.setDisplayName("§3Hat Shop");
		AccessoriesHatmeta.setLore(Arrays.asList("§cNeed A New Hat? Click Me!"));
		AccessoriesHat.setItemMeta(AccessoriesHatmeta);
		Accessories.setItem(3, AccessoriesHat);
		//Trails
		ItemStack AccessoriesTrail = new ItemStack(Material.EXP_BOTTLE, 1);
		ItemMeta AccessoriesTrailmeta = AccessoriesTrail.getItemMeta();
		AccessoriesTrailmeta.setDisplayName("§6Trail Shop");
		AccessoriesTrailmeta.setLore(Arrays.asList("§cNeed A New Trail? Click Me!"));
		AccessoriesTrail.setItemMeta(AccessoriesTrailmeta);
		Accessories.setItem(5, AccessoriesTrail);
		//Perks
		ItemStack AccessoriesPerk = new ItemStack(Material.NAME_TAG, 1);
		ItemMeta AccessoriesPerkmeta = AccessoriesPerk.getItemMeta();
		AccessoriesPerkmeta.setDisplayName("§bPerk Shop");
		AccessoriesPerkmeta.setLore(Arrays.asList("§cNeed Some New Cool Features? Click Me!"));
		AccessoriesPerk.setItemMeta(AccessoriesPerkmeta);
		Accessories.setItem(7, AccessoriesPerk);
		//Wardrobe
		ItemStack AccessoriesWardrobe = new ItemStack(Material.NAME_TAG, 1);
		ItemMeta AccessoriesWardrobemeta = AccessoriesWardrobe.getItemMeta();
		AccessoriesWardrobemeta.setDisplayName("§bWardrobe Shop");
		AccessoriesWardrobemeta.setLore(Arrays.asList("§cNeed Some Cool Clothes? Click Me!"));
		AccessoriesWardrobe.setItemMeta(AccessoriesWardrobemeta);
		Accessories.setItem(9, AccessoriesWardrobe);
		//Head Shop
		ItemStack AccessoriesHeads = new ItemStack(Material.SKULL, 1);
		ItemMeta AccessoriesHeadsmeta = AccessoriesHeads.getItemMeta();
		AccessoriesHeadsmeta.setDisplayName("§bHead Shop");
		AccessoriesHeadsmeta.setLore(Arrays.asList("§cWant Someones Head? Click Me!"));
		AccessoriesHeads.setItemMeta(AccessoriesHeadsmeta);
		Accessories.setItem(11, AccessoriesHeads);
		//Voting
		ItemStack AccessoriesVote = new ItemStack(Material.BOOK, 1);
		ItemMeta AccessoriesVotemeta = AccessoriesVote.getItemMeta();
		AccessoriesVotemeta.setDisplayName("§bVoting Shop");
		AccessoriesVotemeta.setLore(Arrays.asList("§cWant To Vote For Free Rewards? Click Me!"));
		AccessoriesVote.setItemMeta(AccessoriesVotemeta);
		Accessories.setItem(13, AccessoriesVote);
		//Player Info
		ItemStack AccessoriesInfo = new ItemStack(Material.PAPER, 1);
		ItemMeta AccessoriesInfometa = AccessoriesInfo.getItemMeta();
		AccessoriesInfometa.setDisplayName("§bPlayer Info");
		AccessoriesInfometa.setLore(Arrays.asList("§2Name: §e" + p.getName()));
		AccessoriesInfometa.setLore(Arrays.asList("§3Rank: "));
		AccessoriesInfometa.setLore(Arrays.asList("§6Credits: " + CreditsAPI.getManager().getCredits(p.getName())));
		AccessoriesInfo.setItemMeta(AccessoriesInfometa);
		Accessories.setItem(15, AccessoriesInfo);
		p.openInventory(Accessories);
	}
	
}