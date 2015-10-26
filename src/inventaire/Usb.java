/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.util.TreeSet;

/**
 * 	Classe permettant d'avoir les différentes caractéritiques d'un chargeur USB
 */
public class Usb extends Chargeur 
{
	/**
	 * Constructeur de la classe Usb
	 * 
	 * @param String intitule : L'intitule d'un article
	 * @param double prix : Le prix d'un article
	 * @param TreeSet<Marque> marquesCompatibles : Les marques associées à l'article
	 */
	public Usb(String intitule, double prix, TreeSet<Marque> marquesCompatibles) 
	{
		super(intitule, prix, marquesCompatibles);
	}
	
	/**
	 * Constructeur de la classe Usb
	 * 
	 * @param String intitule : L'intitule d'un article
	 * @param double prix : Le prix d'un article
	 */
	public Usb(String intitule, double prix) 
	{
		super(intitule, prix);
		this.marquesCompatibles = new TreeSet<Marque>();
	}
	
	/**
	 * Méthode permettant d'afficher les informations du chargeur USB
	 * @return String
	 */
	public String toString() 
	{
		return "Chargeur USB " + super.toString();
	}
}