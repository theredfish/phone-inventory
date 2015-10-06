/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Secteur
 * 	Classe fille de la classe Chargeur
 * 	Classe permettant de définir les caractéristiques d'un chargeur secteur
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
	protected Secteur(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) {
		super(reference, intitule, prix, marquesCompatibles);
	}

	// Definition getter and setter
	
	// Definition method (process?)
	protected Article recherche() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return "Chargeur secteur " + super.toString();
	}
}