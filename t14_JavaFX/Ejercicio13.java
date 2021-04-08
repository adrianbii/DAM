package t14_JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ejercicio13  extends Application {

	
	public void start(Stage ps) throws Exception {
		
		StackPane g = new StackPane();
		g.getChildren().add(new Rectangle(150, 150, Color.BLUE));
		g.getChildren().add(new Button("Boton 1"));
		Scene s = new Scene (g, 200,200);
		ps.setTitle("Ejercicio 13");
		ps.setScene(s);
		ps.show();
		
	}

	public static void main (String[] args) {
		launch(args);
	}
}
