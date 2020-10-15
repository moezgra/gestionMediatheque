package fr.demos.main;

import fr.demos.model.Adherent;
import fr.demos.model.Livre;
import fr.demos.model.Mediatheque;

public class Main {

	public static void main(String[] args) {
		Mediatheque mediatheque;
		Adherent adherent;
		Livre livre1, livre2, livre3;
		
		
		livre1 = new Livre("Le corbeau et le renard");
		livre2 = new Livre("Jamais");
		livre3 = new Livre("The future!");
		mediatheque.ajoute(livre1);
	}

}
