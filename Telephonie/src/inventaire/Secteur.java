package inventaire;

import java.util.TreeSet;

public class Secteur extends Chargeur {

	protected Secteur(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) {
		super(reference, intitule, prix, marquesCompatibles);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Article recherche() {
		// TODO Auto-generated method stub
		return null;
	}
}