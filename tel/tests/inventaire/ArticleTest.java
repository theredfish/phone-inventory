package inventaire;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import inventaire.Article;

public class ArticleTest {
	public ArrayList<Article> listeArticles;
	
	@Before
	public void initialize() {
		this.listeArticles = new ArrayList<Article>();
		 
		Marque m1 = new Marque("Nokia");
		Operateur op1 = new Operateur("Orange");
		Article a1 = new Telephone("Nokia 3000", 75.89, m1, op1);
		this.listeArticles.add(a1);
		
		Marque m2 = new Marque("Samsung");
		Operateur op2 = new Operateur("Free");
		Article a2 = new Telephone("Samsung 3GS", 199.99, m2, op2);
		this.listeArticles.add(a2);
		
		Article a3 = new Telephone("Nokia 3000EOF", 75.89, m1, op1);
		this.listeArticles.add(a3);
		
		Marque m4 = new Marque("Sony");
		Operateur op4 = new Operateur("Free");
		Article a4 = new Telephone("Sony XPERIA PRO", 255, m4, op4);
		this.listeArticles.add(a4);
		
		Marque m5 = new Marque("Wiko");
		Operateur op5 = new Operateur("Virgine Mobile");
		Article a5 = new Telephone("Wiko Rainbow", 100.50, m5, op5);
		this.listeArticles.add(a5);
		
		Article a6 = new Telephone("Wiko Rainbow", 100.50, m5, op5);
		this.listeArticles.add(a6);
	}
}
