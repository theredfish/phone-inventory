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
	// Definition attributs
	private TreeSet<Marque> marquesCompatibles;

	// Definition constructeur
	/**
	 * Constructeur de la classe Accessoire
	 * 
	 * @param reference : String - référence d'un article
	 * @param intitule : String - intitulé d'un article
	 * @param prix : double - prix d'un article
	 * @param marquesCompatibles : TreeSet<Marque> - marques associées à l'article
	 */
	protected Accessoire(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) {
		super(reference, intitule, prix);
		this.marquesCompatibles = marquesCompatibles;
	}
	
	// Definition getter and setter
	public TreeSet<Marque> getMarquesCompatibles() {
		return marquesCompatibles;
	}

	public void setMarquesCompatibles(TreeSet<Marque> marquesCompatibles) {
		this.marquesCompatibles = marquesCompatibles;
	}

	// Definition method (process?)
	public String toString() {
		String result = super.toString() + " est compatible avec les marques suivantes :\n";
		
		if (!marquesCompatibles.isEmpty()) {
			for (Marque marque : marquesCompatibles) 
			{
				result += "- " + marque.toString() +"\n";
			}
		}
		else {
			result += "aucune";
		}
		
		return result;
	}
}