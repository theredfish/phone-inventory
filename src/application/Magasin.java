package application;

import inventaire.Accessoire;
import inventaire.AllumeCigare;
import inventaire.Article;
import inventaire.Coque;
import inventaire.Cordon;
import inventaire.Couleur;
import inventaire.ListeArticles;
import inventaire.Marque;
import inventaire.Operateur;
import inventaire.Secteur;
import inventaire.Telephone;
import inventaire.Usb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

public class Magasin {
	
	/**
	 * La liste des articles
	 */
	private ListeArticles listeArticles;
	
	private Scanner scText;
	private Scanner scDouble;
	private Scanner scInt;

	/**
	 * Constructeur de la classe Magasin
	 */
	public Magasin()
	{
		this.listeArticles = new ListeArticles();
		this.scText = new Scanner(new InputStreamReader(System.in));
		this.scDouble = new Scanner(new InputStreamReader(System.in));
		this.scInt = new Scanner(new InputStreamReader(System.in));
	}
	
	/**
	 * Affichage du menu principal
	 */
	public void menuPrincipal()
	{
		System.out.println("╔══ Menu ════════════════════════════════════════════════════════╗");
		System.out.println("║1) Ajouter un article à la liste d'articles                     ║");
		System.out.println("║2) Supprimer un article de la liste d'articles                  ║");
		System.out.println("║3) Trier les articles de la liste d'articles par référence      ║");
		System.out.println("║4) Trier les articles de la liste d'articles par intitulé       ║");
		System.out.println("║5) Trier les articles de la liste d'articles par prix           ║");
		System.out.println("║6) Rechercher un article à la liste d'articles par sa référence ║");
		System.out.println("║7) Rechercher un article à la liste d'articles par son intitulé ║");
		System.out.println("║8) Rechercher un article à la liste d'articles par son prix     ║");
		System.out.println("║9) Sauvegarder la liste d'articles                              ║");
		System.out.println("║10) Afficher la liste d'articles                                ║");
		System.out.println("║-1) Quitter l'application                                       ║");
		System.out.println("╚════════════════════════════════════════════════════════════════╝");
		
		System.out.println("Que souhaitez-vous faire ?");
		
		int choix = 0;
		
		while (choix == 0) {
			try {
				choix = scInt.nextInt();

				switch (choix) {
				
					case 1: ajouterArticle();
					case 2: supprimerArticle();
					case 3: tousLesArticles_ParRef();
					case 4: tousLesArticles_ParIntitule();
					case 5: tousLesArticles_ParPrix();
					case 6: rechercherArticle_ParRef();
					case 7: rechercherArticles_ParIntitule();
					case 8: rechercherArticles_ParPrix();
					case 9: sauvegarderListe();
					case 10: listeArticles.toString();
					case -1:
						System.out.println("Application fermée.");
						System.exit(0);
					default:
						System.out.println("Ce choix est impossible. Veuillez en faire un autre");
						choix = 0;
				}
			} catch (InputMismatchException e) {
				System.out.println("Ce choix est impossible. Veuillez en faire un autre");
				scInt.next(); // on consumme le token invalide
			}
		}
	}
	
	/**
	 * Affichage du menu d'ajout d'articles
	 */
	private void ajouterArticle() 
	{
		System.out.println("╔══ Menu Ajout ══════════════════════════════════════════════════╗");
		System.out.println("║1) Ajouter un Téléphone                                         ║");
		System.out.println("║2) Ajouter un Accessoire                                        ║");
		System.out.println("║3) Revenir au menu principal                                    ║");
		System.out.println("║4) Sauvegarder la liste d'articles                              ║");
		System.out.println("║-1) Quitter l'application                                       ║");
		System.out.println("╚════════════════════════════════════════════════════════════════╝");

		System.out.println("Que souhaitez-vous faire ?");
		
		int choix = 0;
		
		while (choix == 0) {
			try {
				choix = scInt.nextInt();
		
				switch (choix) {
					case 1: ajouterTelephone();
					case 2: ajouterAccessoire();
					case 3: menuPrincipal();
					case 4: sauvegarderListe();
					case -1:
						System.out.println("Application fermée.");
						System.exit(0);
					default:
						System.out.println("Ce choix est impossible. Veuillez en faire un autre");
						choix = 0;
				}
			} catch (InputMismatchException e) {
				System.out.println("Ce choix est impossible. Veuillez en faire un autre");
				scInt.next();
			}
		}
	}
	
