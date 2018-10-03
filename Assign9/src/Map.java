import java.util.Scanner;

/*
 Created by Bryan Berrent
 
 The Map class consist of a 2D array created based on the parameters.
 The method copyTo copies the 2D array in one instance of 
 the Map class to another Map class instance.
 The draw method prints out the Map instance
 The setPosition method sets a position
 of the 2D array to a certain character
 Finally, the load method modifies the values of mapData, mapCols and mapRows
 and stores data given in by input into mapData.
 */
public class Map implements Loadable{
	private int mapRows;
	private int mapCols;
	private char[][] mapData;
	
	public Map (){
		mapData = new char[0][0];
		mapRows = 0;
		mapCols = 0;
	}
	public Map(int row,int col){
		mapRows = row;
		mapCols = col;
		mapData = new char[mapRows][mapCols];
		for(int i = 0; i < mapRows; i++){
			for(int j = 0; j < mapCols; j++){
				mapData[i][j] = '.';
			}
		}
	}
	
	public boolean copyTo(Map other){
		if(other== null){
			return false;
		}
		if(other.mapData.length!=mapData.length && other.mapData[0].length!=mapData[0].length){
			return false;
		}
		for(int i = 0; i < mapRows; i++){
			for(int j = 0; j < mapCols; j++){
				other.mapData[i][j] = mapData[i][j];
			}
		}
	
		return true;
	}
	
	public void draw(){
		for(int i = 0; i < mapRows; i++){
			for(int j = 0; j < mapCols; j++){
				System.out.print(mapData[i][j]);
			}
			System.out.println("");
		}
	}
	
	public boolean setMapLocation(int x, int y, char c){
		if(x < 0 || y < 0 || x >= mapCols || y >= mapRows) {
	    return false;
	}
	
	mapData[y][x] = c;
	
	return true;
	}
	
	public int getRows(){
		return mapRows;
	}
	
	public int getCols(){
		return mapCols;
	}
	
	public char getMapLocation(int x, int y){
		if(x < 0 || y < 0 || x >= mapCols || y >= mapRows) {
		    return ' ';
		}
		return mapData[y][x];
	}
	
	public boolean canMoveTo(int x, int y){
		if(x < 0 || y < 0 || x >= mapCols || y >= mapRows) {
		    return false;
		}
		else if(mapData[y][x]=='.'){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void load(Scanner input) throws Exception {
		mapData = new char[0][0];
		mapRows = 0;
		mapCols = 0;
		
		mapRows = Integer.parseInt(input.nextLine());
		mapCols = Integer.parseInt(input.nextLine());
		
		mapData = new char[mapRows][mapCols];
		for(int i = 0; i < mapRows; i++){
			String line = input.nextLine();
			for(int j = 0; j < mapCols; j++){
				mapData[i][j]=line.charAt(j);
			}
		}
	}
	
}
