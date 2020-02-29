package fr.oriane.model;

import javafx.scene.paint.Color;

public enum Couleur {
	  rouge(Color.RED),
	  vert(Color.GREEN) ,
	  orange(Color.ORANGE) ;
	
	public final Color colorJava; 
	
	private Couleur(Color color) {
        this.colorJava = color;
    }
}
