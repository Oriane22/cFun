package fr.oriane.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

	 
	public class MainApp extends Application {
		@Override
		public void start(Stage primaryStage) {
			try {
				Parent root = FXMLLoader.load(MainApp.class.
						getResource("../view/VueAccueil.fxml"));
				Scene scene = new Scene (root, 800, 600);
				primaryStage.setScene(scene);
				primaryStage.show();		
				
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		public void afficheVue(String laVue) throws IOException {
	        FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource(laVue));
	    }
		
	public static void main(String[] args) {
		launch(args);
	}
}
	 
