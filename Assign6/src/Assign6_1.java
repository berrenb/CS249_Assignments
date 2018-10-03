/*
 Created by Bryan Berrent
 The main class to test the Item, Player and Weapon classes
 */
import java.util.*;

public class Assign6_1 {
	

	public static void main(String args[]){
		
		String input = " ";
		String exit = "None";
		
		//Creates a player instance
		Player player = new Player(3,3);
		
		String itemName = "";
		int weight = 0;
		int value = 0;
		int damage = 0;
		
		//Creates scanner
		Scanner scan = new Scanner(System.in);
		
		while(!itemName.equals(exit)){
			System.out.println("Enter an item name, weight and value");
			itemName=scan.next();
			
			//Checks if the user inputs None to exit out of the loop
			if(itemName.equals(exit)){
				continue;
			}
			else{
				weight=scan.nextInt();
				value=scan.nextInt();
			System.out.println("Is this a weapon?[Y/N]");
			input=scan.next();
			}
			if(input.equals("N")){
				//Creates an item instances and adds it to the player instance called player
				Item myItem = new Item(itemName,weight,value);
				player.addItem(myItem);
			
			}
			if(input.equals("Y")){
				System.out.println("Enter the damage: ");
				damage=scan.nextInt();
				//Creates a weapon  instances and adds it to the player instance called player
				Weapon myWeapon = new Weapon(itemName,weight,value,damage);
				player.addItem(myWeapon);
			
			}
		}
		
		//Prints the inventory
		player.printInventory(player.inventory);
		
	}
}
