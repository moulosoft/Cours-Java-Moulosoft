package com.itbulls.learnit.javacore.oop.exam.onlineshop.services;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.entities.Product;

// Interface définissant les opérations possibles sur les produits
public interface ProductManagementService {

    // Méthode pour récupérer tous les produits
    // Retourne un tableau de produits
    Product[] getProducts();

    // Méthode pour récupérer un produit par son identifiant
    // Prend en paramètre l'identifiant du produit
    // Retourne l'objet produit correspondant
    Product getProductById(int productIdToAddToCart);
}
