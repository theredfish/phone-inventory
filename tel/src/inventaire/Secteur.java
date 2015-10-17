/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.util.TreeSet;

/**
 * Classe permettant de définir les caractéristiques d'un chargeur secteur
 */
public class Secteur extends Chargeur 
{
	/**
	 * Constructeur de la classe Secteur
	 * 
	 * @param String intitule : L'intitulé d'un chargeur secteur
	 * @param double prix : Le prix d'un chargeur secteur
	 * @param TreeSet<Marque> marquesCompatibles : Les marques associées au chargeur secteur
	 */
	public Secteur(String intitule, double prix, TreeSet<Marque> marquesCompatibles) 
	{
		super(intitule, prix, marquesCompatibles);
	}
	
	/**
	 * Constructeur de la classe Secteur sans initialisation des marques compatibles
	 * 
	 * @param String reference : La référence d'un chargeur secteur
	 * @param String intitule : L'intitulé d'un chargeur secteur
	 * @param double prix : Le prix d'un chargeur secteur
	 */
	public Secteur(String intitule, double prix) 
	{
		super(intitule, prix);
		this.marquesCompatibles = new TreeSet<Marque>();
	}

	/**
	 * Redéfinition de la méthode toString
	 * Affiche les informations d'un chargeur secteur
	 * 
	 * @return String
	 */
	public String toString() 
	{
		return "Chargeur secteur " + super.toString();
	}
}