// Package de l'implémentation de la classe Cart
package com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.impl;

// Import de classes utilitaires et de la classe Product
import java.util.Arrays;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Product;

// Classe implémentant l'interface Cart
public class DefaultCart implements Cart {

  // Capacité initiale du tableau de produits
  private static final int DEFAULT_PRODUCT_CAPACITY = 10;

  // Tableau de produits dans le panier
  private Product[] products;

  // Indice du dernier produit ajouté dans le panier
  private int lastIndex;

  // Bloc d'initialisation pour initialiser le tableau de produits
  {
    products = new Product[DEFAULT_PRODUCT_CAPACITY];
  }

  // Méthode pour vérifier si le panier est vide
  @Override
  public boolean isEmpty() {
    // Si le tableau de produits est null ou vide, le panier est vide
    if (products == null || products.length == 0) {
      return true;
    }

    // Parcourir le tableau pour vérifier s'il contient des produits non nulls
    for (Product product : products) {
      if (product != null) {
        return false; // Si un produit non null est trouvé, le panier n'est pas vide
      }
    }

    // Si aucun produit non null n'est trouvé, le panier est vide
    return true;
  }

  // Méthode pour ajouter un produit au panier
  @Override
  public void addProduct(Product product) {
    // Vérifier si le produit est null
    if (product == null) {
      return;
    }

    // Augmenter la taille du tableau si nécessaire
    if (products.length <= lastIndex) {
      products = Arrays.copyOf(products, products.length << 1);
    }

    // Ajouter le produit au tableau
    products[lastIndex++] = product;
  }

  // Méthode pour récupérer les produits du panier
  @Override
  public Product[] getProducts() {
    // Compter le nombre de produits non nulls
    int nonNullProductsAmount = 0;
    for (Product product : products) {
      if (product != null) {
        nonNullProductsAmount++;
      }
    }

    // Créer un tableau pour stocker les produits non nulls
    Product[] nonNullProducts = new Product[nonNullProductsAmount];

    // Copier les produits non nulls dans le nouveau tableau
    int index = 0;
    for (Product product : products) {
      if (product != null) {
        nonNullProducts[index++] = product;
      }
    }

    // Renvoyer le tableau des produits non nulls
    return nonNullProducts;
  }

  // Méthode pour vider le panier
  @Override
  public void clear() {
    // Réinitialiser le tableau de produits
    products = new Product[DEFAULT_PRODUCT_CAPACITY];
  }
}
