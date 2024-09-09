package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.menu.impl;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.UserManagementService;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.impl.DefaultUserManagementService;

/**
 * Cette classe implémente l'interface Menu et représente le menu de liste des clients.
 * On peut supposer que ce menu est accessible uniquement aux administrateurs.
 */
public class CustomerListMenu implements Menu {

    // Contexte de l'application injecté
    private ApplicationContext context;

    // Service de gestion des utilisateurs
    private UserManagementService userManagementService;

    // Bloc d'initialisation pour récupérer le service de gestion des utilisateurs et le contexte de l'application
    {
        userManagementService = DefaultUserManagementService.getInstance();
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        // <write your code here> // Code à implémenter pour afficher la liste des clients
    }

    @Override
    public void printMenuHeader() {
        // <write your code here> // Code à implémenter pour afficher l'en-tête du menu
    }
}
