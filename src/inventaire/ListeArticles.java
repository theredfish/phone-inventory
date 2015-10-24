/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package inventaire;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import utils.CompareArticleIntitule;
import utils.CompareArticlePrix;
import utils.CompareArticleRef;

/** 
 * 	Classe permettant d'avoir une liste d'article
 */
public class ListeArticles
{
	/**
	 * Chemin vers le fichier gérant les informations d'inventaire
	 */
	private final String fichierListeArticles = "./listeArticles.txt";
	
	/**
	 * ArrayList Liste des articles
	 */
	private ArrayList<Article> articles;
	
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
	 * @return boollean True si l'article à bien été ajouté sinon False
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
		return articles.remove(article);		
	}
	
	/**
	 * Méthode permettant d'obtenir la taille de la liste des articles
	 * 
	 * @return int
	 */
	public int getTaille()
	{
		return this.articles.size();
	}
	
	/**
	 * Méthode permettant de tester si un élément est présent
	 * dans la liste des articles.
	 * 
	 * @param article
	 * @return boolean true si l'article à bien été ajouté sinon false
	 */
	public boolean contient(Article article)
	{
		return articles.contains(article);
	}

	/**
	 * Méthode permettant d'afficher tous les articles suivant leur référence
	 * 
	 * @param String reference Référence que nous voulons pour les articles
	 * @return La liste des article portant la référence souhaitée - ArrayList<Article>
	 */
	public void tousLesArticles_ParRef() 
	{
		Comparator<Article> c;
		
		c = new CompareArticleRef();
		
		Collections.sort(articles, c);
		
		if (articles.size() == 0)
			System.out.println("Aucun article n'est présent.");
		else
			for (Article article : articles)
				System.out.println(article.toString());
	}

	/**
	 * Méthode permettant d'afficher tous les articles suivant leur intitulé
	 * 
	 * @param String intitule Intitulé que nous voulons pour les articles
	 * @return La liste des article portant l'intitulé souhaité - ArrayList<Article>
	 */
	public void tousLesArticles_ParIntitule() 
	{
		Comparator<Article> c;
		
		c = new CompareArticleIntitule();
		
		Collections.sort(articles, c);
		
		if (articles.size() == 0)
			System.out.println("Aucun article n'est présent.");
		else
			for (Article article : articles)
				System.out.println(article.toString());
	}
	
	public void tousLesArticles_ParPrix()
	{
		Comparator<Article> c;
		
		c = new CompareArticlePrix();
		
		Collections.sort(articles, c);
		
		if (articles.size() == 0)
			System.out.println("Aucun article n'est présent.");
		else
			for (Article article : articles)
				System.out.println(article.toString());
	}
	
	public void sauvegarde() throws FileNotFoundException, IOException
	{	
		FileWriter file_articles = new FileWriter(fichierListeArticles);
		BufferedWriter buffer_articles = new BufferedWriter(file_articles);
		
		for (Article article : articles) {
			buffer_articles.write(article.toString() + "\n");
		}
		
		buffer_articles.close();
		
	}

	/**
	 * Méthode permettant de rechercher tous les articles suivant leur prix
	 * 
	 * @param int prix Prix que nous voulons pour les articles
	 * @return La liste des article portant le prix souhaité - ArrayList<Article>
	 */
	public ArrayList<Article> chercherArticlesPrix(double prix) 
	{
		ArrayList<Article> articlePrix = new ArrayList<>();
		
		for (Article article : articles) 
		{
			if (article.getPrix() == prix)
				articlePrix.add(article);
		}
		
		return articlePrix;
	}
	
	/**
	 * Méthode permettant de chercher un article par sa référence.
	 * Une référence est forcément unique.
	 * 
	 * @param reference qui représente la référence de l'article.
	 * @return null sinon l'article s'il est trouvé.
	 */
	public Article chercherArticleReference(String reference)
	{	
		for (Article article : articles) 
		{
			if (article.getReference().equals(reference))
				return article;
		}
		
		return null;
	}
	
	/**
	 * Méthode permettant de chercher les articles selon leur intitulé.
	 * 
	 * @param intitule qui représente l'intitulé de l'article.
	 * @return l'ensemble des articles portant l'intitulé.
	 */
	public ArrayList<Article> chercherArticlesIntitule(String intitule)
	{
		ArrayList<Article> articleIntitule = new ArrayList<>();
		
		for (Article article : articles) 
		{
			if (article.getIntitule().equals(intitule))
				articleIntitule.add(article);
		}
		
		return articleIntitule;
	}
}