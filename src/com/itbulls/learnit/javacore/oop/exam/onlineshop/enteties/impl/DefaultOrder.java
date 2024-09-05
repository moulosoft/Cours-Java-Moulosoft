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
