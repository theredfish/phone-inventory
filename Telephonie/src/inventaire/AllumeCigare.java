/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : AllumeCigare
 * 	Classe fille de Chargeur.
 * 	Classe permettant de définir les différentes caractéristiques d'un allume cigare
 */

package inventaire;

import java.util.TreeSet;

public class AllumeCigare extends Chargeur 
{	
	// Definition attributs
	
	// Definition constructeur
	/**
	 * Constructeur de la classe AllumeCigare
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marquesCompatibles
	 */
	protected AllumeCigare(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) {
		super(reference, intitule, prix, marquesCompatibles);
	}

	// Definition getter and setter
	
	// Definition method (process?)
	public Article recherche() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return "Chargeur allume cigare" + super.toString();
	}
}