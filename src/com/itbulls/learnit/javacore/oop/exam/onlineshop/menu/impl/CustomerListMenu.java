package com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.User;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.UserManagementService;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.impl.DefaultUserManagementService;

/**
 * Cette classe implémente l'interface Menu et représente le menu de liste des clients.
 */
public class CustomerListMenu implements Menu {

    // Service de gestion des utilisateurs injecté
    private UserManagementService userManagementService;

    // Contexte de l'application injecté
    private ApplicationContext context;

    // Bloc d'initialisation pour récupérer le service de gestion des utilisateurs et le contexte de l'application
    {
        userManagementService = DefaultUserManagementService.getInstance();
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        // Affiche l'en-tête du menu
        printMenuHeader();

        // Récupère la liste des utilisateurs via le service de gestion des utilisateurs
        User[] users = userManagementService.getUsers();

        // Vérifie si la liste est vide
        if (users.length == 0) {
            System.out.println("Aucun client n'est enregistré pour le moment.");
        } else {
            // Parcourt la liste des utilisateurs et affiche chacun d'eux
            for (User user : users) {
                System.out.println(user); // On suppose que la classe User possède une implémentation toString() pour afficher les informations de l'utilisateur.
            }
        }
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** CLIENTS *****");
    }
}