	/**
	 * Affichage du menu d'ajout d'un téléphone
	 */
	private void ajouterTelephone()
	{	
		System.out.println("Quelle est la marque du téléphone ?");
		String nomMarque = scText.nextLine();
		
		System.out.println("Quel est l'opérateur du téléphone ?");
		String nomOperateur = scText.nextLine();
		
		System.out.println("Quel est l'intitulé du téléphone ?");
		String intitule = scText.nextLine();
		
		double prix = 0.0;
		
		while (prix == 0.0 || prix < 0.0) {
			System.out.println("Quel est le prix du téléphone ?");
			try {	
				 prix = scDouble.nextDouble();
					 
			} catch (InputMismatchException e) {
				System.out.println("Vous devez entrer un prix supérieur à 0.");
				prix = 0.0;
				scDouble.next();
			}
		}
		
		Marque marque = new Marque(nomMarque);
		Operateur operateur = new Operateur(nomOperateur);
		
		Article telephone = new Telephone(intitule, prix, marque, operateur);
		
		listeArticles.ajouter(telephone);
		
		System.out.println("L'article téléphone a bien été ajouté");
		System.out.println(telephone.toString());
		
		menuPrincipal();
	}
	
	/**
	 * Affichage du menu d'ajout d'un accessoire
	 */
	private void ajouterAccessoire()
	{
		System.out.println("╔══ Menu ajout Accessoire ═══════════════════════════════════════╗");
		System.out.println("║1) Ajouter un Cordon                                            ║");
		System.out.println("║2) Ajouter un Chargeur                                          ║");
		System.out.println("║3) Ajouter une Coque                                            ║");
		System.out.println("║4) Revenir au menu précédent                                    ║");
		System.out.println("║5) Revenir au menu principal                                    ║");
		System.out.println("║6) Sauvegarder la liste d'article                               ║");
		System.out.println("║-1) Quitter l'application                                       ║");
		System.out.println("╚════════════════════════════════════════════════════════════════╝");
		
		System.out.println("Que souhaitez-vous faire ?");
		
		int choix = 0;
		
		while (choix == 0) {
			try {
				choix = scInt.nextInt();

				switch (choix) {
					case 1: ajouterCordon();
					case 2: ajouterChargeur();
					case 3: ajouterCoque();
					case 4: ajouterArticle();
					case 5: menuPrincipal();
					case 6: sauvegarderListe();
					case -1:
						System.out.println("Application fermée.");
						System.exit(0);
					default:
						System.out.println("Ce choix est impossible. Veuillez en faire un autre");
						choix = 0;
				}
			} catch (InputMismatchException e) {
				System.out.println("Ce choix est impossible. Veuillez en faire un autre");
				scInt.next();
			}
		}
	}
	
	/**
	 * Affichage du menu d'ajout d'un cordon
	 */
	private void ajouterCordon()
	{	
		System.out.println("Quel est l'intitulé du cordon ?");
		String intitule = scText.nextLine();
	
		double prix = 0.0;
		
		while (prix == 0.0 || prix < 0.0) {
			System.out.println("Quel est le prix du cordon ?");
			try {	
				 prix = scDouble.nextDouble();
					 
			} catch (InputMismatchException e) {
				System.out.println("Vous devez entrer un prix supérieur à 0.");
				prix = 0.0;
				scDouble.next();
			}
		}
		
		double longueur = 0.0;
		
		while (longueur == 0.0 || longueur < 0.0) {
			System.out.println("Quelle est la longueur du cordon ?");
			try {	
				 longueur = scDouble.nextDouble();
					 
			} catch (InputMismatchException e) {
				System.out.println("Vous devez entrer une longueur supérieure à 0. ");
				longueur = 0.0;
				scDouble.next();
			}
		}
		
		System.out.println("Quelles sont les marques compatibles du cordon ? (Entrez une marque. Appuyer sur entrée. Faire -1 pour terminer la saisie");
		TreeSet<Marque> marquesCompatibles = saisirMarquesCompatibles();
		
		Accessoire cordon = new Cordon(intitule, prix, longueur, marquesCompatibles);
		
		listeArticles.ajouter(cordon);
		
		ajouterAccessoire();
	}
	
	/**
	 * Affichage du menu d'ajout d'une coque
	 */
	private void ajouterCoque()
	{	
		System.out.println("Quel est l'intitulé de la coque ?");
		String intitule = scText.nextLine();
		
		double prix = 0.0;
		
		while (prix == 0.0 || prix < 0.0) {
			System.out.println("Quel est le prix de la coque ?");
			try {	
				 prix = scDouble.nextDouble();
					 
			} catch (InputMismatchException e) {
				System.out.println("Vous devez entrer un prix supérieur à 0.");
				prix = 0.0;
				scDouble.next();
			}
		}
		
		Couleur couleur = null;
		String saisie = "";
		boolean couleurOk = false;
		
		// Tant que la couleur saisie n'est pas la bonne on continue de demander
		while(!couleurOk) {
			System.out.println("Quelle est la couleur de la coque ? Saisissez bleu, noir ou blanc");
			saisie = scText.nextLine();
			
			if (Couleur.couleurExiste(saisie)) {
				couleur = Couleur.valueOf(saisie.toUpperCase());
				couleurOk = true;
			}
			else {
				System.out.println("Cette couleur n'est pas présente. Veuillez en resaisir une.");
			}
		}
		
		listeArticles.ajouter(new Coque(intitule, prix, couleur));
		
		ajouterAccessoire();
	}
	
