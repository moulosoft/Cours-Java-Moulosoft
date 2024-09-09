package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.menu.impl;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;

/**
 * Cette classe implémente l'interface Menu et représente le menu de changement d'adresse e-mail.
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
        // <write your code here> // Code à implémenter pour lancer le menu de changement d'e-mail
    }

    @Override
    public void printMenuHeader() {
        // <write your code here> // Code à implémenter pour afficher l'en-tête du menu
    }
}
