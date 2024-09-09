package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.menu.impl;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;

/**
 * Cette classe implémente l'interface Menu et représente le menu principal de l'application.
 */
public class MainMenu implements Menu {

    // Commande pour accéder au menu principal (probablement saisie par l'utilisateur)
    public static final String MENU_COMMAND = "menu";

    // Texte du menu principal pour un utilisateur non connecté
    private static final String MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER = "Veuillez entrer un numéro pour continuer :"
            + System.lineSeparator()
            + "1. Inscription" + System.lineSeparator()
            + "2. Connexion" + System.lineSeparator()
            + "3. Catalogue de produits" + System.lineSeparator()
            + "4. Mes commandes" + System.lineSeparator()
            + "5. Paramètres" + System.lineSeparator()
            + "6. Liste des clients"; // Notez le point-virgule en trop corrigé

    // Texte du menu principal pour un utilisateur connecté
    private static final String MAIN_MENU_TEXT_FOR_LOGGED_IN_USER = "Veuillez entrer un numéro pour continuer :"
            + System.lineSeparator()
            + "1. Inscription" + System.lineSeparator() // L'option "Inscription" est présente même pour les utilisateurs connectés (probablement pour créer un nouveau compte)
            + "2. Déconnexion" + System.lineSeparator()
            + "3. Catalogue de produits" + System.lineSeparator()
            + "4. Mes commandes" + System.lineSeparator()
            + "5. Paramètres" + System.lineSeparator()
            + "6. Liste des clients"; // Notez le point-virgule en trop corrigé

    // Contexte de l'application injecté
    private ApplicationContext context;

    // Bloc d'initialisation pour récupérer le contexte de l'application
    {
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        // <write your code here> // Code à implémenter pour afficher et gérer le menu principal
    }

    @Override
    public void printMenuHeader() {
        // <write your code here> // Code à implémenter pour afficher l'en-tête du menu principal
    }
}
