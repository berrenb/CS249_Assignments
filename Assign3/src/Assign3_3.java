/*
 Written by Bryan Berrent
 This program calculates from Feet to Meters
 This program also calculates from Meter to Feet
 Outputs results 
 */
public class Assign3_3 {

	public static void main(String[] args) {
		
		//Initialize Variables
		double meter = 20.0;
		double convMeter = 1.0;
		double convFoot = 1.0;
		double foot = 1.0;
		
		System.out.println("Feet \tMeters\t|\tMeters \tFeet");
		
		
		while(foot <= 10.0 || meter <= 65.0){
		
			convMeter = footToMeter(foot);	
			convFoot = meterToFoot(meter);
			
			//Output results
			System.out.printf("%2.1f\t%5.3f\t|\t%2.1f \t%5.3f",foot,convMeter,meter,convFoot);
			System.out.println("");
			
			foot+=1.0;
			meter+=5.0;
		}
	}
	
	//Method to convert from Feet to Meters
	public static double footToMeter(double foot){
		double meter = 0.305 * foot;
		return meter;
	}
	
	//Method to convert from Meters to Feet
	public static double meterToFoot(double meter){
		double foot = 3.279 * meter;
		return foot;
	}

}
