// Package de l'implémentation de l'interface ProductManagementService
package com.itbulls.learnit.javacore.oop.exam.onlineshop.services.impl;

// Import de la classe Product qui représente un produit
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Product;

// Import de la classe DefaultProduct qui implémente probablement la classe Product
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.impl.DefaultProduct;

// Import de l'interface ProductManagementService
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.ProductManagementService;

// Classe implémentant l'interface ProductManagementService (Singleton)
public class DefaultProductManagementService implements ProductManagementService {

  // Instance unique du service (Singleton)
  private static DefaultProductManagementService instance;

  // Tableau de produits
  private static Product[] products;

  // Bloc d'initialisation statique pour initialiser le tableau de produits
  static {
    initProducts();
  }

  // Méthode privée pour initialiser le tableau de produits avec des exemples
  private static void initProducts() {
    products = new Product[] {
      // Exemples de produits avec leur id, nom, catégorie et prix
      new DefaultProduct(1, "Hardwood Oak Suffolk Internal Door", "Doors", 109.99),
      new DefaultProduct(2, "Oregon Cottage Interior Oak Door", "Doors", 179.99),
      // ... (autres exemples de produits)
    };
  }

  // Constructeur privé pour empêcher l'instanciation directe (Singleton)
  private DefaultProductManagementService() {
  }

  // Méthode statique pour obtenir l'instance unique du service (Singleton)
  public static ProductManagementService getInstance() {
    if (instance == null) {
      instance = new DefaultProductManagementService();
    }
    return instance;
  }

  // Implémentation de la méthode getProducts de l'interface
  @Override
  public Product[] getProducts() {
    // Renvoyer le tableau de produits complet (copie)
    return products.clone();
  }

  // Implémentation de la méthode getProductById de l'interface
  @Override
  public Product getProductById(int productIdToAddToCart) {
    // Parcourir le tableau de produits pour trouver celui avec l'id correspondant
    for (Product product : products) {
      if (product != null && product.getId() == productIdToAddToCart) {
        return product;
      }
    }
    // Renvoyer null si le produit n'est pas trouvé
    return null;
  }
}
