/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/** 
 * 	Classe permettant d'avoir une liste d'article
 */
public class ListeArticles
{
	/**
	 * ArrayList Liste des articles
	 */
	ArrayList<Article> articles;

	/**
	 * Constructeur de la classe ListeArticles
	 * 
	 * @param ArrayList<Article> articles Liste d'article
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
	
	/**
	 * Méthode permettant d'ajouter un article à la liste
	 * 
	 * @param Article article Article que l'on souhaite ajouter à la liste
	 * @return Boolean True si l'article à bien été ajouté sinon False
	 */
	public boolean ajouter(Article article) 
	{
		return articles.add(article);
	}
	
	/**
	 * Méthode permettant de supprimer un article de la liste
	 * 
	 * @param article : Article - Article que l'on souhaite supprimer à la liste
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
	 * 
	 * @param String reference Référence que nous voulons pour les articles
	 * @return La liste des article portant la référence souhaitée - ArrayList<Article>
	 */
	public ArrayList<Article> tousLesArticles_ParRef() 
	{
		ArrayList<Article> articleRef = new ArrayList<>();
		
		return articleRef;
	}

	/**
	 * Méthode permettant d'afficher tous les articles suivant leur intitulé
	 * 
	 * @param String intitule Intitulé que nous voulons pour les articles
	 * @return La liste des article portant l'intitulé souhaité - ArrayList<Article>
	 */
	public ArrayList<Article> tousLesArticles_ParIntitule() 
	{
		ArrayList<Article> articleIntitule = new ArrayList<>();
				
		return articleIntitule;
	}

	
	/**
	 * Methode permettant de sauvegarder les articles dans un fichier
	 */
	public void sauvegarde()
	{
		try
		{
			FileWriter fileSave = new FileWriter("../save.txt");
		}
		catch (IOException message)
		{
			System.out.println(message.getMessage());
		}
	}
	
	/**
	 * Méthode permettant d'afficher tous les articles suivant leur prix
	 * 
	 * @param int prix Prix que nous voulons pour les articles
	 * @return La liste des article portant le prix souhaité - ArrayList<Article>
	 */
	public ArrayList<Article> chercherArticlesPrix(int prix) 
	{
		ArrayList<Article> articlePrix = new ArrayList<>();
		
		for (Article article : articles) 
		{
			if (article.getPrix() == prix)
				articlePrix.add(article);
		}
		
		return articlePrix;
	}
}