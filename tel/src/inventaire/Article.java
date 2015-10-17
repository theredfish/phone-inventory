/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.util.UUID;

/**
 * 	Classe abstraite permettant de d�finir les diff�rentes caract�ristiques d'un article
 */
public abstract class Article 
{
	/**
	 * String La reference d'un article
	 */
	protected String reference;
	/**
	 * String L'intitule d'un article
	 */
	protected String intitule;
	/**
	 * Double Le prix d'un article
	 */
	protected double prix;
	
	/**
	 * Constructeur de la classe Article
	 * 
	 * @param String reference : La reference d'un article
	 * @param String intitule : L'intitule d'un article
	 * @param double prix : Le prix d'un article
	 */
	protected Article(String intitule, double prix) 
	{
		this.generateUuidReference();
		this.intitule = intitule;
		this.prix = prix;
	}
	
	/**
	 * Getter permettant de connaitre la r�f�rence d'un article
	 * 
	 * @return String reference
	 */
	public String getReference() 
	{
		return reference;
	}

	/**
	 * Setter permettant de changer la r�f�rence d'un article
	 * 
	 * @param String reference La r�f�rence de l'article
	 */
	public void generateUuidReference() 
	{
		this.reference = estClasse() + UUID.randomUUID().toString();
	}
	
	public Object estClasse()
	{
		String res = "";

		if (this instanceof Telephone) {
			res = "T";
		}
		else if (this instanceof AllumeCigare) {
			res = "A";
		}
		else if (this instanceof Coque) {
			res = "Q";
		}
		else if (this instanceof Cordon) {
			res = "R";
		}
		else if (this instanceof Secteur) {
			res = "S";
		}
		else if (this instanceof Usb) {
			res = "U";
		}
		
		
		
		return res;
	}

	/**
	 * Getter permettant de connaitre l'intitul� d'un article
	 * 
	 * @return String intitule
	 */
	public String getIntitule() 
	{
		return this.intitule;
	}

	/**
	 * Setter permettant de changer l'intitul� d'un article
	 * 
	 * @param String reference L'intitul� de l'article
	 */
	public void setIntitule(String intitule) 
	{
		this.intitule = intitule;
	}

	/**
	 * Getter permettant de connaitre le prix d'un article
	 * 
	 * @return int prix
	 */
	public double getPrix() 
	{
		return this.prix;
	}

	/**
	 * Setter permettant de changer le prix d'un article
	 * 
	 * @param int reference Le prix de l'article
	 */
	public void setPrix(double prix) 
	{
		this.prix = prix;
	}
	
	/**
	 * M�thode permettant d'afficher les informations de l'article
	 * 
	 * @return Affichage des informations de l'article
	 */
	public String toString() {
		return " a pour r�f�rence '" + reference + "' porte l'intitul� " + intitule + " a pour prix " + prix + " euros";
	}
}