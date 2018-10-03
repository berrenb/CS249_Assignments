/*
 Created by Bryan Berrent
 The Weapon class uses getter and setter functions for 
 the name of the weapon and the damage of the weapon
 */
public class Weapon{
	
	private String Name = "Bryan";
	private double damage = 0.0;
	
	public Weapon(String n, double d){
		Name = n;
		damage = d;
		
	}
	
	//Returns name of the weapon
	public String getName(){
		return Name;
	}
	
	//Sets the name of the weapon
	public void setName(String n){
		Name = n;
	}
	
	//Returns damage of the weapon
	public double getDamage(){
		return damage;
	}
	
	//Sets damage of the weapon
	public void setDamge(double d){
		damage = d;
	}
	
	
}
