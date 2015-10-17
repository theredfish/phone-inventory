/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

 /**
  * 	Classe permettant de définir les différentes caractéristiques d'un opérateur.
  */
public class Operateur 
{
	/**
	 * String nom : Le nom de l'opérateur
	 */
	private String nom;

	/**
	 * Constructeur de la classe Operateur
	 * 
	 * @param String nom : Le nom de l'opérateur
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