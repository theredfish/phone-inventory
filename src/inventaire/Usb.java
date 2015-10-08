/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Usb
 * 	Classe fille de la classe Chargeur
 * 	Classe permettant d'avoir les différentes caractéritiques d'un chargeur USB
 */

package inventaire;

import java.util.TreeSet;

public class Usb extends Chargeur 
{
	// Definition attributs
	
	// Definition constructeur
	/**
	 * Constructeur de la classe Usb
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marquesCompatibles
	 */
	protected Usb(String reference, String intitule, double prix, TreeSet<Marque> marquesCompatibles) {
		super(reference, intitule, prix, marquesCompatibles);
	}
	
	// Definition getter and setter

	// Definition method (process?)
	protected Article recherche() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return "Chargeur secteur " + super.toString();
	}
}