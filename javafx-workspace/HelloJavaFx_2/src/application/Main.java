package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// crear un cuadro de texto de entrada
			   TextField txt = new TextField();
			   txt.setPromptText("Dime tu nombre");

			   // crear el bot�n saludar   
			   Button btn = new Button("Saludar");
			   btn.setOnAction(e -> System.out.println("Hola: " + txt.getText()));

			   // ROOT NODE, este contiene y organiza el bot�n y el cuadro de texto 
			   VBox root = new VBox(5.0);
			   root.setPadding(new Insets(10.0));
			   root.setAlignment(Pos.CENTER);
			   root.getChildren().add(btn);
			   root.getChildren().add(txt);

			   // el scene contiene al ROOT NODE
			   Scene scene = new Scene(root, 300, 250);

			   // configurar y mostrar el stage
			   primaryStage.setTitle("Hola JavaFX 8");
			   primaryStage.setScene(scene);
			   primaryStage.show();
			   
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
    public void init() throws Exception {
        System.out.println("Inicializando applicacion...");
    }
	
	@Override
    public void stop() throws Exception {
        System.out.println("Deteniendo applicacion...");
    }
}
