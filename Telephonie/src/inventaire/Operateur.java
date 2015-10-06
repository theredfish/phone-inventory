/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Opérateur
 * 	Classe permettant de définir les différentes caractéristiques d'un opérateur.
 */

package inventaire;

public class Operateur 
{
	// Definition attributs
	private String nom;

	// Definition constructeur
	/**
	 * Constructeur de la classe Operateur
	 * 
	 * @param nom
	 */
	public Operateur(String nom) {
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
	public String toString()
	{
		return nom;
	}

}