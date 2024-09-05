package com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl;

import java.util.Scanner;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.User;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.impl.DefaultUser;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.UserManagementService;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.impl.DefaultUserManagementService;

/**
 * Cette classe implémente l'interface Menu et représente le menu d'inscription.
 */
public class SignUpMenu implements Menu {

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

        Scanner sc = new Scanner(System.in);

        // Demande le prénom à l'utilisateur
        System.out.print("Veuillez saisir votre prénom: ");
        String firstName = sc.next();

        // Demande le nom de famille à l'utilisateur
        System.out.print("Veuillez saisir votre nom de famille: ");
        String lastName = sc.next();

        // Demande le mot de passe à l'utilisateur
        System.out.print("Veuillez saisir votre mot de passe: ");
        String password = sc.next();

        // Demande l'adresse e-mail à l'utilisateur (on utilise nextLine pour récupérer la ligne entière 
        // car l'adresse e-mail peut contenir des espaces)
        System.out.print("Veuillez saisir votre adresse e-mail: ");
        String email = sc.nextLine();

        // Crée un nouvel utilisateur avec les informations saisies
        User user = new DefaultUser(firstName, lastName, password, email);

        // Tente d'enregistrer l'utilisateur auprès du service de gestion des utilisateurs
        String errorMessage = userManagementService.registerUser(user);

        // Vérifie si l'enregistrement a réussi
        if (errorMessage == null || errorMessage.isEmpty()) {
            context.setLoggedInUser(user); // Enregistre l'utilisateur connecté dans le contexte de l'application
            System.out.println("Nouvel utilisateur créé");
        } else {
            System.out.println(errorMessage); // Affiche un message d'erreur si l'enregistrement a échoué
        }
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** INSCRIPTION *****");
    }
}
