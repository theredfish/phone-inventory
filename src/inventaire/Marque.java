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
	 * Setter permettant de définir le nom d'une marque
	 * 
	 * @param String nom : Le nom de la parque
	 */
	public void setNom(String nom) 
	{
		this.nom = nom;
	}

	/**
	 * Redéfinition de la méthode toString
	 * @return Affiche le nom de la marque
	 */
	public String toString() 
	{
		return nom;
	}

	public boolean equals(Object o) {
		if (o instanceof Marque) {
			Marque m = (Marque) o;
			
			return (m.nom.equalsIgnoreCase(this.nom));
		}
		else
			return super.equals(o);
	}

	public int compareTo(Marque m) {
		return this.nom.compareToIgnoreCase(m.nom);
	}
}