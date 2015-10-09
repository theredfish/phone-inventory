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
	 * cordon
	 * @param String reference : La reference d'une coque
	 * @param String intitule : L'intitule d'une coque
	 * @param double prix : Le prix d'une coque
	 * @param TreeSet<Marque> marquesCompatibles : Les marques associées à la coque
	 * @param Couleur couleur : La couleur de la coque
	 */
	public Coque(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles, Couleur couleur) 
	{
		super(reference, intitule, prix, marquesCompatibles);
		this.couleur = couleur;
	}
	
	/**
	 * Constructeur de la classe Coque sans marques compatibles à l'initialisation
	 * 
	 * @param String reference : La référence d'un article
	 * @param String intitule : L'intitulé d'un article
	 * @param double prix : Le prix d'un article
	 */
	protected Coque(String reference, String intitule, double prix, Couleur couleur) 
	{
		super(reference, intitule, prix);
		this.couleur = couleur;
		this.marquesCompatibles = new TreeSet<Marque>();
	}

	/**
	 * Redéfinition de la méthode toString
	 * Méthode permettant d'afficher les informations de la coque
	 */
	public String toString() 
	{
		return "La coque " + couleur + super.toString();
	}
}