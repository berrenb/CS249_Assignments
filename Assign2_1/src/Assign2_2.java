/*
 Written by Bryan Berrent
 Uses adaptation from class notes
 This program gets the amount of sides from the user
 Gets the length of each side from the user
 Calculates the area 
 Outputs results
 */
import java.util.*;

public class Assign2_2 {

	public static void main(String[] args) {
		
		//Initialize variables
		int sideAmount = 0;
		double lengthOfSide = 0.0;
		double area = 0.0;
		
		Scanner scan = new Scanner(System.in);
		
		//Get amount of sides
		System.out.println("Enter the amount of sides: ");
		sideAmount = scan.nextInt();
		
		//Get size of each size
		System.out.println("Enter the size of each side: ");
		lengthOfSide = scan.nextDouble();
		
		//Use area formula
		area = ((sideAmount*(lengthOfSide*lengthOfSide)) / (4 * (Math.tan(Math.PI/sideAmount))));
		
		//Output results
		System.out.println("The area of the polygon is: " + area);
	}

}
