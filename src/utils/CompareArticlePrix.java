/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package utils;

import java.util.Comparator;

import inventaire.Article;

/**
 * Classe de comparaison des articles par prix
 */
public class CompareArticlePrix implements Comparator<Article>{
	
	/**
	 * Comparaison des articles selon leur prix
	 * 
	 * @param Article a1 : Le premier article
	 * @param Article a2 : Le second article
	 */
	public int compare(Article a1, Article a2) 
	{
		return Double.compare(a1.getPrix(), a2.getPrix());
	}
}
