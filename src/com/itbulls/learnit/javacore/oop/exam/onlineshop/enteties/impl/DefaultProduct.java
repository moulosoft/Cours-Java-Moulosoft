// Package de l'implémentation de la classe Product
package com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.impl;

// Import de la classe Product
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Product;

// Classe implémentant l'interface Product
public class DefaultProduct implements Product {

  // Attributs du produit
  private int id; // Identifiant unique du produit
  private String productName; // Nom du produit
  private String categoryName; // Catégorie du produit
  private double price; // Prix du produit

  // Constructeur sans arguments
  public DefaultProduct() {
  }

  // Constructeur avec arguments
  public DefaultProduct(int id, String productName, String categoryName, double price) {
    this.id = id;
    this.productName = productName;
    this.categoryName = categoryName;
    this.price = price;
  }

  // Méthode toString pour représenter l'objet Product en chaîne de caractères
  @Override
  public String toString() {
    return "Product id=" + id + ", product name=" + productName
           + ", category name=" + categoryName + ", price=" + price;
  }

  // Méthode pour récupérer l'identifiant du produit
  @Override
  public int getId() {
    return this.id;
  }

  // Méthode pour récupérer le nom du produit
  @Override
  public String getProductName() {
    return this.productName;
  }

  // (Méthodes pour les autres attributs pourraient être ajoutées ici)
  // Exemple : getCategoryName(), getPrice(), etc.
}
