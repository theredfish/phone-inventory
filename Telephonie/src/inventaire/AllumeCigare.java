package inventaire;

import java.util.TreeSet;

public class AllumeCigare extends Chargeur {

	protected AllumeCigare(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) {
		super(reference, intitule, prix, marquesCompatibles);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Article recherche() {
		// TODO Auto-generated method stub
		return null;
	}
}