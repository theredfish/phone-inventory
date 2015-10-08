/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.util.TreeSet;

/** 
 * 	Classe abstrait permettant de définir les caractéristique d'un chargeur
 */
public abstract class Chargeur extends Accessoire 
{
	/**
	 * Constructeur de la classe Chargeur
	 * 
	 * @param String reference référence d'un article
	 * @param String intitule intitulé d'un article
	 * @param double prix prix d'un article
	 * @param TreeSet<Marque> marquesCompatibles marques associées à l'article
	 */
	protected Chargeur(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) 
	{
		super(reference, intitule, prix, marquesCompatibles);
	}
}