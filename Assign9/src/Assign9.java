import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import java.io.File;
import java.util.Scanner;
import javafx.scene.Scene;
import javafx.beans.property.IntegerProperty;

import javafx.application.*;

public class Assign9 extends Application{
	public void start(Stage primaryStage){
		try{
			Scanner inputMap = new Scanner(new File("Map01.txt"));
			Map baseMap = new Map();
			baseMap.load(inputMap);
			
			MapPane mp = new MapPane(baseMap);
			
			Pane displayPane = new Pane();
			displayPane.getChildren().add(mp);
			
			Player player = new Player(5,5);
			
			PlayerPane pp = new PlayerPane(player);
			
			displayPane.getChildren().add(pp);
			
			Scene scene = new Scene(displayPane);
			
			scene.setOnKeyPressed(e ->{
				IntegerProperty xCheck = player.getX();
				IntegerProperty yCheck = player.getY();
				switch(e.getCode()){
				case A:
					xCheck.setValue(xCheck.intValue()-1);
					if(baseMap.canMoveTo(xCheck.intValue(), yCheck.intValue())){
						player.setPosition(xCheck.intValue(), yCheck.intValue());
					}
					else{
						xCheck.setValue(xCheck.intValue()+1);
					}
					break;
				case D:
					xCheck.setValue(xCheck.intValue()+1);
					if(baseMap.canMoveTo(xCheck.intValue(), yCheck.intValue())){
						player.setPosition(xCheck.intValue(), yCheck.intValue());
					}
					else{
						xCheck.setValue(xCheck.intValue()-1);
					}
					break;
				case W:
					yCheck.setValue(yCheck.intValue()-1);
					if(baseMap.canMoveTo(xCheck.intValue(), yCheck.intValue())){
						player.setPosition(xCheck.intValue(), yCheck.intValue());
					}
					else{
						yCheck.setValue(yCheck.intValue()+1);
					}
					break;
				case S:
					yCheck.setValue(yCheck.intValue()+1);
					if(baseMap.canMoveTo(xCheck.intValue(), yCheck.intValue())){
						player.setPosition(xCheck.intValue(), yCheck.intValue());
					}
					else{
						yCheck.setValue(yCheck.intValue()-1);
					}
					break;
					default:
						break;
				}
				
			});
			
			primaryStage.setTitle("NetHack");
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(Exception e){
			e.printStackTrace();
			Platform.exit();
		}
	}
	public static void main(String[] args) {
		launch(args);

	}

}
