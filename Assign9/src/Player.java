/*
 Created by Bryan Berrent
 
 The Player class uses getter and setter
 functions for the position of the player,
 the health of the player and the currentWeapon.
 The Player class also works with an ArrayList called inventory.
 Finally, the Player class has adding an item, removing an item and printing the ArrayList methods
 */

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Player{
	private IntegerProperty x = new SimpleIntegerProperty(0); 
	private IntegerProperty y = new SimpleIntegerProperty(0);
	private int health = 100;
	private String currentWeapon = "No weapon";
	
	
	public Player(int xVal, int yVal){
		
		x.setValue(xVal);
		y.setValue(yVal);
	}
	
	
	
	public String getPosition(){
		return x + " " + y;
	}
	
	public void setPosition(int xVal, int yVal){
		x.setValue(xVal);
		y.setValue(yVal);
	}
	
	public int getHealth(){
		return health;
	}
	
	public void setHealth(int h){
		h = health;
	}
	
	public String getCurrentWeapon(){
		return currentWeapon;
	}
	
	public void setCurrentWeapon(String cW){
		currentWeapon = cW;
	}
	
	public IntegerProperty getX(){
		return x;
	}
	
	public IntegerProperty getY(){
		return y;
	}
	
	
}
