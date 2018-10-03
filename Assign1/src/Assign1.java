/*
 This program asks the user for 6 doubles
 Takes the numbers and plugs them into Cramer's Rule
 Outputs results
 */

import java.util.*;

public class Assign1 {

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
		
		//Cramer's Rule formula
		x = ((e*d)-(b*f))/((a*d)-(b*c));
		y = ((a*f)-(e*c))/((a*d)-(b*c));
		
		//Results
		System.out.println("Based on Cramer's rule, the value of x is " + x + "and the value of y is " + y);
	}

}