	/**
	 * Affichage du menu d'ajout d'un chargeur
	 */
	private void ajouterChargeur()
	{
		System.out.println("╔══ Menu ajout accessoire Chargeur ══════════════════════════════╗");
		System.out.println("║1) Ajouter un chargeur USB                                      ║");
		System.out.println("║2) Ajouter un chargeur Allume cigare                            ║");
		System.out.println("║3) Ajouter une chargeur Secteur                                 ║");
		System.out.println("║4) Revenir au menu précédent                                    ║");
		System.out.println("║5) Revenir au menu principal                                    ║");
		System.out.println("║6) Sauvegarder la liste d'article                               ║");
		System.out.println("║-1) Quitter l'application                                       ║");
		System.out.println("╚════════════════════════════════════════════════════════════════╝");
		
		System.out.println("Que souhaitez-vous faire ?");
		
		int choix = 0;
		
		while (choix == 0) {
			try {
				choix = scInt.nextInt();
				
				switch(choix) {
					case 1: ajouterChargeurUsb();
					case 2: ajouterAllumeCigare();
					case 3: ajouterChargeurSecteur();
					case 4: ajouterAccessoire();
					case 5: menuPrincipal();
					case 6: sauvegarderListe();
					case -1:
						System.out.println("Application fermée.");
						System.exit(0);
					default:
						System.out.println("Ce choix est impossible. Veuillez en faire un autre");
						choix = 0;
				}
			} catch (InputMismatchException e) {
				System.out.println("Ce choix est impossible. Veuillez en faire un autre");
				scInt.next();
			}
		}
	}
	
	/**
	 * Affichage du menu d'ajout d'un chargeur USB
	 */
	private void ajouterChargeurUsb()
	{	
		System.out.println("Quel est l'intitulé du chargeur USB ?");
		String intitule = scText.next();
		
		double prix = 0.0;
		
		while (prix == 0.0 || prix < 0.0) {
			System.out.println("Quel est le prix du chargeur USB ?");
			try {	
				 prix = scDouble.nextDouble();
					 
			} catch (InputMismatchException e) {
				System.out.println("Vous devez entrer un prix supérieur à 0.");
				prix = 0.0;
				scDouble.next();
			}
		}
		
		System.out.println("Quelles sont les marques compatibles du chargeur USB ? (Rentrer une marque. Appuyer sur entrée. Faire -1 pour terminer la saisie");
		TreeSet<Marque> marquesCompatibles = saisirMarquesCompatibles();
		
		Accessoire chargeurUSB = new Usb(intitule, prix, marquesCompatibles);
		
		listeArticles.ajouter(chargeurUSB);
		
		ajouterChargeur();
	}
	
	/**
	 * Affichage du menu d'ajout d'un allume cigare
	 */
	private void ajouterAllumeCigare()
	{
		System.out.println("Quel est l'intitulé du chargeur allume cigare ?");
		String intitule = scText.nextLine();
		
		double prix = 0.0;
		
		while (prix == 0.0 || prix < 0.0) {
			System.out.println("Quel est le prix du chargeur allume cigare ?");
			try {	
				 prix = scDouble.nextDouble();
					 
			} catch (InputMismatchException e) {
				System.out.println("Vous devez entrer un prix supérieur à 0.");
				prix = 0.0;
				scDouble.next();
			}
		}
		
		System.out.println("Quelles sont les marques compatibles du chargeur allume cigare ? (Rentrer une marque. Appuyer sur entrée. Faire -1 pour terminer la saisie");
		TreeSet<Marque> marquesCompatibles = saisirMarquesCompatibles();
		
		Accessoire chargeurAllumeCigare = new AllumeCigare(intitule, prix, marquesCompatibles);
		
		listeArticles.ajouter(chargeurAllumeCigare);
		
		ajouterChargeur();
	}
	
