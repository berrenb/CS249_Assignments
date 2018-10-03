import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class MapPane extends Pane{
	
	final static int TILE_WIDTH = 32;
	final static int TILE_HEIGHT = 32;
	Map currentMap;
	
	MapPane(Map map){
		currentMap = map;
		for(int i = 0; i < TILE_WIDTH; i++){
			for(int j = 0; j < TILE_HEIGHT; j++){
				Tile tile = new Tile(j*TILE_WIDTH,i*TILE_HEIGHT,currentMap.getMapLocation(j, i));
				getChildren().add(tile);
			}
		}
	}
	
	private class Tile extends Rectangle{
		public Tile(double x, double y, char type){
			super(x,y,TILE_WIDTH,TILE_HEIGHT);
			if(type==' '){
				setFill(Color.BLACK);
			}
			if(type=='#'){
				setFill(Color.GREY);
			}
			if(type=='.'){
				setFill(Color.LIGHTGREY);
			}
		}
	}
}
