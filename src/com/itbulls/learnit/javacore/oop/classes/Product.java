package com.itbulls.learnit.javacore.oop.classes;

import java.math.BigDecimal;

/**
 * Cette classe représente un produit avec un nom et un prix.
 */
public class Product {

  /**
   * Nom du produit.
   */
  private String name;

  /**
   * Prix du produit, stocké en utilisant la classe BigDecimal pour une meilleure précision.
   */
  private BigDecimal price;

  /**
   * Constructeur par défaut sans arguments.
   * Initialise le nom et le prix à des valeurs par défaut (pouvant être null).
   */
  public Product() {
  }

  /**
   * Constructeur avec arguments.
   * Permet de définir le nom et le prix du produit lors de sa création.
   *
   * @param name Le nom du produit.
   * @param price Le prix du produit (un objet BigDecimal).
   */
  public Product(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }

  /**
   * Méthode permettant d'obtenir le nom du produit.
   *
   * @return Le nom du produit (une chaîne de caractères).
   */
  public String getName() {
    return name;
  }

  /**
   * Méthode permettant de modifier le nom du produit.
   *
   * @param name Le nouveau nom du produit.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Méthode permettant d'obtenir le prix du produit.
   *
   * @return Le prix du produit (un objet BigDecimal).
   */
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Méthode permettant de modifier le prix du produit.
   *
   * @param price Le nouveau prix du produit (un objet BigDecimal).
   */
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Redéfinition de la méthode toString() héritée de la classe Object.
   * Permet de créer une représentation textuelle du produit sous la forme "Product [name=, price=]".
   *
   * @return Une chaîne de caractères représentant l'état du produit.
   */
  @Override
  public String toString() {
    return "Product [name=" + name + ", price=" + price + "]";
  }
}
