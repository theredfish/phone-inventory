/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Article
 * 	Classe abstraite permettant de d�finir les diff�rentes caract�ristiques d'un article
 */

package inventaire;

public abstract class Article 
{
	// Definition attributs
	private String reference;
	private String intitule;
	private double prix;
	
	// Definition constructeur
	/**
	 * Constructeur de la classe Article
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 */
	protected Article(String reference, String intitule, double prix) {
		this.reference = reference;
		this.intitule = intitule;
		this.prix = prix;
	}
	
	// Definition getter and setter
	protected String getReference() {
		return reference;
	}

	protected void setReference(String reference) {
		this.reference = reference;
	}

	protected String getIntitule() {
		return this.intitule;
	}

	protected void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	protected double getPrix() {
		return this.prix;
	}

	protected void setPrix(double prix) {
		this.prix = prix;
	}

	// Definition method (process?)
	public String toString() {
		return " a pour r�f�rence '" + reference + "' porte l'intitul� " + intitule + " a pour prix " + prix + " euros";
	}

	protected abstract Article recherche();

}