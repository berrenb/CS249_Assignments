/*
 Written by Bryan Berrent
 Uses adaptation from class notes
 This program gets 6 doubles from the user
 Compute the values of x and y using Cramer's Rule Formula
 Outputs results
 */
import java.util.Scanner;

public class Assign2_1 {
	public static void main(String[] args) {
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e = 0.0;
		double f = 0.0;
		double x = 0.0;
		double y = 0.0;
		
		//Creates a scanner instance
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("We are going to test Cramer’s rule!\n");
		System.out.println("Enter a double: ");
		
		a = input.nextDouble();
		
		System.out.println("\nEnter another double: ");
		
		b = input.nextDouble();

		System.out.println("\nEnter another double: ");
		
		c = input.nextDouble();

		System.out.println("\nEnter another double: ");
		
		d = input.nextDouble();

		System.out.println("\nEnter another double: ");
		
		e = input.nextDouble();

		System.out.println("\nEnter another double: ");
		
		f = input.nextDouble();
		
		//Check to see if denominator is 0
		if((a*d)-(b*c)<1){
		System.out.println("The equation has no solution");
		}
		else{
			//Cramer's Rule formula
			x = ((e*d)-(b*f))/((a*d)-(b*c));
			y = ((a*f)-(e*c))/((a*d)-(b*c));
			//Results
			System.out.println("Based on Cramer's rule, the value of x is " + x + "and the value of y is " + y);
		}
		
}
}