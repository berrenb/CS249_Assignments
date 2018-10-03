/*
 Created by Bryan Berrent
 
 The Orc class contains a constructor with a
 super call to the Monster class
 The Orc class also has a drawToMap method which draws
 an 'o' to a map's specific (x,y) coordinates.
 */

import java.util.Scanner;

public class Orc extends Monster{
	
	public Orc(){}
	
	public Orc(int x,int y, int health){
		super(x,y,health);
	}
	public void drawToMap(Map screen) {
		
		if(screen == null){
			return;
		}
		screen.setMapLocation(this.getX(), this.getY(), 'o');
	}

	public void load(Scanner input) throws Exception {
		
		
	}
}
