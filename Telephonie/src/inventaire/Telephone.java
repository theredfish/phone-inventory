package inventaire;

public class Telephone extends Article {

	Operateur operateur;
	Marque marque;

	/**
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marque
	 * @param operateur
	 */
	public Telephone(String reference, String intitule, double prix, Marque marque, Operateur operateur) {
		// TODO - implement Telephone.Telephone
		super(reference, intitule, prix);
	}

	public String toString() {
		// TODO - implement Telephone.toString
		throw new UnsupportedOperationException();
	}

	@Override
	protected Article recherche() {
		// TODO Auto-generated method stub
		return null;
	}

}