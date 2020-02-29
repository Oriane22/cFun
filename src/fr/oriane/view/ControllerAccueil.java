package fr.oriane.view;

import java.io.IOException;

import fr.oriane.main.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerAccueil {
	@FXML
	private Button entree;
	@FXML
	private Button sortie;
	
	@FXML
	public void handleButtonEntreeClick(ActionEvent event) throws IOException {
		// Appeler le controleur de la page de choix de la salle
		MainApp.afficheVue("../view/VueChoixSalle.fxml");
	}
	
	public void handleButtonSortieClick() {
		System.exit(0);
	}
	
	public void handleMenuConnexion(ActionEvent event) {
		// Appeler le controleur de la page de connexion admin
	}
}

