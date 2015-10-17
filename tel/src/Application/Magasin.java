/*
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Magasin
 * 	Classe d'application
 */

package Application;

import java.io.Console;
import java.util.Scanner;

import inventaire.*;

public class Magasin {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int sousMenu = 0;
		int sousSousMenu = 0;
		
		while (menu != -1) 
		{
			switch (menu) 
			{
				case 0:
					System.out.println("╔═══════════════════════════ Menu ══════════════════════════════╗");
					System.out.println("║1) Ajouter un article à la liste d'article                     ║");
					System.out.println("║2) Supprimer un article de la liste d'article                  ║");
					System.out.println("║3) Trier les articles de la liste d'article par référence      ║");
					System.out.println("║4) Trier les articles de la liste d'article par intitulé       ║");
					System.out.println("║5) Trier les articles de la liste d'article par prix           ║");
					System.out.println("║6) Rechercher un article à la liste d'article par sa référence ║");
					System.out.println("║7) Rechercher un article à la liste d'article par son intitulé ║");
					System.out.println("║8) Rechercher un article à la liste d'article par son prix     ║");
					System.out.println("║9) Sauvegarder la liste d'article                              ║");
					System.out.println("║-1) Quitter l'application                                      ║");
					System.out.println("╚═══════════════════════════════════════════════════════════════╝");
					
					System.out.println("Que souhaitez-vous faire ?");
					menu = sc.nextInt();
					break;
			
				case 1:
					System.out.println("╔═══════════════════════ Menu Ajout ═══════════════════════╗");
					System.out.println("║1) Ajouter un Téléphone                                   ║");
					System.out.println("║2) Ajouter un Accessoire                                  ║");
					System.out.println("║3) Revenir au menu principal                              ║");
					System.out.println("║4) Sauvegarder la liste d'article                         ║");
					System.out.println("║-1) Quitter l'application                                 ║");
					System.out.println("╚══════════════════════════════════════════════════════════╝");
					
					System.out.println("Que souhaitez-vous faire ?");
					sousMenu = sc.nextInt();
					
					if (sousMenu == 3) 
					{
						menu = 0;
					}
					else if (sousMenu == -1)
					{
						menu = -1;
					}
					else if (sousMenu == 4)
					{
						menu = 4;
					}
					else 
					{
						switch (sousMenu) 
						{
							case 1:
								System.out.println("Coucou sous menu 1");
								menu = 0;
								break;
	
							case 2:
								System.out.println("╔════════════════ Menu ajout Accessoire ════════════════╗");
								System.out.println("║1) Ajouter un Cordon                                   ║");
								System.out.println("║2) Ajouter un Chargeur                                 ║");
								System.out.println("║3) Ajouter une Coque                                   ║");
								System.out.println("║4) Revenir au menu précédent                           ║");
								System.out.println("║5) Revenir au menu principal                           ║");
								System.out.println("║6) Sauvegarder la liste d'article                      ║");
								System.out.println("║-1) Quitter l'application                              ║");
								System.out.println("╚═══════════════════════════════════════════════════════╝");
								
								System.out.println("Que souhaitez-vous faire ?");
								sousSousMenu = sc.nextInt();
								
								if (sousSousMenu == 4) 
								{
									menu = 1;
								}
								else if (sousSousMenu == 5)
								{
									menu = 0;
								}
								else if (sousSousMenu == -1)
								{
									menu = -1;
								}
								else if (sousSousMenu == 6)
								{
									menu = 4;
								}
								else 
								{
									switch (sousSousMenu) 
									{
										case 1:
											System.out.println("Coucou sous menu 1");
											menu = 0;
											break;
				
										case 2:
											System.out.println("Coucou sous menu 2");
											menu = 0;
											break;
										case 3:
											System.out.println("Coucou sous menu 3");
											menu = 0;
											break;
										default:
											System.out.println("Merci de rentrer une valeur du Menu\n");
											System.out.println("╔════════════════ Menu ajout Accessoire ════════════════╗");
											System.out.println("║1) Ajouter un Cordon                                   ║");
											System.out.println("║2) Ajouter un Chargeur                                 ║");
											System.out.println("║3) Ajouter une Coque                                   ║");
											System.out.println("║4) Revenir au menu précédent                           ║");
											System.out.println("║5) Revenir au menu principal                           ║");
											System.out.println("║6) Sauvegarder la liste d'article                      ║");
											System.out.println("║-1) Quitter l'application                              ║");
											System.out.println("╚═══════════════════════════════════════════════════════╝");
											System.out.println("Que souhaitez-vous faire ?");
											menu = sc.nextInt();
											break;
									}
								}
								break;
							default:
								System.out.println("Merci de rentrer une valeur du Menu\n");
								System.out.println("╔═══════════════════════ Menu Ajout ═══════════════════════╗");
								System.out.println("║1) Ajouter un Téléphone                                   ║");
								System.out.println("║2) Ajouter un Accessoire                                  ║");
								System.out.println("║3) Revenir au menu principal                              ║");
								System.out.println("║4) Sauvegarder la liste d'article                         ║");
								System.out.println("║-1) Quitter l'application                                 ║");
								System.out.println("╚══════════════════════════════════════════════════════════╝");
								System.out.println("Que souhaitez-vous faire ?");
								menu = sc.nextInt();
								break;
						}
					}
					break;
				case 2:
					System.out.println("coucou2");
					break;
				case 3:
					System.out.println("coucou3");
					break;
				case 4:
					System.out.println("coucou4");
					break;
				case 5:
					System.out.println("coucou5");
					break;
				case 6:
					System.out.println("coucou6");
					break;
				case 7:
					System.out.println("coucou7");
					break;
				case 8:
					System.out.println("coucou8");
					break;
				case 9:
					System.out.println("coucou9");
					
					break;
				case -1:
					System.out.println("coucou-1");
					break;
		
				default:
					System.out.println("Merci de rentrer une valeur du Menu\n");
					System.out.println("╔═══════════════════════════ Menu ══════════════════════════════╗");
					System.out.println("║1) Ajouter un article à la liste d'article                     ║");
					System.out.println("║2) Supprimer un article de la liste d'article                  ║");
					System.out.println("║3) Trier les articles de la liste d'article par référence      ║");
					System.out.println("║4) Trier les articles de la liste d'article par intitulé       ║");
					System.out.println("║5) Trier les articles de la liste d'article par prix           ║");
					System.out.println("║6) Rechercher un article à la liste d'article par sa référence ║");
					System.out.println("║7) Rechercher un article à la liste d'article par son intitulé ║");
					System.out.println("║8) Rechercher un article à la liste d'article par son prix     ║");
					System.out.println("║9) Sauvegarder la liste d'article                              ║");
					System.out.println("║-1) Quitter l'application                                      ║");
					System.out.println("╚═══════════════════════════════════════════════════════════════╝");
					
					System.out.println("Que souhaitez-vous faire ?");
					menu = sc.nextInt();
					break;
			}
			
		}
		
		
		
	}

}