/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Accessoire
 * 	Classe fille de la classe Article.
 * 	Classe abstraite permettant de définir les différents caractéristiques d'un accessoire.
 */

package inventaire;

import java.util.*;

public abstract class Accessoire extends Article 
{
	// Définition attributs
	private TreeSet<Marque> marquesCompatibles;

	// Définition constructeur
	/**
	 * Constructeur de la classe Accessoire
	 * 
	 * @param reference : String - référence d'un article
	 * @param intitule : String - intitulé d'un article
	 * @param prix : double - prix d'un article
	 * @param marquesCompatibles : TreeSet<Marque> - marques associées à l'article
	 */
	protected Accessoire(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) 
	{
		super(reference, intitule, prix);
		this.marquesCompatibles = marquesCompatibles;
	}
	
	// Définition getter and setter
	/**
	 * Getter permettant de connaitre la liste des accessoires
	 * @return La liste des accessoire - TreeSet<Marque>
	 */
	public TreeSet<Marque> getMarquesCompatibles() 
	{
		return marquesCompatibles;
	}

	/**
	 * Setter permettant de changer la liste des accessoires par la liste marquesCompatibles
	 * @param marquesCompatibles : TreeSet<Marque> - Liste des accessoires
	 */
	public void setMarquesCompatibles(TreeSet<Marque> marquesCompatibles) 
	{
		this.marquesCompatibles = marquesCompatibles;
	}

	// Définition des méthodes
	public String toString() 
	{
		String result = super.toString() + " est compatible avec les marques suivantes :\n";
		
		if (!marquesCompatibles.isEmpty()) 
		{
			for (Marque marque : marquesCompatibles)
				result += "- " + marque.toString() +"\n";
		}
		else 
		{
			result += "aucune";
		}
		
		return result;
	}
}