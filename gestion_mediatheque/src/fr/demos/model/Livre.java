package fr.demos.model;

import java.util.ArrayList;

public class Livre {
	private String id;
	private String titre;
	private String auteur;
	private String categorie;
	private boolean reserverOuNon;
	Mediatheque mediatheque;
	ArrayList<Livre> livresReserves;
	
	
	public Livre() {
		super();
	}


	public Livre(String titre) {
		super();
		this.titre = titre;
	}
	
	
	
	

}
