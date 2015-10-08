/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Cordon
 * 	Classe fille de la classe Accessoire
 * 	Classe permettant de d�finir les diff�rentes caract�ristiques d'un cordon
 */

package inventaire;

import java.util.TreeSet;

public class Cordon extends Accessoire 
{
	// Definition attributs
	private double longueur;
	
	// Definition constructeur
	/**
	 * Constructeur de la classe Cordon
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marquesCompatibles
	 */
	public Cordon(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) {
		super(reference, intitule, prix, marquesCompatibles);
	}

	public double getLongueur() {
		return this.longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	// Definition method (process?)
	public Article recherche(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString()
	{
		return "Le cordon " + super.toString();
	}
}