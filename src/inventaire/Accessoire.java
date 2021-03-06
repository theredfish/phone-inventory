/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.util.*;

/**
 * Classe abstraite permettant de définir les différentes caractéristiques d'un accessoire.
 */
public abstract class Accessoire extends Article 
{
	/**
	 * Ensemble de marques compatibles.
	 */
	protected TreeSet<Marque> marquesCompatibles;

	/**
	 * Constructeur de la classe Accessoire avec un ensemble de marques
	 * 
	 * @param String intitule : Intitulé d'un article
	 * @param double prix : Prix d'un article
	 * @param TreeSet<Marque> marquesCompatibles : Marques compatibles associées l'article
	 */
	protected Accessoire(String intitule, double prix, TreeSet<Marque> marquesCompatibles) 
	{
		super(intitule, prix);
		this.marquesCompatibles = marquesCompatibles;
	}
	
	/**
	 * Constructeur de la classe Accessoire sans ensemble de marques
	 *
	 * @param String intitule : Intitulé d'un article
	 * @param double prix : Prix d'un article
	 */
	protected Accessoire(String intitule, double prix) 
	{
		super(intitule, prix);
		this.marquesCompatibles = new TreeSet<Marque>();
	}
	
	/**
	 * Getter permettant de récupérer l'ensemble des accessoires
	 * 
	 * @return TreeSet<Marque> L'ensemble des accessoires
	 */
	protected TreeSet<Marque> getMarquesCompatibles() 
	{
		return marquesCompatibles;
	}

	/**
	 * Setter permettant de définir l'ensemble des accessoires
	 * 
	 * @param marquesCompatibles : TreeSet<Marque> - Liste des accessoires
	 */
	protected void setMarquesCompatibles(TreeSet<Marque> marquesCompatibles) 
	{
		this.marquesCompatibles = marquesCompatibles;
	}

	/**
	 * Redéfinition de la méthode toString
	 * @return Affiche l'ensemble des marques compatibles pour l'accessoire
	 */
	public String toString() 
	{
		String result = super.toString() + " est compatible avec les marques suivantes : ";
		
		if (!marquesCompatibles.isEmpty()) 
		{
			for (Marque marque : getMarquesCompatibles())
				result += marque.toString() +";";
		}
		else 
		{
			result += "aucune";
		}
		
		return result;
	}
}