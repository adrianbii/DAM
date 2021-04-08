package t14_JavaFX;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Fronton extends Application {
   private static final int TEXT_SIZE = 24;
   private static final int SCENE_TAM_X =600;
   private static final int SCENE_TAM_Y =400;
   private static final int ANCHO_PALA = 7;
   private static final int ALTO_PALA =50;
   private int PelotaCenterX =10;
   private int PelotaCenterY = 30;
   private int velocidad = 3;
   private int incrementoX = velocidad;
   private int incrementoY = velocidad;
   private int posPalaY = (SCENE_TAM_X - SCENE_TAM_Y)/2;
   private int direccionPala =0;
   private int score=0;
   private int highScore=0;

  public void start(Stage primaryStage) {
	//	  Crea un panel para sostener el c�rculo
	Pane panel = new Pane();
	
	// Crea una escena y col�cala en el escenario
	Scene scene = new Scene(panel, SCENE_TAM_X, SCENE_TAM_Y, Color.BLACK);
	primaryStage.setTitle("PinPon"); // Establecer el t�tulo del escenarioe
	primaryStage.setScene(scene); // Coloca la escena en el escenario
	primaryStage.show();// Mostrar el escenario
	primaryStage.setOpacity(0.9);// Transparencia
	
    //Crear pala y sus propiedades
	Rectangle pala = new Rectangle(SCENE_TAM_X*0.9,posPalaY,ANCHO_PALA,ALTO_PALA);
	
	//Crear pelota y sus propiedades
    Circle pelota = new Circle(PelotaCenterX,PelotaCenterY,7,Color.WHITE);
    /*circle.setCenterX(100);
    circle.setCenterY(100);
    circle.setRadius(7);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);*///Equivale a:
    pelota.setStyle("-fx-stroke: blue; -fx-fill: yellow;");
    
    //Crear botones de incremento y decremento de velocidad
    Button btMas = new Button(" + ");
    Button btMenos = new Button(" - ");
    btMas.setLayoutX(5);
    btMenos.setLayoutX(35);
    
    // Create and register the handler
    btMas.setOnAction(e -> {
    	velocidad++;
    });
    btMenos.setOnAction(e -> {
    	if (velocidad>1)velocidad--;

    });
    
    //Etiquetas para mostrar puntuaciones
    //Dise�o principal
    HBox panelScores = new HBox();
    panelScores.setTranslateY(20);
    panelScores.setMinWidth(SCENE_TAM_X);
    panelScores.setAlignment(Pos.CENTER);
    panelScores.setSpacing(100);
    //Dise�o para puntuaci�n actual
    HBox panelCurrentScore = new HBox();
    panelCurrentScore.setSpacing(10);
    panelScores.getChildren().add(panelCurrentScore);
    //Dise�o para puntuaci�n m�xima
    HBox panelHighScore = new HBox();
    panelHighScore.setSpacing(10);
    panelScores.getChildren().add(panelHighScore);
    //Texto de etiquetas para la puntuaci�n
    Text textTitleScore = new Text("Puntos:");
    textTitleScore.setFont(Font.font(TEXT_SIZE));
    textTitleScore.setFill(Color.BLUE);
    //Texto para la puntuaci�n
    Text textScore = new Text("0");
    textScore.setFont(Font.font(TEXT_SIZE));
    textScore.setFill(Color.BLUE);
    //Texto de etiquetas para la puntuaci�n m�xima
    Text textTitleScoreMax = new Text("Puntuaci�n m�xima:");
    textTitleScoreMax.setFont(Font.font(TEXT_SIZE));
    textTitleScoreMax.setFill(Color.BLUE);
    //Texto para la puntuaci�n m�xima
    Text textScoreMax = new Text("0");
    textScoreMax.setFont(Font.font(TEXT_SIZE));
    textScoreMax.setFill(Color.BLUE);
    //A�adir los textos a los layouts reservador para ellos
    panelCurrentScore.getChildren().add(textTitleScore);
    panelCurrentScore.getChildren().add(textScore);
    panelHighScore.getChildren().add(textTitleScoreMax);
    panelHighScore.getChildren().add(textScoreMax);
    
    panel.getChildren().addAll(pala, panelScores ,pelota);
    
 //Se puede conseguir ese bucle utilizando la clase AnimationTimer
    
    AnimationTimer animationBall = new AnimationTimer() {

		@Override
		public void handle(long now) {
			// TODO Auto-generated method stub
			pelota.setCenterX(PelotaCenterX);
			pelota.setCenterY(PelotaCenterY);
			PelotaCenterX+= incrementoX;
			PelotaCenterY+= incrementoY;

			if (PelotaCenterX >= scene.getWidth()) {
				incrementoX = - velocidad;
			}
			if (PelotaCenterX <= 0) {
				incrementoX = velocidad;
			}
			if (PelotaCenterY >=scene.getHeight()) {
				incrementoY = - velocidad;
			}
			if (PelotaCenterY <=0) {
				incrementoY = velocidad;	
			} 
	//Actualizar posicion de la pala
		    posPalaY += direccionPala;
		    
		    if(posPalaY<0) {//No sobrepasar el borde superior de la ventana
		    	posPalaY =0;
		    }else {
		    	//No sobrepasar el borde inferior de la ventana
		    	if (posPalaY>scene.getHeight()-ALTO_PALA) {
		    		posPalaY=(int) (scene.getHeight()-ALTO_PALA);
		    	}
		    }
		    pala.setY(posPalaY);
		    pala.setX(scene.getWidth()-20);
		    
	//Desarrollo de colisi�n con la pala y la pelota
		    Shape shapeColision = Shape.intersect(pala, pelota);
		    boolean colisionVacia = shapeColision.getBoundsInLocal().isEmpty();
		    if(colisionVacia == false && incrementoX > 0) {
		    	incrementoX = -3;
		    	//incrementar puntuaci�n actual
		    	score++;
		    	textScore.setText(String.valueOf(score));
		    	if (score % 3 ==0) {
		    		velocidad++;
		    	}
		    }
		    
	//Comprobar si la bola ha tocado el lado derecho
		    if (PelotaCenterX >=scene.getWidth()) {
		    	//Comprobar si hay una nueva puntuaci�n m�s larga
		    	if (score > highScore) {
		    		//Cambia nueva puntuaci�n mas alta
		    		highScore = score;
		    		textScoreMax.setText(String.valueOf(highScore));
		    	}
		    	//Reiniciar partida
		    	score =0;
		    	textScore.setText(String.valueOf(score));
		    	PelotaCenterX = 10;
		    	velocidad = 3;
		    }
				
		};
    };
    
    animationBall.start();
    
    scene.setOnKeyPressed(e->{
    	switch(e.getCode()) {
    		case UP:
    			direccionPala = -6;
    			break;
    		case DOWN:
    			direccionPala = 6;
    			break;
    		default:
    			break;
    	}
    	
    });
    scene.setOnKeyReleased(e->{
    	direccionPala = 0;
    });

  }

  public static void main(String[] args) {
    launch(args);
  }
}