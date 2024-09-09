package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.menu.impl;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;

/**
 * Cette classe implémente l'interface Menu et représente le menu des paramètres.
 */
public class SettingsMenu implements Menu {

    // Texte affiché pour les options du menu des paramètres
    private static final String SETTINGS = "1. Modifier le mot de passe" + System.lineSeparator()
            + "2. Modifier l'e-mail";

    // Contexte de l'application injecté
    private ApplicationContext context;

    // Bloc d'initialisation pour récupérer le contexte de l'application
    {
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        // <write your code here> // Code à implémenter pour afficher et gérer les paramètres
    }

    @Override
    public void printMenuHeader() {
        // <write your code here> // Code à implémenter pour afficher l'en-tête du menu
    }
}
