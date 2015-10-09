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
		// On trie selon le prix, mais si égaux aussi par intitulés
		// et si intitulés égaux également par référence
		
		int intitule_res = 0;
		int prix_res = 0;
		
		prix_res = Double.compare(a1.getPrix(), a2.getPrix());
		
		if (prix_res == 0) {
			intitule_res = a1.getIntitule().compareToIgnoreCase(a2.getIntitule());
			
			if (intitule_res == 0) {
				return a1.getReference().compareTo(a1.getReference());
			}
			
			return intitule_res;
		}
		
		return prix_res;
	}
}
