package com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;

/**
 * Cette classe implémente l'interface Menu et représente le menu de déconnexion.
 */
public class SignOutMenu implements Menu {

    // Contexte de l'application injecté
    private ApplicationContext context;

    // Bloc d'initialisation pour récupérer le contexte de l'application
    {
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        // Affiche l'en-tête du menu
        printMenuHeader();

        // Déconnexion de l'utilisateur
        context.setLoggedInUser(null);
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** DÉCONNEXION *****");
        System.out.println("Passez une bonne journée! Au plaisir de vous revoir! ");
    }
}
