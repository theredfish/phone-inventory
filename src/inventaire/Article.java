/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

/**
 * 	Classe abstraite permettant de définir les différentes caractéristiques d'un article
 */
public abstract class Article 
{
	/**
	 * String La reference d'un article
	 */
	private String reference;
	/**
	 * String L'intitule d'un article
	 */
	private String intitule;
	/**
	 * Double Le prix d'un article
	 */
	private double prix;
	
	/**
	 * Constructeur de la classe Article
	 * 
	 * @param String reference : La reference d'un article
	 * @param String intitule : L'intitule d'un article
	 * @param double prix : Le prix d'un article
	 */
	protected Article(String reference, String intitule, double prix) 
	{
		this.reference = reference;
		this.intitule = intitule;
		this.prix = prix;
	}
	
	/**
	 * Getter permettant de connaitre la référence d'un article
	 * @return String reference
	 */
	protected String getReference() 
	{
		return reference;
	}

	/**
	 * Setter permettant de changer la référence d'un article
	 * @param String reference La référence de l'article
	 */
	protected void setReference(String reference) 
	{
		this.reference = reference;
	}

	/**
	 * Getter permettant de connaitre l'intitulé d'un article
	 * @return String intitule
	 */
	protected String getIntitule() 
	{
		return this.intitule;
	}

	/**
	 * Setter permettant de changer l'intitulé d'un article
	 * @param String reference L'intitulé de l'article
	 */
	protected void setIntitule(String intitule) 
	{
		this.intitule = intitule;
	}

	/**
	 * Getter permettant de connaitre le prix d'un article
	 * @return int prix
	 */
	protected double getPrix() 
	{
		return this.prix;
	}

	/**
	 * Setter permettant de changer le prix d'un article
	 * @param int reference Le prix de l'article
	 */
	protected void setPrix(double prix) 
	{
		this.prix = prix;
	}

	/**
	 * Méthode permettant d'afficher les informations de l'article
	 */
	public String toString() {
		return " a pour référence '" + reference + "' porte l'intitulé " + intitule + " a pour prix " + prix + " euros";
	}
}