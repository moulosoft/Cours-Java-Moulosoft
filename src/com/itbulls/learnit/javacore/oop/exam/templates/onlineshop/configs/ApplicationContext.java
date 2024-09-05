package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.configs;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Cart;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.User;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.impl.DefaultCart;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;

/**
 * Cette classe représente le contexte de l'application.
 * Elle permet d'accéder à des informations et objets partagés 
 * à travers toute l'application.
 */
public class ApplicationContext {

    // Instance unique du contexte de l'application (Singleton)
    private static ApplicationContext instance;

    // Utilisateur connecté actuellement
    private User loggedInUser;

    // Menu principal de l'application
    private Menu mainMenu;

    // Panier de l'utilisateur en cours de session
    private Cart sessionCart;

    // Constructeur privé pour empêcher l'instanciation directe (Singleton)
    private ApplicationContext() {
    }

    // Définit l'utilisateur connecté
    public void setLoggedInUser(User user) {
        // Vide le panier de la session s'il existe lors de la connexion d'un nouvel utilisateur
        if (this.sessionCart != null) {
            this.sessionCart.clear();
        }
        this.loggedInUser = user;
    }

    // Récupère l'utilisateur connecté
    public User getLoggedInUser() {
        return this.loggedInUser;
    }

    // Définit le menu principal
    public void setMainMenu(Menu menu) {
        this.mainMenu = menu;
    }

    // Récupère le menu principal
    public Menu getMainMenu() {
        return this.mainMenu;
    }

    // Récupère l'instance unique du contexte de l'application (Singleton)
    public static ApplicationContext getInstance() {
        if (instance == null) {
            instance = new ApplicationContext();
        }
        return instance;
    }

    // Récupère le panier de la session. Crée un nouveau panier si inexistant.
    public Cart getSessionCart() {
        if (this.sessionCart == null) {
            this.sessionCart = new DefaultCart();
        }
        return this.sessionCart;
    }
}
