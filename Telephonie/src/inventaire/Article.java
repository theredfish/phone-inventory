package inventaire;

public abstract class Article {

	private String reference;
	private String intitule;
	private double prix;

	protected String getReference() {
		// TODO - implement Article.getReference
		return "";
	}

	/**
	 * 
	 * @param reference
	 */
	protected void setReference(String reference) {
		this.reference = reference;
	}

	protected String getIntitule() {
		return this.intitule;
	}

	/**
	 * 
	 * @param intitule
	 */
	protected void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	protected double getPrix() {
		return this.prix;
	}

	/**
	 * 
	 * @param prix
	 */
	protected void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 */
	protected Article(String reference, String intitule, double prix) {
		// TODO - implement Article.Article
	}

	public String toString() {
		// TODO - implement Article.toString
		return "";
	}

	protected abstract Article recherche();

}