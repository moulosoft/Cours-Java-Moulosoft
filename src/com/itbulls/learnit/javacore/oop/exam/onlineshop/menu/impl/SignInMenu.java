package com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl;

import java.util.Scanner;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.User;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.UserManagementService;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.impl.DefaultUserManagementService;

/**
 * Cette classe implémente l'interface Menu et représente le menu de connexion.
 */
public class SignInMenu implements Menu {

    // Contexte de l'application injecté
    private ApplicationContext context;

    // Service de gestion des utilisateurs injecté
    private UserManagementService userManagementService;

    // Bloc d'initialisation pour récupérer le contexte de l'application et le service de gestion des utilisateurs
    {
        context = ApplicationContext.getInstance();
        userManagementService = DefaultUserManagementService.getInstance();
    }

    @Override
    public void start() {
        // Affiche l'en-tête du menu
        printMenuHeader();

        Scanner sc = new Scanner(System.in);

        // Demande l'adresse e-mail à l'utilisateur
        System.out.print("Veuillez saisir votre adresse e-mail: ");
        String userEmail = sc.next();

        // Demande le mot de passe à l'utilisateur
        System.out.print("Veuillez saisir votre mot de passe: ");
        String userPassword = sc.next();

        // Recherche l'utilisateur par son adresse e-mail
        User user = userManagementService.getUserByEmail(userEmail);

        // Vérifie si l'utilisateur existe et si le mot de passe correspond
        if (user != null && user.getPassword().equals(userPassword)) {
            System.out.printf("Ravi de vous revoir %s %s%n", user.getFirstName(),
                    user.getLastName());
            context.setLoggedInUser(user); // Enregistre l'utilisateur connecté dans le contexte de l'application
        } else {
            System.out.println("Identifiant et mot de passe incorrects");
        }
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** CONNEXION *****");
    }
}
