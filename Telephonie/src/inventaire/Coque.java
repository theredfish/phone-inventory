package inventaire;

import java.util.TreeSet;

public class Coque extends Accessoire {

	Couleur couleur;

	/**
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marquesCompatibles
	 * @param couleur
	 */
	public Coque(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles, Couleur couleur) {
		// TODO - implement Coque.Coque
		super(reference, intitule, prix, marquesCompatibles);
	}

	@Override
	protected Article recherche() {
		// TODO Auto-generated method stub
		return null;
	}

}