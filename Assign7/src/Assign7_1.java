/*
 Created Bryan Berrent
 
 Main class to test Calculator Class and InvalidExpression
 Ask user for an addition or subtraction expression
 Passes the line of input to the eval method from the Calculator class
 Outputs results
 
 */

import java.util.*;

public class Assign7_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		try{
			System.out.println("Enter a mathmatical expression (Ex: 5+5=): ");
			input = scan.nextLine(); 
			double d = Calculator.eval(input);
			System.out.println("Answer is " + d);
		}
		catch(InvalidExpressionException e){
			System.err.println(e.getMessage());
		}

	}

}
