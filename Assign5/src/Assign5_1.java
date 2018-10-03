/*
 Created by Bryan Berrent
 Main function to test the Circle2D Class
 */

public class Assign5_1 {
		
	public static void main(String[] args) {
		
		//Creates an instance of Circle2D called circle
		Circle2D circle = new Circle2D(2,2,5.5);
		
		//Prints Area
		System.out.println("Area = " + circle.getArea());
		
		//Prints Perimeter
		System.out.println("Perimeter = " + circle.getPerimeter());
		
		//Checks if the point (3,3) is in the circle
		System.out.println("Contains(3,3)? " + circle.contains(3, 3));
		
		//Checks if the circle(4,5,10.5) is inside the circle
		System.out.println("Contains(4,5,10.5)? " + circle.contains(4,5,10.5));
		
		//Checks if the circle(3,5,2.3) overlaps the circle
		System.out.println("Overlaps(3,5,2.3)? " + circle.overlaps(3,5,2.3));
	}
}
