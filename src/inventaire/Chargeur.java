/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Chargeur
 * 	Classe fille de la classe Accessoire.
 * 	Classe abstrait permettant de définir les caractéristique d'un chargeur
 */

package inventaire;

import java.util.TreeSet;

public abstract class Chargeur extends Accessoire 
{
	// Definition attributs
	
	// Definition constructeur
	/**
	 * Constructeur de la classe Chargeur
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marquesCompatibles
	 */
	protected Chargeur(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) 
	{
		super(reference, intitule, prix, marquesCompatibles);
	}
	
	// Definition getter and setter
	
	// Definition method (process?)
}