/*
 Created by Bryan Berrent
 
 -The Army class contains a getter method for name
 -The Army class also has add, remove, getCount and getSoldiers to 
 either modify the values of the soldier, output the size ArrayList 
 or output the ArrayList.
 -The isDefeated method checks if an Army instance is empty
 -The toString method is override to output the Unit's name and health.
 -The attacks method has an Army instance attack another Army instance
 
 */
import java.util.*;
public class Army<E extends Unit>  {
	private ArrayList<E> soldier = new ArrayList<E>();
	String name = " ";
	
	public Army(String n){
		name = n;
	}
	
	//Gets name
	public String getName(){
		return name;
	}
	
	//Add a value to the ArrayList
	public void add(E value){
		soldier.add(value);
	}
	
	//Remove a value from the ArrayList
	public void remove(E value){
		soldier.remove(value);
	}
	
	//Outputs soldier contents
	public ArrayList<E> getSoldier(int x){
		return soldier;
	}
	
	//Outputs the size of the ArrayList
	public int getCount(){
		return soldier.size();
	}
	
	//Checks if soldier is empty
	public boolean isDefeated(){
		if(soldier.isEmpty()){
			return true;
		}
		return false;
	}
	
	/*
	Outputs the name of the Unit instance followed 
	by the health of the Unit instance
	*/
	public String toString(){
		String s = "";
		
		for(Unit x: soldier){
			s += x.getHealth() + " ";
		}
		return this.getName() + ": " + s;
	}
	
	//An Army instance attacks another Army instance
	public <T extends Unit> void attacks(Army<T> other){
		ArrayList<E> deathToll = new ArrayList<>();
		
			for(int i = 0; i < this.getCount(); i++){
				
				//Gets a random soldier and attacks that soldier
				int rand = (int)Math.random()*((other.getCount()-1)-0);
				Unit u = other.soldier.get(rand);
				u.attack(soldier.get(rand));
				
				//If the soldier dies, it is removed from the ArrayList
				if(u.isAlive()==false){
					deathToll.add((E) u);
					other.remove((T) u);
				}
				
				else{
					u.attack(soldier.get(rand));
				}
				soldier.removeAll(deathToll);
				if(other.isDefeated()==true){
					break;
				}
				
			}
		
	}
 	
	
}
