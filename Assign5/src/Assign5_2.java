/*
 Created by Bryan Berrent
 This class implements functions from
 the Player class and the Weapon class
 */
public class Assign5_2 {

	public static void main(String[] args) {
		
		//Creates an instance of the Weapon class
		Weapon sword = new Weapon("Common Sword",50);
		
		//Creates an instance of the Weapon class
		Weapon coolSword = new Weapon("Glamdring, the Foe-Hammer",1500);
		
		//Creates an instance of the Player class
		Player player = new Player(100,100);
		
		//Prints the Current Weapon
		System.out.println(player.getCurrentWeapon());
		
		//Sets the current Weapon name of the player
		player.setCurrentWeapon(sword.getName());
		
		//Prints the Current Weapon
		System.out.println(player.getCurrentWeapon());
		
		//Sets the current Weapon name of the player
		player.setCurrentWeapon(coolSword.getName());
		
		//Prints the Current Weapon
		System.out.println(player.getCurrentWeapon());
	}

}
