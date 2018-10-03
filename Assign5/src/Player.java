/*
 Created by Bryan Berrent
 The Player class uses getter and setter
 functions for the position of the player,
 the health of the player and the currentWeapon
 */
public class Player{

	private int x = 0;
	private int y = 0;
	private int health = 100;
	private String currentWeapon = "No weapon";
	
	public Player(int xVal, int yVal){
		
		x = xVal;
		y = yVal;
	}
	
	
	
	public String getPosition(){
		return x + " " + y;
	}
	
	public void setPosition(int xVal, int yVal){
		x = xVal;
		y = yVal;
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
	
}
