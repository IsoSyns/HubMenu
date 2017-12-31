package hubmenu;

import hubmenu.commands.NCPSpawnCommand;
import hubmenu.creditsSTG.CreditsAPI;
import hubmenu.creditsSTG.CreditsCommand;
import hubmenu.files.ConfigManager;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import hubmenu.hatsGUI.HatShop;

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

public class Main extends JavaPlugin implements Listener {

	Plugin pl;
	public static Plugin PLUGIN;
	public static Main plugin;
	
	int num = 1;
	String isEnabled;
	private Inventory CompassMenuInv;
	
	public static Main getPlugin(){
		return plugin;
	}
	
	public static HatShop hm;
	
        @Override
        public void onEnable() {
        	this.pl = this;
			this.saveConfig();
			plugin = this;
			try{
				ConfigManager.load(this, "config.yml");
				ConfigManager.load(this, "hatsGUI.yml");
				ConfigManager.load(this, "pets.yml");
				ConfigManager.load(this, "trails.yml");
				ConfigManager.load(this, "perks.yml");
				ConfigManager.load(this, "compassmenu.yml");
				getServer().getPluginManager().registerEvents(this, this);
	            Bukkit.getPluginManager().registerEvents(this, this);
	            
	            Bukkit.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
	            this.CompassMenuInv = Bukkit.createInventory(null, 9, getConfig().getString("Menu-Name").replaceAll("&", "§"));
				saveDefaultConfig();
	            
	            this.isEnabled = getConfig().getString("Menu-Name");

	            getCommand("shops").setExecutor(new NCPSpawnCommand());
	            getCommand("creditsSTG").setExecutor(new CreditsCommand());
				CreditsAPI.getManager().loadConfig();
				
				startAutoSaveTask();
				
				hm = new HatShop();
				
			}catch (Exception e){
	            e.printStackTrace();
	            getServer().getPluginManager().disablePlugin(this);
	        }
			
		}
        
        public void startAutoSaveTask(){
            new BukkitRunnable(){
                public void run(){
                    System.out.println(" Saving Credits Config...");
                    saveConfig();
                    System.out.println(" Saving Complete!");
                }
            }.runTaskTimer(Main.getPlugin(), 20*10, 20*60*5);
        }
    	
    	public void onDisable(){
            this.saveConfig();
        }
    }