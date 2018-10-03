/*
 Created by Bryan Berrent
 
 -The Unit Class has getter methods for its data fields.
 -The Unit Class has an attack method which attacks
 another instance of a Unit.
 */
public abstract class Unit {
	private int attack = 0;
	private int health = 0;
	private boolean alive = true;
	private String name = " ";
	
	protected Unit(String n, int a, int h){
		attack = a;
		health = h;
		name = n;
		alive = true;
	}
	
	//Gets attack
	public int getAttack (){
		return attack;
	}
	
	//Gets health
	public int getHealth (){
		return health;
	}
	
	//Checks if the Unit is alive
	public boolean isAlive(){
		return alive;
	}
	
	//Gets name
	public String getName(){
		return name;
	}
	
	//Override toString method to output name
	public String toString(){
		return name;
	}
	
	//Method to attack a unit
	public int attack(Unit other){
		
		//If the unit isn't alive, there is no one to attack
		//Therefore, 0 is returned and you exit attack
		if(alive!=true || other.alive != true){
			return 0;
		}
		
		//Gets a random number for damage
		int damage = (int)(Math.random()*((attack-1)));
		other.health = other.health-damage;
		
		if(other.health<=0){
			other.health=0;
			other.alive=false;
		}
		
		return damage;
	}
}
