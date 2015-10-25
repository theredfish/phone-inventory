/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.util.UUID;

/**
 * 	Classe abstraite permettant de définir les différentes caractéristiques d'un article
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
	 * Setter permettant de changer la référence d'un article
	 * 
	 * @param String reference La référence de l'article
	 */
	private void generateUuidReference() 
	{
		this.reference = UUID.randomUUID().toString();
	}
	
	/**
	 * Getter permettant de connaitre la référence d'un article
	 * 
	 * @return String reference
	 */
	public String getReference() 
	{
		return reference;
	}

	/**
	 * Getter permettant de connaitre l'intitulé d'un article
	 * 
	 * @return String intitule
	 */
	public String getIntitule() 
	{
		return this.intitule;
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
	 * Redéfinition de la méthode equals
	 * 
	 * @return boolean vrai si les objets sont égaux, faux sinon 
	 */
	public boolean equals(Object o) {
		if (o instanceof Article) {
			Article article = (Article) o;
			
			// On omet la référence car elle n'entre pas dans les critères de comparaison.
			// De plus elle rend unique et donc différent chaque article (jamais equals).
			return (article.intitule.equalsIgnoreCase(this.intitule)
					&& article.prix == this.prix);
		}
		
		return super.equals(o);
	}
	
	/**
	 * Méthode permettant d'afficher les informations de l'article
	 * 
	 * @return String
	 */
	public String toString() {
		return " a pour référence '" + getReference() 
				+ "' porte l'intitulé " + getIntitule() 
				+ " a pour prix " + getPrix() + " euros";
	}
}