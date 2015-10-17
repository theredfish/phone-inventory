/*
 * Auteurs : Marina Blin - Julian Didier
 * 
 * Description de la classe : Magasin
 * 	Classe d'application
 */

package Application;

import java.util.Scanner;
import java.util.TreeSet;

import inventaire.*;

public class Magasin {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		ListeArticles listeArticles = new ListeArticles();
		
		int menu = 0;
		int sousMenu = 0;
		int sousSousMenu = 0;
		int sousSousSousMenu = 0;
		
		String nomM = "Sans marque";
		String nomO = "Sans opérateur";
		String intitule = "Sans intitulé";
		double prix = 0.0;
		Marque marque;
		Operateur operateur;
		int longueur = 0;
		TreeSet<Marque> marquesCompatibles;
		String saisie = "";
		String couleurS;
		Couleur couleur = Couleur.Noir;
		
		String reference = "";
		
		while (menu != -1) 
		{
			switch (menu) 
			{
				case 0:
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
					menu = sc.nextInt();
					break;
			
				case 1:
					System.out.println("╔══ Menu Ajout ══════════════════════════════════════════════════╗");
					System.out.println("║1) Ajouter un Téléphone                                         ║");
					System.out.println("║2) Ajouter un Accessoire                                        ║");
					System.out.println("║3) Revenir au menu principal                                    ║");
					System.out.println("║4) Sauvegarder la liste d'articles                              ║");
					System.out.println("║-1) Quitter l'application                                       ║");
					System.out.println("╚════════════════════════════════════════════════════════════════╝");
					
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
								System.out.println("Quelle est la marque du téléphone ?");
								nomM = sc.next();
								System.out.println("Quel est l'opérateur du téléphone ?");
								nomO = sc.next();
								System.out.println("Quel est l'intitulé du téléphone ?");
								intitule = sc.next();
								System.out.println("Quel est le prix du téléphone ?");
								prix = sc.nextDouble();
								
								marque = new Marque(nomM);
								operateur = new Operateur(nomO);
								
								Article telephone = new Telephone(intitule, prix, marque, operateur);
								
								listeArticles.ajouter(telephone);
								
								System.out.println(telephone.toString());
								System.out.println("L'article téléphone a bien été ajouté");
								
								menu = 0;
								break;
	
							case 2:
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
											System.out.println("Quel est l'intitulé du cordon ?");
											intitule = sc.next();
											System.out.println("Quel est le prix du cordon ?");
											prix = sc.nextDouble();
											System.out.println("Quelle est la longueur du cordon ?");
											longueur = sc.nextInt();
											System.out.println("Quelles sont les marques compatibles du cordon ? (Rentrer une marque. Appuyer sur entrée. Faire -1 pour terminer la saisie");
											marquesCompatibles = new TreeSet<>();
											
											saisie = "";
											while (!saisie.equals("-1")) 
											{
												saisie = sc.next();
												marque = new Marque(saisie);
												if (!saisie.equals("-1")) 
												{
													marquesCompatibles.add(marque);
													marque.toString();
												}
											}
											
											Accessoire cordon = new Cordon(intitule, prix, longueur, marquesCompatibles);
											
											listeArticles.ajouter(cordon);
											
											menu = 0;
											break;				
										case 2:
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
											sousSousSousMenu = sc.nextInt();
											
											if (sousSousSousMenu == 4) 
											{
												// to do
											}
											else if (sousSousSousMenu == 5)
											{
												menu = 0;
											}
											else if (sousSousSousMenu == 6)
											{
												menu = 4;
											}
											else if (sousSousSousMenu == -1)
											{
												menu = -1;
											}
											else 
											{
												switch (sousSousMenu) 
												{
													case 1:
														System.out.println("Quel est l'intitulé du chargeur USB ?");
														intitule = sc.next();
														System.out.println("Quel est le prix du chargeur USB ?");
														prix = sc.nextDouble();
														System.out.println("Quelles sont les marques compatibles du chargeur USB ? (Rentrer une marque. Appuyer sur entrée. Faire -1 pour terminer la saisie");
														marquesCompatibles = new TreeSet<>();
														
														saisie = "";
														while (!saisie.equals("-1")) 
														{
															saisie = sc.next();
															marque = new Marque(saisie);
															if (!saisie.equals("-1")) 
															{
																marquesCompatibles.add(marque);
																marque.toString();
															}
														}
														
														Accessoire chargeurUSB = new Usb(intitule, prix, marquesCompatibles);
														
														listeArticles.ajouter(chargeurUSB);
														
														menu = 0;
														break;
													case 2:
														System.out.println("Quel est l'intitulé du chargeur allume cigare ?");
														intitule = sc.next();
														System.out.println("Quel est le prix du chargeur allume cigare ?");
														prix = sc.nextDouble();
														System.out.println("Quelles sont les marques compatibles du chargeur allume cigare ? (Rentrer une marque. Appuyer sur entrée. Faire -1 pour terminer la saisie");
														marquesCompatibles = new TreeSet<>();
														
														saisie = "";
														while (!saisie.equals("-1")) 
														{
															saisie = sc.next();
															marque = new Marque(saisie);
															if (!saisie.equals("-1")) 
															{
																marquesCompatibles.add(marque);
																marque.toString();
															}
														}
														
														Accessoire chargeurAllumeCigare = new AllumeCigare(intitule, prix, marquesCompatibles);
														
														listeArticles.ajouter(chargeurAllumeCigare);
														
														menu = 0;
														break;
													case 3:
														System.out.println("Quel est l'intitulé du chargeur secteur ?");
														intitule = sc.next();
														System.out.println("Quel est le prix du chargeur secteur ?");
														prix = sc.nextDouble();
														System.out.println("Quelles sont les marques compatibles du chargeur secteur ? (Rentrer une marque. Appuyer sur entrée. Faire -1 pour terminer la saisie");
														marquesCompatibles = new TreeSet<>();
														
														saisie = "";
														while (!saisie.equals("-1")) 
														{
															saisie = sc.next();
															marque = new Marque(saisie);
															if (!saisie.equals("-1")) 
															{
																marquesCompatibles.add(marque);
																marque.toString();
															}
														}
														
														Accessoire secteur = new Secteur(intitule, prix, marquesCompatibles);
														
														listeArticles.ajouter(secteur);
														
														menu = 0;
														break;
													default:
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
														sousSousSousMenu = sc.nextInt();
														break;
												}
											}
											break;
										case 3:
											System.out.println("Quel est l'intitulé de la coque ?");
											intitule = sc.next();
											System.out.println("Quel est le prix de la coque ?");
											prix = sc.nextDouble();
											System.out.println("Quelle est la couleur de la coque ? Bleu, Noir (par défaut), Blanc, Rouge, Vert, Rose, Jaune, Orange, BleuTurquoise, Beige ou Marron");
											couleurS = sc.next();
											
											while (!(couleurS.equalsIgnoreCase("bleu") || couleurS.equalsIgnoreCase("noir") || couleurS.equalsIgnoreCase("blanc")
													|| couleurS.equalsIgnoreCase("rouge") || couleurS.equalsIgnoreCase("vert") || couleurS.equalsIgnoreCase("rose") 
													|| couleurS.equalsIgnoreCase("jaune") || couleurS.equalsIgnoreCase("orange") || couleurS.equalsIgnoreCase("bleu turquoise") 
													|| couleurS.equalsIgnoreCase("beige") || couleurS.equalsIgnoreCase("marron") || couleurS.equalsIgnoreCase(""))) 
											{
												System.out.println("Merci de saisir une couleur existante : Bleu, Noir, Blanc, Rouge, Vert, Rose, Jaune, Orange, BleuTurquoise, Beige ou Marron");
												couleurS = sc.next();
											}
											
											if (couleurS.equalsIgnoreCase("bleu")) 
											{
												couleur = Couleur.Bleu;
											}
											else if (couleurS.equalsIgnoreCase("noir")) 
											{
												couleur = Couleur.Noir;
											}
											else if (couleurS.equalsIgnoreCase("blanc")) 
											{
												couleur = Couleur.Blanc;
											}
											else if (couleurS.equalsIgnoreCase("rouge")) 
											{
												couleur = Couleur.Rouge;
											}
											else if (couleurS.equalsIgnoreCase("vert")) 
											{
												couleur = Couleur.Vert;
											}
											else if (couleurS.equalsIgnoreCase("rose")) 
											{
												couleur = Couleur.Rose;
											}
											else if (couleurS.equalsIgnoreCase("jaune")) 
											{
												couleur = Couleur.Jaune;
											}
											else if (couleurS.equalsIgnoreCase("orange")) 
											{
												couleur = Couleur.Orange;
											}
											else if (couleurS.equalsIgnoreCase("bleu turquoise")) 
											{
												couleur = Couleur.BleuTurquoise;
											}
											else if (couleurS.equalsIgnoreCase("beige")) 
											{
												couleur = Couleur.Beige;
											}
											else if (couleurS.equalsIgnoreCase("marron")) 
											{
												couleur = Couleur.Marron;
											}
											
											System.out.println("Quelles sont les marques compatibles de la coque ? (Rentrer une marque. Appuyer sur entrée. Faire -1 pour terminer la saisie");
											marquesCompatibles = new TreeSet<>();
											
											saisie = "";
											while (!saisie.equals("-1")) 
											{
												saisie = sc.next();
												marque = new Marque(saisie);
												if (!saisie.equals("-1")) 
												{
													marquesCompatibles.add(marque);
													marque.toString();
												}
											}
											
											
											Accessoire coque = new Coque(intitule, prix, marquesCompatibles, couleur);
											
											System.out.println(coque.toString());
											listeArticles.ajouter(coque);
											menu = 0;
											break;
										default:
											System.out.println("Merci de rentrer une valeur du Menu\n");
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
											menu = sc.nextInt();
											break;
									}
								}
								break;
							default:
								System.out.println("Merci de rentrer une valeur du Menu\n");
								System.out.println("╔══ Menu Ajout ══════════════════════════════════════════════════╗");
								System.out.println("║1) Ajouter un Téléphone                                         ║");
								System.out.println("║2) Ajouter un Accessoire                                        ║");
								System.out.println("║3) Revenir au menu principal                                    ║");
								System.out.println("║4) Sauvegarder la liste d'articles                              ║");
								System.out.println("║-1) Quitter l'application                                       ║");
								System.out.println("╚════════════════════════════════════════════════════════════════╝");
								System.out.println("Que souhaitez-vous faire ?");
								menu = sc.nextInt();
								break;
						}
					}
					break;
				case 2:
					System.out.println("Quelle est la référence de l'article à supprimer ?");
					reference = sc.next();
					System.out.println("Quel est l'intitulé de l'article à supprimer ?");
					intitule = sc.next();
					System.out.println("Quel est le prix de l'article à supprimer ?");
					prix = sc.nextInt();

					Article aSupprimer;
					
					if (reference.startsWith("T")) 
					{
						System.out.println("Quel est le nom de la marque du téléphone à supprimer ?");
						nomM = sc.next();
						marque = new Marque(nomM);
						System.out.println("Quel est le nom de l'opérateur du téléphone à supprimer ?");
						nomO = sc.next();
						operateur = new Operateur(nomO);
						aSupprimer = new Telephone(intitule, prix, marque, operateur);
						listeArticles.supprimer(aSupprimer);
					}
					else if (reference.startsWith("A")) 
					{
						aSupprimer = new AllumeCigare(intitule, prix);
						listeArticles.supprimer(aSupprimer);
					}
					else if (reference.startsWith("Q")) 
					{
						aSupprimer = new Coque(intitule, prix, couleur);
						listeArticles.supprimer(aSupprimer);
					}
					else if (reference.startsWith("R")) 
					{
						System.out.println("Quelle est la longeur du cordon à supprimer ?");
						nomM = sc.next();
						aSupprimer = new Cordon(intitule, prix, longueur);
						listeArticles.supprimer(aSupprimer);
					}
					else if (reference.startsWith("S")) 
					{
						aSupprimer = new Secteur(intitule, prix);
						listeArticles.supprimer(aSupprimer);
					}
					else if (reference.startsWith("U")) 
					{
						aSupprimer = new Usb(intitule, prix);
						listeArticles.supprimer(aSupprimer);
					}
			
					break;
				case 3:
					listeArticles.tousLesArticles_ParRef();
					break;
				case 4:
					listeArticles.tousLesArticles_ParIntitule();
					break;
				case 5:
					listeArticles.tousLesArticles_ParPrix();
					break;
				case 6:
					System.out.println("Quelle référence recherchez-vous ?");
					reference = sc.next();
					listeArticles.chercherArticlesReference(reference);
					break;
				case 7:
					System.out.println("Quel intitulé recherchez-vous ?");
					reference = sc.next();
					listeArticles.chercherArticlesIntitule(intitule);
					break;
				case 8:
					System.out.println("Quel prix recherchez-vous ?");
					reference = sc.next();
					listeArticles.chercherArticlesPrix(prix);
					break;
				case 9:
					listeArticles.sauvegarde();
					System.out.println("La sauvegarde a bien été effectué");
					
					break;
		
				default:
					System.out.println("Merci de rentrer une valeur du Menu\n");
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
					menu = sc.nextInt();
					break;
			}
			
		}
		sc.close();
	}
}