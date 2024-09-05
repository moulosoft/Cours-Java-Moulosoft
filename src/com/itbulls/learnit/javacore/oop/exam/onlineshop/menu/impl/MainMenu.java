package com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl;

import java.util.Scanner;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.Main;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;

/**
 * Cette classe implémente l'interface Menu et représente le menu principal de l'application.
 */
public class MainMenu implements Menu {

    // Constante pour la commande de sortie de l'application
    public static final String MENU_COMMAND = "menu";

    // Texte du menu principal pour un utilisateur non connecté
    private static final String MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER = "Veuillez saisir un numéro pour continuer." + System.lineSeparator()
            + "1. Inscription" + System.lineSeparator() + "2. Connexion"
            + System.lineSeparator() + "3. Catalogue produits" + System.lineSeparator()
            + "4. Mes commandes" + System.lineSeparator() + "5. Paramètres" + System.lineSeparator() +
            "6. Liste des clients";

    // Texte du menu principal pour un utilisateur connecté
    private static final String MAIN_MENU_TEXT_FOR_LOGGED_IN_USER = "Veuillez saisir un numéro pour continuer." + System.lineSeparator()
            + "1. Inscription" + System.lineSeparator() + "2. Déconnexion"
            + System.lineSeparator() + "3. Catalogue produits" + System.lineSeparator()
            + "4. Mes commandes" + System.lineSeparator() + "5. Paramètres" + System.lineSeparator() +
            "6. Liste des clients";

    // Contexte de l'application injecté
    private ApplicationContext context;

    // Bloc d'initialisation pour récupérer le contexte de l'application
    {
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        // Boucle infinie pour maintenir l'application ouverte
        while (true) {
            // Vérifie si le menu principal a déjà été créé et l'enregistre dans le contexte si nécessaire
            if (context.getMainMenu() == null) {
                context.setMainMenu(this);
            }

            // Variable pour stocker le menu à lancer
            Menu menuToNavigate = null;

            // Boucle interne pour la navigation dans le menu
            mainLoop:
            while (true) {
                printMenuHeader();

                Scanner sc = new Scanner(System.in);

                System.out.print("Saisie utilisateur: ");
                String userInput = sc.next();

                // Gère la commande de sortie de l'application
                if (userInput.equalsIgnoreCase(Main.EXIT_COMMAND)) {
                    System.exit(0);
                } else {
                    // Convertit la saisie en entier
                    int commandNumber = Integer.parseInt(userInput);

                    // Switch pour gérer les différentes options du menu
                    switch (commandNumber) {
                        case 1:
                            menuToNavigate = new SignUpMenu();
                            break mainLoop; // Sort de la boucle interne pour lancer le menu d'inscription
                        case 2:
                            // Affiche le menu de connexion ou de déconnexion selon l'état de connexion
                            if (context.getLoggedInUser() == null) {
                                menuToNavigate = new SignInMenu();
                            } else {
                                menuToNavigate = new SignOutMenu();
                            }
                            break mainLoop;
                        case 3:
                            menuToNavigate = new ProductCatalogMenu();
                            break mainLoop;
                        case 4:
                            menuToNavigate = new MyOrdersMenu();
                            break mainLoop;
                        case 5:
                            menuToNavigate = new SettingsMenu();
                            break mainLoop;
                        case 6:
                            menuToNavigate = new CustomerListMenu();
                            break mainLoop;
                        default:
                            // Message d'erreur pour une saisie invalide
                            System.out.println("Seulement 1, 2, 3, 4, 5 sont autorisés. Veuillez réessayer");
                            continue; // Continue la boucle interne
                    }
                }
            }

            // Lance le menu sélectionné
            menuToNavigate.start();
        }
    }

    @Override
    public void printMenu
