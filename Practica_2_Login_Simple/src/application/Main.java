package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
		AnchorPane mypane = loader.load();
		
		// Añade la escena al stage y la titula
		stage.setTitle("Login");
		stage.setScene(new Scene(mypane));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
