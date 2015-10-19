package inventaire;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ListeArticlesTest {

	private ArrayList<Article> articles;
	
	@Before
	public void initialize() throws Exception {
		this.articles = new ArrayList<Article>();
	}

	@Test
	public void ajouterTest() {
		ListeArticles liste_articles = new ListeArticles(articles);
		int size_before_add = liste_articles.getTaille();
		
		Marque m1 = new Marque("Nokia");
		Operateur op1 = new Operateur("Orange");
		Article a1 = new Telephone("Nokia 3000", 75.89, m1, op1);
		
		liste_articles.ajouter(a1);
		System.out.println("Taille avant : " + size_before_add + " et nouvelle taille : " + liste_articles.getTaille());
		assertEquals("Nombre d'articles == taille avant + 1", liste_articles.getTaille(), size_before_add +1);
	}

}
