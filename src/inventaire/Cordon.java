/**
 * @author Marina Blin - Julian Didier
 */

package inventaire;

import java.util.TreeSet;

/**
 * Classe permettant de définir les différentes caractéristiques d'un cordon
 */
public class Cordon extends Accessoire 
{
	/**
	 * double longueur : La longueur du cordon  
	 */
	private double longueur;
	
	/**
	 * Constructeur de la classe Cordon
	 * 
	 * @param String reference : La reference d'un cordon
	 * @param String intitule : L'intitule d'un cordon
	 * @param double prix : Le prix d'un cordon
	 * @param TreeSet<Marque> marquesCompatibles : Les marques associées au cordon
	 */
	public Cordon(String reference, String intitule, double prix, double longueur, TreeSet<Marque> marquesCompatibles) 
	{
		super(reference, intitule, prix, marquesCompatibles);
		this.longueur = longueur;
	}
	
	/**
	 * Constructeur de la classe Cordon sans marques compatibles à l'initialisation
	 * 
	 * @param String reference : La référence d'un cordon
	 * @param String intitule : L'intitulé d'un cordon
	 * @param double prix : Le prix d'un cordon
	 */
	public Cordon(String reference, String intitule, double prix, double longueur) 
	{
		super(reference, intitule, prix);
		this.marquesCompatibles = new TreeSet<Marque>();
		this.longueur = longueur;
	}

	/**
	 * Getter permettant d'obtenir la longueur du cordon
	 * 
	 * @return double longueur
	 */
	public double getLongueur() {
		return this.longueur;
	}

	/**
	 * Setter permettant de définir la longueur du cordon
	 * 
	 * @param double longueur
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * Redéfinition de la méthode toString
	 * Affiche les informations d'un cordon
	 */
	public String toString()
	{
		return "Le cordon " + super.toString();
	}
}