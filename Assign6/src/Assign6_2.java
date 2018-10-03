/*
 Created by Bryan Berrent
 The main class to test the Map class
 */
public class Assign6_2 {
	public static void main(String args[]){
		//Creates an instance of the Map class
		Map map = new Map(10,20);
		
		//Creates an instance of the Map class
		Map display = new Map(10,20);
		
		map.setMapLocation(2, 1, '%');
		
		map.copyTo(display);
		
		display.setMapLocation(3, 4, '@');
		
		//Outputs display
		display.draw();
	}
}
