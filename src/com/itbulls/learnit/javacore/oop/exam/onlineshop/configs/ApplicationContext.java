// Package de configuration de l'application
package com.itbulls.learnit.javacore.oop.exam.onlineshop.configs;

// Imports des classes nécessaires
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Cart;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.User;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.impl.DefaultCart;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;

// Classe ApplicationContext (Singleton) gérant le contexte de l'application
public class ApplicationContext {

  // Instance unique du contexte de l'application (Singleton)
  private static ApplicationContext instance;

  // Utilisateur actuellement connecté
  private User loggedInUser;

  // Menu principal de l'application
  private Menu mainMenu;

  // Panier d'achats de la session courante
  private Cart sessionCart;

  // Constructeur privé pour empêcher l'instanciation directe (Singleton)
  private ApplicationContext() {
  }

  // Méthode pour définir l'utilisateur connecté
  public void setLoggedInUser(User user) {
    // Vider le panier de la session courante lors de la connexion d'un nouvel utilisateur
    if (this.sessionCart != null) {
      this.sessionCart.clear();
    }
    this.loggedInUser = user;
  }

  // Méthode pour récupérer l'utilisateur connecté
  public User getLoggedInUser() {
    return this.loggedInUser;
  }

  // Méthode pour définir le menu principal
  public void setMainMenu(Menu menu) {
    this.mainMenu = menu;
  }

  // Méthode pour récupérer le menu principal
  public Menu getMainMenu() {
    return this.mainMenu;
  }

  // Méthode statique pour obtenir l'instance unique du contexte de l'application (Singleton)
  public static ApplicationContext getInstance() {
    if (instance == null) {
      instance = new ApplicationContext();
    }
    return instance;
  }

  // Méthode pour récupérer le panier de la session courante
  // Crée un nouveau panier par défaut si aucun n'existe
  public Cart getSessionCart() {
    if (this.sessionCart == null) {
      this.sessionCart = new DefaultCart();
    }
    return this.sessionCart;
  }
}
