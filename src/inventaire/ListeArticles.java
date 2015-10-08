/**
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : ListeArticle
 * 	Classe implementant la classe Comparable
 * 	Classe permettant de 
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
		this.articles = new ArrayList<Article>();
	}

	// Définition getter et setter
	
	// Définition des méthodes
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
	 * @return 
	 * @return True si l'article à bien été supprimé sinon False
	 */
	public boolean supprimer(Article article) 
	{
		if (articles.contains(article))
			return articles.remove(article);
		return false;
	}

	/**
	 * Méthode permettant d'afficher tous les articles suivant leur référence
	 * @param reference : String - Référence que nous voulons pour les articles
	 * @return La liste des article portant la référence souhaitée - ArrayList<Article>
	 */
	public ArrayList<Article> tousLesArticles_ParRef(String reference) 
	{
		ArrayList<Article> articleRef = new ArrayList<>();
		
		for (Article article : articles) 
		{
			if (article.getReference().equals(reference))
				articleRef.add(article);
		}
		
		return articleRef;
	}

	/**
	 * Méthode permettant d'afficher tous les articles suivant leur intitulé
	 * @param intitule : String - Intitulé que nous voulons pour les articles
	 * @return La liste des article portant l'intitulé souhaité - ArrayList<Article>
	 */
	public ArrayList<Article> tousLesArticles_ParIntitule(String intitule) 
	{
		// TODO - implement ListeArticles.tousLesArticles_ParIntitule
		throw new UnsupportedOperationException();
	}

	/**
	 * Méthode permettant d'afficher tous les articles suivant leur prix
	 * @param prix : int - Prix que nous voulons pour les articles
	 * @return La liste des article portant le prix souhaité - ArrayList<Article>
	 */
	public ArrayList<Article> tousLesArticles_ParPrix(int prix) 
	{
		// TODO - implement ListeArticles.tousLesArticles_ParPrix
		throw new UnsupportedOperationException();
	}

}