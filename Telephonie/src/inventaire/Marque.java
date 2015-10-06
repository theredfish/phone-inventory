/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Marque
 * 	Classe permettant de définir les différentes caractéristiques d'une marque.
 */

package inventaire;

public class Marque {

	// Definition attributs
	private String nom;

	// Definition constructeur
	/**
	 * Constructeur de la classe Marque
	 * 
	 * @param nom
	 */
	public Marque(String nom) {
		this.nom = nom;
	}

	// Definition getter and setter
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	// Definition method (process?)
	public String toString() {
		return nom;
	}
}