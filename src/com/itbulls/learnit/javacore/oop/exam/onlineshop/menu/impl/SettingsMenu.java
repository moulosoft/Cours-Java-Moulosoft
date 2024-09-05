package com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl;

import java.util.Scanner;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;

/**
 * Cette classe implémente l'interface Menu et représente le menu des paramètres de l'utilisateur.
 */
public class SettingsMenu implements Menu {

    // Constante contenant les options du menu des paramètres
    private static final String SETTINGS = "1. Modifier le mot de passe" + System.lineSeparator()
            + "2. Modifier l'adresse e-mail";

    // Contexte de l'application injecté
    private ApplicationContext context;

    // Bloc d'initialisation pour récupérer le contexte de l'application
    {
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        // Variable pour stocker le menu à lancer
        Menu menuToNavigate = null;

        // Boucle infinie pour la navigation dans le menu
        mainLoop:
        while (true) {
            // Affiche l'en-tête du menu
            printMenuHeader();

            // Vérifie si l'utilisateur est connecté
            if (context.getLoggedInUser() == null) {
                System.out.println(
                        "Veuillez vous connecter ou créer un nouveau compte pour modifier vos paramètres");
                new MainMenu().start();
                return;
            } else {
                // Affiche les options du menu des paramètres
                System.out.println(SETTINGS);

                Scanner sc = new Scanner(System.in);

                System.out.print(
                        "Veuillez saisir une option ou taper 'menu' pour revenir au menu principal: ");
                String userInput = sc.next();

                // Gère la navigation vers le menu principal
                if (userInput.equalsIgnoreCase(MainMenu.MENU_COMMAND)) {
                    menuToNavigate = new MainMenu();
                    break mainLoop;
                }

                // Convertit la saisie en entier
                int userOption = Integer.parseInt(userInput);

                // Gère les différentes options du menu
                switch (userOption) {
                    case 1:
                        menuToNavigate = new ChangePasswordMenu();
                        break mainLoop; // Sort de la boucle pour lancer le menu de modification du mot de passe
                    case 2:
                        menuToNavigate = new ChangeEmailMenu();
                        break mainLoop; // Sort de la boucle pour lancer le menu de modification de l'adresse e-mail
                    default:
                        System.out.println("Seulement 1 et 2 sont autorisés. Veuillez réessayer");
                        continue; // Continue la boucle pour une nouvelle saisie
                }
            }
        }

        // Lance le menu sélectionné
        menuToNavigate.start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** PARAMETRES *****");
    }
}
