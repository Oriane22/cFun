package fr.oriane.main;

import java.io.IOException;

import fr.oriane.model.Complexe;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

	private static Scene scene;
	
	public static Complexe complexe;

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(MainApp.class.getResource("../view/VueAccueil.fxml"));
			scene = new Scene(root, 800, 600);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void afficheVue(String laVue) throws IOException {
		Parent root = FXMLLoader.load(MainApp.class.getResource(laVue));
		scene.setRoot(root);
	}
	
	public static void afficheBillet(String laVue) throws IOException {
		Stage billet = new Stage();
		Parent root = FXMLLoader.load(MainApp.class.getResource(laVue));
		Scene sceneBillet = new Scene(root, 400, 300);
		billet.setScene(sceneBillet);
		billet.show();
	}
	

	public static void main(String[] args) {
		complexe = new Complexe(4, 5, "La salle de lolo");
		launch(args);
	}
}
