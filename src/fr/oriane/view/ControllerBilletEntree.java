package fr.oriane.view;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;

import fr.oriane.main.MainApp;
import fr.oriane.model.Arrivee;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerBilletEntree {
	@FXML
	private Label nomCopmplexe;
	@FXML
	private Label date;
	@FXML
	private Label heure;
	@FXML
	private Label numeroBilletEntree;

	@FXML
	public void initialize() {
		LocalDateTime dateActuelle = LocalDateTime.now();
		DateTimeFormatter formatterTime = DateTimeFormatter.ISO_TIME;
		DateTimeFormatter formatterDate = DateTimeFormatter.ISO_LOCAL_DATE;
		this.date.setText(dateActuelle.format(formatterDate));
		this.heure.setText(dateActuelle.format(formatterTime));
		
		Arrivee arrive = MainApp.complexe.lesArrivees.get(MainApp.complexe.getNumeroActuel()-1);
		this.numeroBilletEntree.setText(Integer.toString(arrive.getNumeroArrivee()));
		this.nomCopmplexe.setText(arrive.getComplexe().getNomComplexe());
	}
}

