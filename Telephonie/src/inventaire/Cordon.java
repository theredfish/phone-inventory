package inventaire;

import java.util.TreeSet;

public class Cordon extends Accessoire {

	protected Cordon(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) {
		super(reference, intitule, prix, marquesCompatibles);
		// TODO Auto-generated constructor stub
	}

	private double longueur;

	public double getLongueur() {
		return this.longueur;
	}

	/**
	 * 
	 * @param longueur
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	@Override
	protected Article recherche() {
		// TODO Auto-generated method stub
		return null;
	}

}