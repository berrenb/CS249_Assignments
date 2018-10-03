/*
 Created by Bryan Berrent
 
 The Player class uses getter and setter
 functions for the position of the player,
 the health of the player and the currentWeapon.
 The Player class also works with an ArrayList called inventory.
 Finally, the Player class has adding an item, removing an item and printing the ArrayList methods
 */
import java.util.ArrayList;

public class Player{

	private int x = 0;
	private int y = 0;
	private int health = 100;
	private String currentWeapon = "No weapon";
	ArrayList<Item> inventory = new ArrayList<>();
	
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
	
	public void addItem(Item myItem){
		inventory.add(myItem);
	}
	
	public void removeItem(Item myItem){
		inventory.remove(myItem);
	}
	
	public void printInventory(ArrayList<Item> inv){
		for(int i = 0; i < inventory.size();i++){
			System.out.println("////////");
			System.out.println(inventory.get(i));
		} 
	}
	
}
