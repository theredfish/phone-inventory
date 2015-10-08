/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.util.TreeSet;

/** 
 * Classe permettant de définir les différentes caractéristiques d'une coque
 */
public class Coque extends Accessoire 
{
	/**
	 * Couleur couleur d'un accessoire
	 */
	private Couleur couleur;

	/**
	 * Constructeur de la classe Coque
	 * 
	 * @param String reference : La reference d'un article
	 * @param String intitule : L'intitule d'un article
	 * @param double prix : Le prix d'un article
	 * @param TreeSet<Marque> marquesCompatibles : Les marques associées à l'article
	 * @param Couleur couleur : La couleur de la coque
	 */
	public Coque(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles, Couleur couleur) 
	{
		super(reference, intitule, prix, marquesCompatibles);
		this.couleur = couleur;
	}

	/**
	 * Méthode permettant d'afficher les informations de la coque
	 */
	public String toString() 
	{
		return "La coque " + couleur + super.toString();
	}
}