/*
 Created by Bryan Berrent
 
 The Spider class contains a constructor with a
 super call to the Monster class
 The Spider class also has a drawToMap method which draws
 an 's' to a map's specific (x,y) coordinates.
 */
import java.util.Scanner;

public class Spider extends Monster{
	public Spider(){}
	
	public Spider(int x, int y, int health){
		super(x,y,health);
	}


	public void drawToMap(Map screen) {
		if(screen == null){
			return;
		}
		screen.setMapLocation(this.getX(), this.getY(), 's');
		
	}

	@Override
	public void load(Scanner input) throws Exception {
	
		
	}

}
