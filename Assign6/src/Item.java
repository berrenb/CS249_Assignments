/*
 Created by Bryan Berrent
 
 The Item class uses getter and setter
 functions for the name of the item,
 the weight of the Item and the value of the weapon
 The Item class also uses a toString method which outputs the Item instance
 */
public class Item {
	private String name = "";
	private int weight = 0;
	private int value = 0;
	
	Item(){}
	Item(String n, int w, int v){
		name = n;
		weight = w;
		value = v;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public void setWeight(int w){
		weight = w;
	}
	
	public int getVal(){
		return value;
	}
	
	public void setVal(int v){
		value = v;
	}
	
	public String toString(){
		return "Name: " + name + "\n" + "Weight: " + weight + "\n" + "Value: " + value + "\n";
	}
}
