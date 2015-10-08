/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : AllumeCigare
 * 	Classe fille de Chargeur.
 * 	Classe permettant de d�finir les diff�rentes caract�ristiques d'un allume cigare
 */

package inventaire;

import java.util.TreeSet;

public class AllumeCigare extends Chargeur 
{	
	// Définition attributs
	
	// Définition constructeur
	/**
	 * Constructeur de la classe AllumeCigare
	 * 
	 * @param reference : String - référence d'un article
	 * @param intitule : String - intitulé d'un article
	 * @param prix : double - prix d'un article
	 * @param marquesCompatibles : TreeSet<Marque> - marques associées à l'article
	 */
	public AllumeCigare(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) 
	{
		super(reference, intitule, prix, marquesCompatibles);
	}

	// Définition getter et setter
	
	// Définition des méthodes
	/**
	 * Méthode permettant de rechercher un article
	 * @param object : Object - Object recherché
	 * @return L'article recherché 
	 */
	public Article recherche(Object object) 
	{
		return null;
	}

	/**
	 * Méthode permettant d'afficher les informations de l'allume cigare
	 */
	public String toString() 
	{
		return "Chargeur allume cigare" + super.toString();
	}

}