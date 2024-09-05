package com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl;

import java.util.Scanner;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;

/**
 * Cette classe implémente l'interface Menu et représente le menu de changement de mot de passe.
 */
public class ChangePasswordMenu implements Menu {

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

        // Lit l'entrée de l'utilisateur pour le nouveau mot de passe
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

        // Modifie le mot de passe de l'utilisateur connecté via le contexte de l'application
        context.getLoggedInUser().setPassword(userInput);

        // Affiche un message de confirmation
        System.out.println("Votre mot de passe a été modifié avec succès");
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** CHANGER LE MOT DE PASSE *****");
        System.out.print("Entrez votre nouveau mot de passe: ");
    }
}