	/**
	 * Affichage du menu d'ajout d'un chargeur secteur
	 */
	private void ajouterChargeurSecteur()
	{	
		System.out.println("Quel est l'intitulé du chargeur secteur ?");
		String intitule = scText.nextLine();
		
		double prix = 0.0;
		
		while (prix == 0.0 || prix < 0.0) {
			System.out.println("Quel est le prix du chargeur secteur ?");
			try {	
				 prix = scDouble.nextDouble();
					 
			} catch (InputMismatchException e) {
				System.out.println("Vous devez entrer un prix supérieur à 0.");
				prix = 0.0;
				scDouble.next();
			}
		}
		
		System.out.println("Quelles sont les marques compatibles du chargeur secteur? (Rentrer une marque. Appuyer sur entrée. Faire -1 pour terminer la saisie");
		TreeSet<Marque> marquesCompatibles = saisirMarquesCompatibles();
		
		Accessoire chargeurSecteur = new Secteur(intitule, prix, marquesCompatibles);
		
		listeArticles.ajouter(chargeurSecteur);
		
		ajouterChargeur();
	}
	
	/**
	 * Affichage du menu de suppression d'un article
	 */
	private void supprimerArticle()
	{
		System.out.println("Quelle est la référence de l'article à supprimer ?");
		
		String reference = scText.nextLine();
		Article article = listeArticles.chercherArticleReference(reference);
		
		boolean res = listeArticles.supprimer(article);
		
		if (res)
			System.out.println("Article bien supprimé");
		else
			System.out.println("L'article n'a pas été supprimé. L'article ayant la référence " + reference + " n'existe pas.");

		menuPrincipal();
	}
	
	private void tousLesArticles_ParRef()
	{
		listeArticles.tousLesArticles_ParRef();
		menuPrincipal();
	}
	
	private void tousLesArticles_ParIntitule()
	{
		listeArticles.tousLesArticles_ParIntitule();
		menuPrincipal();
	}
	
	private void tousLesArticles_ParPrix()
	{
		listeArticles.tousLesArticles_ParPrix();
		menuPrincipal();
	}
	
	/**
	 * Affichage du menu de recherche par référence
	 */
	private void rechercherArticle_ParRef()
	{		
		System.out.println("Quelle est la référence de l'article à rechercher ?");
		String reference = scText.nextLine();
		Article article = listeArticles.chercherArticleReference(reference);
		
		if (article != null)
			System.out.println(article.toString());
		else
			System.out.println("Aucun article ayant cette référence");
		
		menuPrincipal();
	}
	
	/**
	 * Affichage du menu de recherche par intitulé
	 */
	private void rechercherArticles_ParIntitule()
	{
		System.out.println("Quelle est l'intitulé des articles à rechercher ?");
		String intitule = scText.nextLine();
		
		ArrayList<Article> articles = listeArticles.chercherArticlesIntitule(intitule);
		
		for (Article article : articles) {
			System.out.println(article.toString());
		}
		
		menuPrincipal();
	}
	
	/**
	 * Affichage du menu de recherche par prix
	 */
	private void rechercherArticles_ParPrix()
	{
		System.out.println("Quelle est le prix des articles à rechercher ?");
	
		double prix = 0.0;
		
		while (prix == 0.0 || prix < 0.0) {
			
			try {
				prix = scDouble.nextDouble();
				ArrayList<Article> articles = listeArticles.chercherArticlesPrix(prix);
				
				for (Article article : articles) {
					System.out.println(article.toString());
				}				
			} catch (InputMismatchException e) {
				System.out.println("Un montant supérieur à 0 est attendu.");
				scDouble.next();
			}
		}
		
		menuPrincipal();
	}
	
	/**
	 * Méthode utilitaire permettant de sauvegarder la liste des articles
	 */
	private void sauvegarderListe()
	{
		try {
			listeArticles.sauvegarde();
		} catch (IOException e) {
			System.out.println("Un problème est survenu lors de l'ouverture du fichier");
		}
	}
	
	/**
	 * Méthode utilitaire permettant de charger la liste des articles
	 */
	private void chargerLister()
	{
		// todo
	}
	
	/**
	 * Méthode utilitaire permettant de factoriser la saisie des marques compatibles.
	 * 
	 * @return TreeSet<Marque> l'ensemble des marques compatibles saisies 
	 */
	private TreeSet<Marque> saisirMarquesCompatibles()
	{
		TreeSet<Marque> marquesCompatibles = new TreeSet<Marque>();
		
		String saisie = "";
		while (!saisie.equals("-1")) 
		{
			saisie = scText.nextLine();
			
			if (!saisie.equals("-1")) 
			{
				Marque marque = new Marque(saisie);
				marquesCompatibles.add(marque);
				marque.toString();
			}
		}
		
		return marquesCompatibles;
	}
	
	/**
	 * Méthode main pour exécuter le programme.
	 * 
	 * @param args un tableau d'arguments
	 */
	public static void main(String[] args) 
	{
		Magasin magasin = new Magasin();
		magasin.menuPrincipal();
	}
}
