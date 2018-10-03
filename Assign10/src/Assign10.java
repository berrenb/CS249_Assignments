/*
 Created by Bryan Berrent
 
 -The Assign10 class tests the Unit, Army, Orc and Human classes
 */
import java.util.Scanner;

public class Assign10 {
	public static void main(String[] args){
		int numOfHuman = 0;
		int numOfOrc = 0;
		
		//Creates a scanner 
		Scanner scan = new Scanner(System.in);
		
		//Gets the number of Humans from the user
		System.out.println("Enter the number of Humans:");
		numOfHuman = scan.nextInt();
		
		//Gets the number of Orcs from the user
		System.out.println("Enter the number of Orcs");
		numOfOrc = scan.nextInt();
		
		//Creates an Army instance called gondor which adds Humans
		//based on the number given by the user
		Army gondor = new Army("Gondor");
		for(int i = 0; i < numOfHuman; i++){
			Human h = new Human();
			gondor.add(h);
		}
		
		//Creates an Army instance called mordor which adds Orcs
		//based on the number given by the user
		Army mordor = new Army("Mordor");
		for(int i = 0; i < numOfOrc; i++){
			Orc o = new Orc();
			mordor.add(o);
			
		}
		
		int battleCnt = 0;
		
		//This loop will continue until one army is defeated
		while(gondor.isDefeated()==false && mordor.isDefeated()==false){
			
		System.out.println("BATTLE: "+battleCnt);
		
		System.out.println(gondor.toString());
		System.out.println(mordor.toString());
		
		gondor.attacks(mordor);
		mordor.attacks(gondor);
		
		if(gondor.isDefeated() == true){
			System.out.println(mordor.getName()+" is victorious!");
		}
		else if(mordor.isDefeated() == true){
			System.out.println(gondor.getName()+" is victorious!");
		}
		else if(gondor.isDefeated() == true && mordor.isDefeated() == true){
			System.out.println("Both sides lost!");
		}
		battleCnt++;
		}
	}
}
