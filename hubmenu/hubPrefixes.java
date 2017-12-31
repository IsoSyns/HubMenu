package hubmenu;

import hubmenu.creditsSTG.CreditsAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEntityEvent;

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

public class hubPrefixes {
	
	private static PlayerInteractEntityEvent e;
	
	static Player p = e.getPlayer();
	
	//ChatPrefixes
	public static String CREDITS = "§6Credits §9> ";
	public static String PETS = "§4Pets §9> ";
	public static String HATS = "§2Hats §9> ";
	public static String TRAILS = "§5Trails §9> ";
	public static String PERKS = "§dPerks §9> ";
	public static String HUB = "§aHub §9> ";
	public static String COOLDOWN = "§cWait 2 Seconds Before Performing that action again.";
	public static String VOTEING = "§1Voteing §9> ";
	public static String ERROR = "§cAn Error Has Happened?!? Contact Adminstration Please :)";
	public static String NOPERMS = "§4You have no permissions.";
	
	//CreditPrefixes
	public static int yourcredits  = CreditsAPI.getManager().getCredits(p.getName());
	
	public static String Vars(String s, Player p){
		String r = s;

		r = r.replace("%PLAYER%", p.getName());
		r = r.replace("%PLAYERNICK%", p.getDisplayName());
		
		return r;

	}

}
