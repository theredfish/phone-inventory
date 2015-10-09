/**
 * @author Marina Blin - Julian Didier
 * @version 1.0.0
 */

package utils;

import inventaire.Article;

/**
 * Classe de comparaison des articles par référence
 */
public class CompareArticleRef {
	
	/**
	 * Comparaison des articles selon leur référence
	 * 
	 * @param Article a1 : Le premier article
	 * @param Article a2 : Le second article
	 */
	public int compare(Article a1, Article a2) 
	{
		return a1.getIntitule().compareToIgnoreCase(a2.getIntitule());
	}
}
