package fr.oriane.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.oriane.model.ChoixCouleur;
import fr.oriane.model.Couleur;

public class ChoixCouleurTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testControleur() {
		
		double etat=0.2;
		ChoixCouleur choixCoul =  new ChoixCouleur(etat);
		assertEquals(Couleur.vert,choixCoul.getCouleur());
		
		etat = 	0.8;
		choixCoul =  new ChoixCouleur(etat);
		assertEquals(Couleur.orange,choixCoul.getCouleur());
		
		etat = 	1;
		choixCoul =  new ChoixCouleur(etat);
		assertEquals(Couleur.rouge,choixCoul.getCouleur());
		
	}

}
