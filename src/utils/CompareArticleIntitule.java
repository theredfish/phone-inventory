/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package utils;

import java.util.Comparator;

import inventaire.Article;

/**
 * Classe de comparaison des articles par intitulé
 */
public class CompareArticleIntitule implements Comparator<Article> 
{
	/**
	 * Comparaison des articles selon leur intitulé
	 * 
	 * @param Article a1 : Le premier article
	 * @param Article a2 : Le second article
	 */
	public int compare(Article a1, Article a2) 
	{
		return a1.getIntitule().compareToIgnoreCase(a2.getIntitule());
	}
}
