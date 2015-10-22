/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

/**
 * Classe d'Enumération des couleurs que peuvent prendre les accessoires
 */
public enum Couleur 
{
	Bleu("Bleu"), Noir("Noir"), Blanc("Blanc");
	
	private String couleur;
	
	private Couleur(String couleur)
	{
		this.couleur = couleur;
	}
	
	public static boolean couleurExiste(String couleur)
	{
		Couleur[] couleurs = Couleur.values();
		
		for (Couleur c : couleurs)
			if (c.toString().equalsIgnoreCase(couleur))
				return true;

		return false;
	}
	
	public String getCouleur()
	{
		return this.couleur;
	}
}