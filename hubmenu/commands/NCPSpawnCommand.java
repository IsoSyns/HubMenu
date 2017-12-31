package hubmenu.commands;

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

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Villager.Profession;


public class NCPSpawnCommand implements CommandExecutor {
	
	 public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
     if (sender.hasPermission("server.hub.admin"))
         if(cmd.getName().equalsIgnoreCase("shops")){
             if(args.length == 1){
                 if(args[0].equalsIgnoreCase("petshop")){
                     Player player = (Player) sender;
                     Villager petvillager = (Villager) player.getLocation().getWorld().spawn(player.getLocation(), Villager.class);
                     petvillager.setCustomNameVisible(true);
                     petvillager.setCustomName("§4§lPet Shop");
                     petvillager.setCanPickupItems(false);
                     petvillager.setAdult();
                     petvillager.setProfession(Profession.BUTCHER);
                     petvillager.setBreed(false);
                  }
                  if(args[0].equalsIgnoreCase("hatshop")){
                   Player player1 = (Player) sender;
                      Villager hatvillager = (Villager) player1.getLocation().getWorld().spawn(player1.getLocation(), Villager.class);
                      hatvillager.setCustomNameVisible(true);
                      hatvillager.setCustomName("§2§lHat Shop");
                      hatvillager.setCanPickupItems(false);
                      hatvillager.setAdult();
                      hatvillager.setProfession(Profession.LIBRARIAN);
                      hatvillager.setBreed(false);
                  }
                  if(args[0].equalsIgnoreCase("trailshop")){
                      Player player2 = (Player) sender;
                      Villager trailsvillager = (Villager) player2.getLocation().getWorld().spawn(player2.getLocation(), Villager.class);
                      trailsvillager.setCustomNameVisible(true);
                      trailsvillager.setCustomName("§3§lTrail Shop");
                      trailsvillager.setCanPickupItems(false); 
                      trailsvillager.setAdult();
                      trailsvillager.setProfession(Profession.PRIEST);
                      trailsvillager.setBreed(false);
                  }
                  if(args[0].equalsIgnoreCase("perkshop")){
                      Player player3 = (Player) sender;
                      Villager perkvillager = (Villager) player3.getLocation().getWorld().spawn(player3.getLocation(), Villager.class);
                      perkvillager.setCustomNameVisible(true);
                      perkvillager.setCustomName("§a§lPerk Shop");
                      perkvillager.setCanPickupItems(false);
                      perkvillager.setAdult();
                      perkvillager.setProfession(Profession.BLACKSMITH);
                      perkvillager.setBreed(false);
                  }
                  if(args[0].equalsIgnoreCase("wardrobeshop")){
                      Player player4 = (Player) sender;
                      Villager wardrobevillager = (Villager) player4.getLocation().getWorld().spawn(player4.getLocation(), Villager.class);
                      wardrobevillager.setCustomNameVisible(true);
                      wardrobevillager.setCustomName("§5§lWardrobe");
                      wardrobevillager.setCanPickupItems(false);
                      wardrobevillager.setAdult();
                      wardrobevillager.setProfession(Profession.FARMER);
                      wardrobevillager.setBreed(false);
                 }
                  if(args[0].equalsIgnoreCase("voteshop")){
                      Player player5 = (Player) sender;
                      Villager voteshopvillager = (Villager) player5.getLocation().getWorld().spawn(player5.getLocation(), Villager.class);
                      voteshopvillager.setCustomNameVisible(true);
                      voteshopvillager.setCustomName("§6§lVote Menu");
                      voteshopvillager.setCanPickupItems(false);
                      voteshopvillager.setAdult();
                      voteshopvillager.setProfession(Profession.PRIEST);
                      voteshopvillager.setBreed(false);
          		}
                  if (args.length == 0)
        	      {
                	Player player = (Player) sender;
        	        player.sendMessage(ChatColor.DARK_AQUA + " ->NCP Spawn Commands <- ");
        	        player.sendMessage(ChatColor.DARK_AQUA + "/shops petshop");
        	        player.sendMessage(ChatColor.DARK_AQUA + "/shops hatshop");
        	        player.sendMessage(ChatColor.DARK_AQUA + "/shops trailshop");
        	        player.sendMessage(ChatColor.DARK_AQUA + "/shops perkshop");
        	        player.sendMessage(ChatColor.DARK_AQUA + "/shops voteshop");
        	        player.sendMessage(ChatColor.DARK_AQUA + "/shops wardrobeshop");
        	      }
        	      if (args.length >= 2)
        	      {
        	    	Player player = (Player) sender;
        	        player.sendMessage(ChatColor.RED + "Invalid arguments.");
        	        player.sendMessage(ChatColor.RED + "Type /shops for help.");
        	      }
        	    }
        	    return true;
        	  }
          		return false;
	 }
}
