/*
 Created by Bryan Berrent
 
 The Map class consist of a 2D array created based on the parameters.
 The method copyTo copies the 2D array in one instance of 
 the Map class to another Map class instance.
 The draw method prints out the Map instance
 Finally, the setPosition method sets a position
 of the 2D array to a certain character
 */
public class Map {
	private int mapRows = 0;
	private int mapCols = 0;
	private char[][] mapData;
	
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
		if(mapData[y][x]=='.'){
			mapData[y][x]=c;
		}
		return true;
	}
	
}
