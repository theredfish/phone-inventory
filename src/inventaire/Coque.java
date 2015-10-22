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
	 * @param String intitule : L'intitulé de la coque
	 * @param double prix : Le prix de la coque
	 * @param TreeSet<Marque> marquesCompatibles : Les marques associées à la coque
	 * @param Couleur couleur : La couleur de la coque
	 */
	public Coque(String intitule, double prix, TreeSet<Marque> marquesCompatibles, Couleur couleur) 
	{
		super(intitule, prix, marquesCompatibles);
		this.couleur = couleur;
	}
	
	/**
	 * Constructeur de la classe Coque sans marques compatibles à l'initialisation
	 * 
	 * @param String intitule : L'intitulé d'un article
	 * @param double prix : Le prix d'un article
	 */
	public Coque(String intitule, double prix, Couleur couleur) 
	{
		super(intitule, prix);
		this.couleur = couleur;
		this.marquesCompatibles = new TreeSet<Marque>();
	}

	/**
	 * Redéfinition de la méthode toString
	 * Méthode permettant d'afficher les informations de la coque
	 * 
	 * @return Affichage des informations de la coque
	 */
	public String toString() 
	{
		return "La coque " + couleur + super.toString();
	}
}