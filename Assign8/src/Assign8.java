/*
 Created by Bryan Berrent
 
 Assign 8 tests the Loadable, Orc, Spider, Map, 
 Drawable and Monster classes. 
 */

import java.io.File;
import java.util.*;
public class Assign8 {
	public static void main (String args[]){
		try{
			//Creates a scanner to get the users preferred level
			Scanner scan = new Scanner(System.in);
			System.out.println("What level number do you want?");
			String levelName = scan.nextLine();
			
			//Scanner to open a Map.txt and creates an instance of Map
			Scanner inputMap = new Scanner(new File("Map"+levelName+".txt"));
			Map baseMap = new Map();
			baseMap.load(inputMap);
			
			//Scanner to open a Monster.txt and get the number of Monsters
			Scanner inputMonsters = new Scanner(new File("Monsters"+levelName+".txt"));
			int numOfMonsters = inputMonsters.nextInt();
			
			//Creates an ArrayList of Monsters
			ArrayList<Monster> monsters = new ArrayList<>();
			
			/*
			 Loops through the number of Monsters
			 Draws them accordingly to the map based on the type
			 */
			for(int i = 0; i < numOfMonsters; i++){
				String type = inputMonsters.next();
				Monster m = null;
				if(type.equals("Orc")){
					Orc o = new Orc();
					m = o;
					m.setX(inputMonsters.nextInt());
					m.setY(inputMonsters.nextInt());
					m.setHealth(inputMonsters.nextInt());
				}
				if(type.equals("Spider")){
					Spider s = new Spider();
					m = s;
					m.setX(inputMonsters.nextInt());
					m.setY(inputMonsters.nextInt());
					m.setHealth(inputMonsters.nextInt());
				}
				if(type.equals(null)){
					type = inputMonsters.next();
				}
				m.drawToMap(baseMap);
			}
		
			baseMap.draw();
		
		}
		catch(Exception e){
			System.err.println("Game error");
			e.printStackTrace(System.out);
		}
		
	}
}
