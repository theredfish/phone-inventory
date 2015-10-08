/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe :
 */

package inventaire;

import java.util.*;

public class ListeArticles implements Comparable 
{
	// Définition attributs
	Collection<Article> articles;

	// Définition constructeur
	/**
	 * Constructeur de la classe ListeArticles
	 * 
	 * @param articles : ArrayList<Article> - Liste d'article
	 */	
	public ListeArticles(ArrayList<Article> articles) 
	{
		this.articles = articles;
	}
	
	/**
	 * Constructeur de la classe ListeArticle
	 */
	public ListeArticles() 
	{
		this.articles = new Collection<Article>();
	}

	// Definition getter and setter
	
	// Definition des méthodes
	/**
	 * Méthode permettant d'ajouter un article à la liste
	 * @param article : Article - Article que l'on souhaite ajouter à la liste
	 * @return True si l'article à bien été ajouté sinon False
	 */
	public boolean ajouter(Article article) 
	{
		return articles.add(article);
	}
	
	/**
	 * Méthode permettant de supprimer un article de la liste
	 * @param article : Article - Article que l'on souhaite supprimer à la liste
	 * @return True si l'article à bien été supprimé sinon False
	 */
	public return supprimer(Article article) 
	{
		if (articles.concontains(article))
			return articles.remove(article);
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