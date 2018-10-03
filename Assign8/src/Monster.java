/*
 Created by Bryan Berrent
 
 The Monster class contains getter and setter functions
 for the x, y, and health data fields
 The Monster class also has a draw method which scans for
 another x, y and health.
 */
import java.util.Scanner;

public abstract class Monster implements Drawable,Loadable{
	private int x = 0;
	private int y = 0;
	private int health = 0;
	
	protected Monster(){}
	
	protected Monster(int myX,int myY, int myHealth){}
	
	public int getX(){
		return x;
	}
	
	public void setX(int myX){
		x=myX;
	}
	
	public int getY(){
		return y;
	}
	
	public void setY(int myY){
		y=myY;
	}
	public int getHealth(){
		return health;
	}
	
	public void setHealth(int myHealth){
		health=myHealth;
	}
	
	public void draw(Scanner input) throws Exception {
		x = input.nextInt();
		y = input.nextInt();
		health = input.nextInt();		
	}
}
