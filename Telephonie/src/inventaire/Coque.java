/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Coque
 * 	Classe fille de la classe Accessoire
 * 	Classe permettant de définir les différentes caractéristiques d'une coque
 */

package inventaire;

import java.util.TreeSet;

public class Coque extends Accessoire 
{
	// Definition attributs
	Couleur couleur;

	// Definition constructeur
	/**
	 * Constructeur de la classe Coque
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marquesCompatibles
	 * @param couleur
	 */
	public Coque(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles, Couleur couleur) {
		// TODO - implement Coque.Coque
		super(reference, intitule, prix, marquesCompatibles);
	}

	// Definition getter and setter
	
	
	// Definition method (process?)
	protected Article recherche() {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
		return "La coque " + super.toString();
	}
}