/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Secteur
 * 	Classe fille de la classe Chargeur
 * 	Classe permettant de d�finir les caract�ristiques d'un chargeur secteur
 */

package inventaire;

import java.util.TreeSet;

public class Secteur extends Chargeur 
{
	// Definition attributs
	
	// Definition constructeur
	/**
	 * Constructeur de la classe Secteur
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marquesCompatibles
	 */
	public Secteur(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) {
		super(reference, intitule, prix, marquesCompatibles);
	}

	// Definition getter and setter
	
	// Definition method (process?)
	public Article recherche(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return "Chargeur secteur " + super.toString();
	}
}