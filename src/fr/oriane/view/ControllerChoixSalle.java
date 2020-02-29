package fr.oriane.view;

import java.io.IOException;

import fr.oriane.main.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class ControllerChoixSalle {
	@FXML
	private Button fitness;
	@FXML
	private Button musculation;
	private MainApp MainApp;


	@FXML
	public void handleButtonFitnessClick() throws IOException {
		
	}
	public void setMainApp(fr.oriane.main.MainApp MainApp) {
		   this.MainApp = MainApp;
		}
	public void handleButtonmusculationClick() throws IOException {

	}
	
}

