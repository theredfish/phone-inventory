/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.util.TreeSet;

/**
 * Classe permettant de définir les différentes caractéristiques d'un allume cigare
 */
public class AllumeCigare extends Chargeur 
{	
	/**
	 * Constructeur de la classe AllumeCigare
	 * 
	 * @param String reference : La référence d'un allume cigare
	 * @param String intitule : L'intitulé d'un allume cigare
	 * @param double prix : Le prix d'un allume cigare
	 * @param TreeSet<Marque> marquesCompatibles : Les marques associées à l'allume cigare
	 */
	public AllumeCigare(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) 
	{
		super(reference, intitule, prix, marquesCompatibles);
	}
	
	/**
	 * Constructeur de la classe AllumeCigare sans marques compatibles à l'initialisation
	 * 
	 * @param String reference : La référence d'un allume cigare
	 * @param String intitule : L'intitulé d'un allume cigare
	 * @param double prix : Le prix d'un allume cigare
	 */
	public AllumeCigare(String reference, String intitule, double prix) 
	{
		super(reference, intitule, prix);
	}

	/**
	 * Redéfinition de la méthode toString
	 * Méthode permettant d'afficher les informations de l'allume cigare
	 */
	public String toString() 
	{
		return "Chargeur allume cigare" + super.toString();
	}

}