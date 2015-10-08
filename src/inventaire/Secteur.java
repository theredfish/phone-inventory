/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.util.TreeSet;

/** Description de la classe : Secteur
 * 	Classe fille de la classe Chargeur
 * 	Classe permettant de définir les caractéristiques d'un chargeur secteur
 */
public class Secteur extends Chargeur 
{
	/**
	 * Constructeur de la classe Secteur
	 * 
	 * @param String reference : La reference de la coque
	 * @param String intitule : L'intitule de la coque
	 * @param double prix : Le prix de la coque
	 * @param TreeSet<Marque> marquesCompatibles : Les marques associées à la coque
	 */
	public Secteur(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) 
	{
		super(reference, intitule, prix, marquesCompatibles);
	}
	
	/**
	 * Méthode permettant d'afficher les informations du chargeur secteur
	 * @return String
	 */
	public String toString() 
	{
		return "Chargeur secteur " + super.toString();
	}
}