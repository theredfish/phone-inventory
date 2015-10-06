package inventaire;

import java.util.*;

public abstract class Accessoire extends Article {

	Collection<Marque> marquesCompatibles;

	/**
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marquesCompatibles
	 */
	protected Accessoire(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) {
		super(reference, intitule, prix);
	}

	public String toString() {
		// TODO - implement Accessoire.toString
		return "";
	}

}