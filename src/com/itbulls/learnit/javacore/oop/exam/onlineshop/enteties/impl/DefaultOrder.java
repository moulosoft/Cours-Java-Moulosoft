// Package de l'implémentation de la classe Order
package com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.impl;

// Import de classes utilitaires et de la classe Product
import java.util.Arrays;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Product;

// Classe implémentant l'interface Order
public class DefaultOrder implements Order {

  // Constante pour le nombre de chiffres dans un numéro de carte de crédit
  private static final int AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER = 16;

  // Attributs de la classe Order
  private String creditCardNumber; // Numéro de carte de crédit
  private Product[] products; // Tableau de produits dans la commande
  private int customerId; // Identifiant du client

  // Méthode pour vérifier la validité du numéro de carte de crédit
  @Override
  public boolean isCreditCardNumberValid(String creditCardNumber) {
    return creditCardNumber.toCharArray().length == AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER &&
           !creditCardNumber.contains(" ") && Long.parseLong(creditCardNumber) > 0;
  }
  /*creditCardNumber.toCharArray().length == AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER:

Convertit la chaîne creditCardNumber en un tableau de caractères.
Vérifie si la longueur du tableau (c'est-à-dire le nombre de chiffres dans le numéro de carte) est égale à la constante AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER (probablement 16 pour les cartes standard).
!creditCardNumber.contains(" "):

Vérifie si la chaîne creditCardNumber ne contient pas d'espace. Un numéro de carte de crédit valide ne doit pas avoir d'espaces.
Long.parseLong(creditCardNumber) > 0:

Convertit la chaîne creditCardNumber en un nombre de type long (en supposant que le numéro de carte de crédit est un nombre entier).
Vérifie si le nombre résultant est supérieur à 0. Un numéro de carte de crédit valide ne peut pas être négatif.*/

  // Méthode pour définir le numéro de carte de crédit
  @Override
  public void setCreditCardNumber(String creditCardNumber) {
    if (creditCardNumber == null) {
      return;
    }
    this.creditCardNumber = creditCardNumber;
  }

  // Méthode pour définir les produits de la commande
  @Override
  public void setProducts(Product[] products) {
    this.products = products;
  }

  // Méthode pour définir l'identifiant du client
  @Override
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  // Méthode pour obtenir l'identifiant du client
  @Override
  public int getCustomerId() {
    return this.customerId;
  }

  // Méthode toString pour représenter l'objet Order en chaîne de caractères
  @Override
  public String toString() {
    return "Order: customer id - " + this.customerId + "\t" +
           "credit card number - " + this.creditCardNumber + "\t" +
           "products - " + Arrays.toString(this.products);
  }
}
