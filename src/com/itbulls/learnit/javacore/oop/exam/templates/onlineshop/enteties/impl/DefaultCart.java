package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.enteties.impl;

import com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.enteties.Cart;
import com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.enteties.Product;

/**
 * Cette classe implémente l'interface Cart et représente un panier d'achat.
 */
public class DefaultCart implements Cart {

    // <write your code here> // Ajoutez ici les attributs nécessaires pour représenter un panier

    @Override
    public boolean isEmpty() {
        // Vérifie si le panier est vide
        // Implémentez ici la logique pour déterminer si le panier contient des produits
        // Par exemple, vous pouvez utiliser un tableau ou une liste pour stocker les produits,
        // et vérifier si le tableau ou la liste est vide.
        return true; // Remplacez ce 'true' par la condition appropriée
    }

    @Override
    public void addProduct(Product product) {
        // Ajoute un produit au panier
        // Implémentez ici la logique pour ajouter le produit au panier
        // Vous pouvez utiliser un tableau ou une liste pour stocker les produits.
    }

    @Override
    public Product[] getProducts() {
        // Récupère les produits contenus dans le panier
        // Implémentez ici la logique pour récupérer les produits du panier
        // Vous pouvez retourner un tableau contenant les produits stockés dans le panier.
        return null; // Remplacez ce 'null' par le tableau de produits approprié
    }

    @Override
    public void clear() {
        // Vide le panier
        // Implémentez ici la logique pour vider le panier
        // Par exemple, vous pouvez réinitialiser le tableau ou la liste utilisé pour stocker les produits.
    }
}
