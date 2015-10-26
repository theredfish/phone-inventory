/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

/**
 * 	Classe permettant de définir les différentes caractéristiques d'une marque.
 */
public class Marque implements Comparable<Marque>
{
	/**
	 * String le nom d'une marque
	 */
	private String nom;

	/**
	 * Constructeur de la classe Marque
	 * 
	 * @param String nom : Le nom d'une marque
	 */
	public Marque(String nom) 
	{
		this.nom = nom;
	}

	/**
	 * Getter permettant de récupérer le nom d'une marque
	 * 
	 * @return String nom
	 */
	public String getNom() 
	{
		return this.nom;
	}

	/**
	 * Redéfinition de la méthode toString
	 * @return Affiche le nom de la marque
	 */
	public String toString() 
	{
		return nom;
	}
	
	/**
	 * Redéfinition de la méthode equals
	 * Permet de comparer un objet avec l'instance de la classe et ses attributs
	 * 
	 * @return true si les objets sont égaux sinon false
	 */
	public boolean equals(Object o) {
		if (o instanceof Marque) {
			Marque m = (Marque) o;
			
			return (m.nom.equalsIgnoreCase(this.nom));
		}
		else
			return super.equals(o);
	}
	
	/**
	 * Définition de la classe compareTo
	 * 
	 * @return un entier négatif, zéro, ou un entier positif si l'objet 
	 * est plus petit, égal ou plus grand que l'objet spécifié
	 */
	public int compareTo(Marque m) {
		return this.nom.compareToIgnoreCase(m.nom);
	}
}