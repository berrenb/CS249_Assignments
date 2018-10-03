/*
 Created by Bryan Berrent
 This program returns the area or a circle,
 Returns the circumference or perimeter of the circle,
 Checks if a point is in the circle,
 Checks is a circle is contained inside another circle,
 And checks if a circle overlaps another circle 
 */

public class Circle2D {
	
	private double x = 0;
	private double y = 0;
	private double radius = 1;
	
	public Circle2D(){}
	
	//Constructor
	public Circle2D(double myX, double myY, double myRadius){
		x = myX;
		y = myY;
		radius = myRadius;
	}
	
	//Returns the area of a circle
	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}
	
	//Returns perimeter of a circle
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	//Checks if a certain point is present in the circle
	public boolean contains(double xVal, double yVal){
		double d = Math.pow(Math.abs(xVal - x),2) + Math.pow(Math.abs(yVal - y),2);
		d = Math.sqrt(d);
		if(d < Math.pow(radius, 2)){
			return true;
		}
		return false;
	}
	
	//A second contains function checking if a circle is inside another circle
	public boolean contains(double xVal, double yVal, double rad){
		if(contains(xVal + rad,yVal)==true && contains(xVal - rad,yVal)==true && 
				contains(xVal,yVal + rad)==true && contains(xVal,yVal - rad)==true &&
				contains(xVal,yVal) == true){
			return true;
		}
		
		return false;
	}
	
	//Checks if two circles overlap
	public boolean overlaps(double xVal, double yVal, double rad){
		
		if(contains(xVal + rad,yVal)==true || contains(xVal - rad,yVal)==true || 
				contains(xVal,yVal + rad)==true || contains(xVal,yVal - rad)==true ||
				contains(xVal,yVal) == true){
			return true;
			}
		
		return false;
	}
	
	

}
