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
	 * @param String reference : La reference de la coque
	 * @param String intitule : L'intitule de la coque
	 * @param double prix : Le prix de la coque
	 * @param TreeSet<Marque> marquesCompatibles : Les marques associées à la coque
	 * @param Couleur couleur : La couleur de la coque
	 */
	public Coque(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles, Couleur couleur) 
	{
		super(reference, intitule, prix, marquesCompatibles);
		this.couleur = couleur;
	}

	/**
	 * Méthode permettant d'afficher les informations de la coque
	 * @return String
	 */
	public String toString() 
	{
		return "La coque " + couleur + super.toString();
	}
}