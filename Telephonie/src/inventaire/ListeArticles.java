/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe :
 */

package inventaire;

import java.util.*;

public class ListeArticles implements Comparable 
{
	// Definition attributs
	Collection<Article> articles;

	// Definition constructeur
	/**
	 * Constructeur de la classe ListeArticles
	 * 
	 * @param articles
	 */
	public ListeArticles(Collection<Article> articles)
	{
		this.articles = articles;
	}

	// Definition getter and setter
	
	// Definition method (process?)
	public void ajouter(Article article) {
		// TODO - implement ListeArticles.ajouter
		throw new UnsupportedOperationException();
	}
	
	public void supprimer(Article article) {
		// TODO - implement ListeArticles.supprimer
		throw new UnsupportedOperationException();
	}

	public ListeArticles(ArrayList<Article> articles) {
		// TODO - implement ListeArticles.ListeArticles
		throw new UnsupportedOperationException();
	}

	public ArrayList<Article> tousLesArticles_ParRef() {
		// TODO - implement ListeArticles.tousLesArticles_ParRef
		throw new UnsupportedOperationException();
	}

	public ArrayList<Article> tousLesArticles_ParIntitule() {
		// TODO - implement ListeArticles.tousLesArticles_ParIntitule
		throw new UnsupportedOperationException();
	}

	public ArrayList<Article> tousLesArticles_ParPrix() {
		// TODO - implement ListeArticles.tousLesArticles_ParPrix
		throw new UnsupportedOperationException();
	}

}