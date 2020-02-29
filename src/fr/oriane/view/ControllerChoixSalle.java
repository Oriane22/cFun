package fr.oriane.view;

import java.io.IOException;

import fr.oriane.main.MainApp;
import fr.oriane.model.Arrivee;
import fr.oriane.model.ChoixCouleur;
import fr.oriane.model.Couleur;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ControllerChoixSalle {
	@FXML
	private Button fitness;
	@FXML
	private Button musculation;
	@FXML
	private Circle entreeFitness;
	@FXML
	private Circle entreeMuscu;

	@FXML
	public void initialize() {
		Couleur cFitness = new ChoixCouleur(MainApp.complexe.etatFit()).getCouleur();
		Couleur cMuscu = new ChoixCouleur(MainApp.complexe.etatMuscu()).getCouleur();
		
		this.entreeFitness.setFill(cFitness.colorJava);
		this.entreeMuscu.setFill(cMuscu.colorJava);
		
		if (cFitness == Couleur.rouge) {
			fitness.setDisable(true);
		}
		
		if (cMuscu == Couleur.rouge) {
			musculation.setDisable(true);
		}
		
	}

	@FXML
	public void handleButtonFitnessClick() throws IOException {
		MainApp.complexe.entreeUsager(new Arrivee(MainApp.complexe, 'F'));
		MainApp.afficheBillet("../view/VueBilletEntree.fxml");
		this.initialize();
	}

	public void handleButtonmusculationClick() throws IOException {
		MainApp.complexe.entreeUsager(new Arrivee(MainApp.complexe, 'M'));
		//MainApp.afficheBillet("../view/VueBilletSortie.fxml");
		this.initialize();
	}

}
