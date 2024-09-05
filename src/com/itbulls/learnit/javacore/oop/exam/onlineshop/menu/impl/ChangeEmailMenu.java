package com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl;

import java.util.Scanner;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;

/**
 * Cette classe implémente l'interface Menu et représente le menu de changement d'email.
 */
public class ChangeEmailMenu implements Menu {

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

        // Lit l'entrée de l'utilisateur pour le nouvel email
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

        // Modifie l'email de l'utilisateur connecté via le contexte de l'application
        context.getLoggedInUser().setEmail(userInput);

        // Affiche un message de confirmation
        System.out.println("Votre email a été modifié avec succès");
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** CHANGER L'EMAIL *****");
        System.out.print("Entrez votre nouvel email: ");
    }
}
