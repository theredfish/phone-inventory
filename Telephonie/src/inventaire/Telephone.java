/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Telephone
 * 	Classe fille de la classe Article.
 * 	Classe permettant de d�finir les diff�rentes caract�ristiques d'un t�l�phone.
 */

package inventaire;

public class Telephone extends Article 
{
	// Definition attributs
	Operateur operateur;
	Marque marque;

	// Definition constructeur
	/**
	 * Constructeur de la classe Telephone
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marque
	 * @param operateur
	 */
	public Telephone(String reference, String intitule, double prix, Marque marque, Operateur operateur) {
		super(reference, intitule, prix);
		this.marque = marque;
		this.operateur = operateur;
	}

	// Definition getter and setter
	public Operateur getOperateur() {
		return operateur;
	}

	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	// Definition method (process?)
	public String toString() {
		return "T�l�phone de la marque " + marque + " avec l'op�rateur " + operateur + super.toString();
	}

	@Override
	protected Article recherche() {
		// TODO Auto-generated method stub
		return null;
	}
}