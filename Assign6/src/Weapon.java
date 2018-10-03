/*
 The Weapon class uses the data methods and variables 
 from the Item class.
 The Weapon class also has getter and setter functions for 
 the damage.
 Finally, there is another toString method to output results
  
 Created by Bryan Berrent
 */
public class Weapon extends Item{
	private int damage = 0;
	Weapon(){}
	Weapon(String name, int weight, int value, int d){
		super(name,weight,value);
		damage = d;
	}
	public int getDamage(){
		return damage;
	}
	
	public void setDamage(int d){
		damage = d;
	}
	
	public String toString(){
		return "Name: " + getName() + "\n" + "Weight: " + getWeight() + "\n" + "Value: " + getVal() +"\n"+ "Damage: " + damage + "\n";
	}
}
