/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.util.TreeSet;

/** 
 * Classe permettant de d�finir les diff�rentes caract�ristiques d'une coque
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
	 * @param String intitule : L'intitul� de la coque
	 * @param double prix : Le prix de la coque
	 * @param TreeSet<Marque> marquesCompatibles : Les marques associ�es à la coque
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
	 * @param String intitule : L'intitul� d'un article
	 * @param double prix : Le prix d'un article
	 */
	public Coque(String intitule, double prix, Couleur couleur) 
	{
		super(intitule, prix);
		this.couleur = couleur;
		this.marquesCompatibles = new TreeSet<Marque>();
	}

	/**
	 * Red�finition de la m�thode toString
	 * M�thode permettant d'afficher les informations de la coque
	 * 
	 * @return Affichage des informations de la coque
	 */
	public String toString() 
	{
		return "La coque " + couleur + super.toString();
	}
}