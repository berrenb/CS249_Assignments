/*
This programs uses the quadratic formula 
to find how many roots there are.
Written by Bryan Berrent
 
 */
import java.util.*;

public class Assign4_1 {

	public static void main(String[] args) {
		
		final double EPSILON = 1e-14;
		double [] eqn = new double [6];
		
		//Input numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		
		//Stores the values of a,b,c
		eqn[0] = scan.nextDouble();
		eqn[1] = scan.nextDouble();
		eqn[2] = scan.nextDouble();
		
		/*
		 Plug into discriminate
		 and store result into array 
		 */
		eqn[3] = ((eqn[1]*eqn[1])-(4*eqn[0]*eqn[2]));
		
		//Compare the value of the discriminate
		if(Math.abs(eqn[3]) < EPSILON){
			solveQuadratic(eqn);
			System.out.println("One root: " + eqn[4]);
		}
		else if (eqn[3] > 0){
			solveQuadratic(eqn);
			System.out.println("Two roots: " + eqn[4] + " and " + eqn[5]);
		}
		else{
			System.out.println("No real roots");
		}
		

	}
	
	/*
	Method to solve for quadratic which
	stores results back into the array
	*/
	public static double[] solveQuadratic(double [] eqn){
		eqn[4]=((-eqn[1]+Math.sqrt(eqn[3]))/(2*eqn[0]));
		eqn[5]=((-eqn[1]-Math.sqrt(eqn[3]))/(2*eqn[0]));
		return eqn;
	}
}
