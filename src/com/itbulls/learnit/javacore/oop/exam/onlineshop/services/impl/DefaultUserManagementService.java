// Package de l'implémentation de l'interface UserManagementService
package com.itbulls.learnit.javacore.oop.exam.onlineshop.services.impl;

// Imports de classes utilitaires
import java.util.Arrays;
import java.util.Objects;

// Imports des classes de l'application
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Order;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.User;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.UserManagementService;

// Classe implémentant l'interface UserManagementService (Singleton)
public class DefaultUserManagementService implements UserManagementService {

  // Constantes d'erreur pour l'enregistrement
  private static final String NOT_UNIQUE_EMAIL_ERROR_MESSAGE = "Cette adresse email est déjà utilisée par un autre utilisateur. Veuillez choisir une autre adresse email.";
  private static final String EMPTY_EMAIL_ERROR_MESSAGE = "Vous devez saisir une adresse email pour vous enregistrer. Veuillez réessayer.";
  private static final String NO_ERROR_MESSAGE = ""; // Message vide pour indiquer l'absence d'erreur

  // Capacité initiale du tableau d'utilisateurs
  private static final int DEFAULT_USERS_CAPACITY = 10;

  // Instance unique du service (Singleton)
  private static DefaultUserManagementService instance;

  // Tableau d'utilisateurs
  private User[] users;
  private int lastUserIndex; // Indice du dernier utilisateur ajouté

  // Bloc d'initialisation pour initialiser le tableau d'utilisateurs
  {
    users = new User[DEFAULT_USERS_CAPACITY];
  }

  // Constructeur privé pour empêcher l'instanciation directe (Singleton)
  private DefaultUserManagementService() {
  }

  // Implémentation de la méthode registerUser de l'interface
  @Override
  public String registerUser(User user) {
    // Pas d'action si l'utilisateur est null
    if (user == null) {
      return NO_ERROR_MESSAGE;
    }

    // Vérifier l'unicité de l'adresse email
    String errorMessage = checkUniqueEmail(user.getEmail());
    if (errorMessage != null && !errorMessage.isEmpty()) {
      return errorMessage;
    }

    // Augmenter la taille du tableau si nécessaire
    if (users.length <= lastUserIndex) {
      users = Arrays.copyOf(users, users.length << 1);
    }

    // Ajouter l'utilisateur au tableau
    users[lastUserIndex++] = user;

    // Pas d'erreur rencontrée
    return NO_ERROR_MESSAGE;
  }

  // Méthode privée pour vérifier l'unicité de l'adresse email
  private String checkUniqueEmail(String email) {
    // Vérifier si l'email est vide
    if (email == null || email.isEmpty()) {
      return EMPTY_EMAIL_ERROR_MESSAGE;
    }

    // Parcourir le tableau d'utilisateurs pour trouver un email similaire (ignorant la casse)
    for (User user : users) {
      if (user != null && 
          user.getEmail() != null && 
          user.getEmail().equalsIgnoreCase(email)) {
        return NOT_UNIQUE_EMAIL_ERROR_MESSAGE;
      }
    }

    // Pas d'erreur, l'adresse email est unique
    return NO_ERROR_MESSAGE;
  }

  // Méthode statique pour obtenir l'instance unique du service (Singleton)
  public static UserManagementService getInstance() {
    if (instance == null) {
      instance = new DefaultUserManagementService();
    }
    return instance;
  }

  // Implémentation de la méthode getUsers de l'interface
  @Override
  public User[] getUsers() {
    // Compter le nombre d'utilisateurs non nulls
    int nonNullUsersAmount = 0;
    for (User user : users) {
      if (user != null) {
        nonNullUsersAmount++;
      }
    }

    // Créer un tableau pour stocker les utilisateurs non nulls
    User[] nonNullUsers = new User[nonNullUsersAmount];

    // Copier les utilisateurs non nulls dans le nouveau tableau
    int index = 0;
    for (User user : users) {
      if (user != null)
