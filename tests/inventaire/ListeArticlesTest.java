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
//		System.out.println("Taille avant : " + size_before_add + " et nouvelle taille : " + liste_articles.getTaille());
		assertEquals("Nombre d'articles == taille avant + 1", liste_articles.getTaille(), size_before_add +1);
	}
	
	@Test
	public void supprimerTest() {
		ListeArticles liste_articles = new ListeArticles(articles);
		Marque m1 = new Marque("Nokia");
		Operateur op1 = new Operateur("Orange");
		Article a1 = new Telephone("Nokia 3000", 75.89, m1, op1);
		
		liste_articles.ajouter(a1);
		int size_before_add = liste_articles.getTaille();
		boolean res = liste_articles.supprimer(a1);
		
		assertEquals("Nombre d'articles == taille avant - 1", liste_articles.getTaille(), size_before_add -1);
		assertTrue("Bien supprimé => true", res);
	}
	
	@Test
	public void tousLesArticles_ParRefTest() {
		Marque m1 = new Marque("Nokia");
		Operateur op1 = new Operateur("Orange");
		
		Article a1 = new Telephone("Tel zalou", 34.15, m1, op1);
		Article a2 = new Telephone("Tel xalou", 34.15, m1, op1);
		Article a3 = new Telephone("1el zalou", 34.15, m1, op1);
		
		this.articles.add(a1);
		this.articles.add(a2);
		this.articles.add(a3);
		
		ListeArticles liste_articles = new ListeArticles(this.articles);
		System.out.println("===============Test tous les articles par référence======================");
		liste_articles.tousLesArticles_ParRef();
		System.out.println("\n");
	}
	
	@Test
	public void tousLesArticles_ParPrixTest() {
		Marque m1 = new Marque("Nokia");
		Operateur op1 = new Operateur("Orange");
		
		Article a1 = new Telephone("Tel zalou", 12.15, m1, op1);
		Article a2 = new Telephone("Tel xalou", -01.15, m1, op1);
		Article a3 = new Telephone("1el zalou", 4.156789, m1, op1);
		
		this.articles.add(a1);
		this.articles.add(a2);
		this.articles.add(a3);
		
		ListeArticles liste_articles = new ListeArticles(this.articles);
		System.out.println("===============Test tous les articles par prix======================");
		liste_articles.tousLesArticles_ParPrix();
		System.out.println("\n");
	}
	
	@Test
	public void tousLesArticles_ParIntituleTest() {
		Marque m1 = new Marque("Nokia");
		Operateur op1 = new Operateur("Orange");
		
		Article a1 = new Telephone("Tel zalou", 12.15, m1, op1);
		Article a2 = new Telephone("Tel xalou", -01.15, m1, op1);
		Article a3 = new Telephone("ael zalou", 4.156789, m1, op1);
		
		this.articles.add(a1);
		this.articles.add(a2);
		this.articles.add(a3);
		
		ListeArticles liste_articles = new ListeArticles(this.articles);
		System.out.println("===============Test tous les articles par intitule======================");
		liste_articles.tousLesArticles_ParIntitule();
		System.out.println("\n");
	}
}
