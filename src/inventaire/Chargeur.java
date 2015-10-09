/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.util.TreeSet;

/** 
 * 	Classe abstraite permettant de définir les caractéristiques d'un chargeur
 */
public abstract class Chargeur extends Accessoire 
{
	/**
	 * Constructeur de la classe Chargeur
	 * 
	 * @param String reference : La référence d'un article
	 * @param String intitule : L'intitulé d'un article
	 * @param double prix : Le prix d'un article
	 * @param TreeSet<Marque> marquesCompatibles : Les marques associées à l'article
	 */
	protected Chargeur(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) 
	{
		super(reference, intitule, prix, marquesCompatibles);
	}
	
	/**
	 * Constructeur de la classe Chargeur sans marques compatibles à l'initialisation
	 * 
	 * @param String reference : La référence d'un article
	 * @param String intitule : L'intitulé d'un article
	 * @param double prix : Le prix d'un article
	 */
	protected Chargeur(String reference, String intitule, double prix) 
	{
		super(reference, intitule, prix);
		this.marquesCompatibles = new TreeSet<Marque>();
	}
}