import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class PlayerPane extends Pane {
	Player playerState;
	
	public PlayerPane(Player player){
		playerState=player;
		ImageView view = new ImageView("http://web.cs.sunyit.edu/~realemj/2016fall/char.png");
		view.setFitWidth(MapPane.TILE_WIDTH);
		view.setFitHeight(MapPane.TILE_HEIGHT);
		
		getChildren().add(view);
		this.translateXProperty().bind(playerState.getX().multiply(MapPane.TILE_WIDTH));
		this.translateYProperty().bind(playerState.getY().multiply(MapPane.TILE_HEIGHT));
	}
}
