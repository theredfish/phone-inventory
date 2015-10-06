package inventaire;

import java.util.TreeSet;

public abstract class Chargeur extends Accessoire 
{

	protected Chargeur(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) 
	{
		super(reference, intitule, prix, marquesCompatibles);
		// TODO Auto-generated constructor stub
	}
}