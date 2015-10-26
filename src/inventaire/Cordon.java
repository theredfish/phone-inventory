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
	 * @param String intitule : L'intitule d'un cordon
	 * @param double prix : Le prix d'un cordon
	 * @param TreeSet<Marque> marquesCompatibles : Les marques associées au cordon
	 */
	public Cordon(String intitule, double prix, double longueur, TreeSet<Marque> marquesCompatibles) 
	{
		super(intitule, prix, marquesCompatibles);
		this.longueur = longueur;
	}
	
	/**
	 * Constructeur de la classe Cordon sans marques compatibles à l'initialisation
	 * 
	 * @param String intitule : L'intitulé d'un cordon
	 * @param double prix : Le prix d'un cordon
	 */
	public Cordon(String intitule, double prix, double longueur) 
	{
		super(intitule, prix);
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
	 * Redéfinition de la méthode toString
	 * Affiche les informations d'un cordon
	 */
	public String toString()
	{
		return "Le cordon de longueur " + getLongueur() + " cm" + super.toString();
	}
}