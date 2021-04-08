package t14_JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {
		
		public void start (Stage primaryStage) {
			
			//create a pane to hold de circle
			
			Pane pane = new Pane();
			
		 // Create a circle and set its properties
			
			Circle circle = new Circle ();
			//circle.setCenterX(0);
			//circle.setCenterY(0);
			
			//Asi lo hacia antes, ahora enlazaremos propiedades
			
			circle.centerXProperty().bind(pane.widthProperty().divide(2));
			circle.centerYProperty().bind(pane.widthProperty().divide(2));
			circle.setRadius(70);
			circle.setStroke(Color.BLACK);
			circle.setFill(Color.WHITE);
			
			// Add circle to the pane
			pane.getChildren().add(circle); 
			
			
			// Create a scene and place it in the stage
			
			Scene scene = new Scene (pane, 300, 300);
			primaryStage.setTitle("ShowCircleCentered");
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); //Display the Scene
		}
		
		public static void main (String[] args) {
			
			launch(args);
		}
	

}
