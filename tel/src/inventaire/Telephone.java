/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

/**
 * 	Classe permettant de définir les différentes caractéristiques d'un téléphone.
 */
public class Telephone extends Article 
{
	/**
	 * Operateur L'opérateur du téléphone
	 */
	private Operateur operateur;
	/**
	 * Marque La marque du téléphone
	 */
	private Marque marque;

	/**
	 * Constructeur de la classe Telephone
	 * 
	 * @param String intitule : L'intitule du téléphone
	 * @param double prix : Le prix du téléphone
	 * @param Marque marque : La marque du téléphone
	 * @param Operateur operateur : L'opérateur du téléphone
	 */
	public Telephone(String intitule, double prix, Marque marque, Operateur operateur) 
	{
		super(intitule, prix);
		this.marque = marque;
		this.operateur = operateur;
	}

	/**
	 * Getter permettant de connaitre l'opérateur d'un téléphone
	 * 
	 * @return Operateur operateur
	 */
	public Operateur getOperateur() 
	{
		return operateur;
	}

	/**
	 * Setter permettant de changer l'operateur du téléphone
	 * 
	 * @param Operateur operateur : L'operateur du téléphone
	 */
	public void setOperateur(Operateur operateur) 
	{
		this.operateur = operateur;
	}

	/**
	 * Getter permettant de connaitre la marque d'un téléphone
	 * 
	 * @return Marque marque
	 */
	public Marque getMarque() 
	{
		return marque;
	}

	/**
	 * Setter permettant de changer la marque du téléphone
	 * 
	 * @param Marque marque : La marque du téléphone
	 */
	public void setMarque(Marque marque) 
	{
		this.marque = marque;
	}

	/**
	 * Méthode permettant d'afficher les informations du téléphone
	 * @return String
	 */
	public String toString() 
	{
		return "Téléphone de la marque " + marque + " avec l'opérateur " + operateur + super.toString();
	}
}