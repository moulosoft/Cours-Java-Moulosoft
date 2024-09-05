// Package de l'implémentation de la classe User
package com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.impl;

// Import de la classe User
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.User;

// Classe implémentant l'interface User
public class DefaultUser implements User {

  // Compteur statique pour l'attribution d'identifiant unique aux utilisateurs
  private static int userCounter = 0;

  // Attributs de l'utilisateur
  private int id; // Identifiant unique de l'utilisateur
  private String firstName; // Prénom de l'utilisateur
  private String lastName; // Nom de famille de l'utilisateur
  private String password; // Mot de passe de l'utilisateur
  private String email; // Adresse email de l'utilisateur

  // Bloc d'initialisation pour attribuer un identifiant unique à chaque utilisateur créé
  {
    id = ++userCounter;
  }

  // Constructeur sans arguments
  public DefaultUser() {
  }

  // Constructeur avec arguments
  public DefaultUser(String firstName, String lastName, String password, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.email = email;
  }

  // Méthode pour récupérer le prénom de l'utilisateur
  @Override
  public String getFirstName() {
    return this.firstName;
  }

  // Méthode pour récupérer le nom de famille de l'utilisateur
  @Override
  public String getLastName() {
    return this.lastName;
  }

  // Méthode pour récupérer le mot de passe de l'utilisateur
  @Override
  public String getPassword() {
    return this.password;
  }

  // Méthode pour récupérer l'adresse email de l'utilisateur
  @Override
  public String getEmail() {
    return this.email;
  }

  // Méthode toString pour représenter l'objet User en chaîne de caractères
  @Override
  public String toString() {
    return "Prénom: " + this.getFirstName() + "\t\t" +
           "Nom: " + this.getLastName() + "\t\t" +
           "Email: " + this.getEmail();
  }

  // Méthode pour définir le mot de passe de l'utilisateur
  @Override
  public void setPassword(String password) {
    if (password == null) {
      return;
    }
    this.password = password;
  }

  // Méthode pour définir l'adresse email de l'utilisateur
  @Override
  public void setEmail(String newEmail) {
    if (newEmail == null) {
      return;
    }
    this.email = newEmail;
  }

  // Méthode pour récupérer l'identifiant unique de l'utilisateur
  @Override
  public int getId() {
    return this.id;
  }

  // Méthode privée non-standard (ne fait pas partie de l'interface User)
  // Permet de réinitialiser le compteur d'identifiant (à utiliser avec prudence)
  private void clearState() {
    userCounter = 0;
  }
}
