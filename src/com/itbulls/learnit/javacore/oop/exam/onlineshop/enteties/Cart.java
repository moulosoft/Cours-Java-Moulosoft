package com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties;

/**
 * Cette interface définit le contrat d'un panier d'achat.
 * Elle spécifie les méthodes de base qu'un panier doit implémenter.
 */
public interface Cart {

    /**
     * Vérifie si le panier est vide.
     *
     * @return true si le panier ne contient aucun produit, false sinon.
     */
    boolean isEmpty();

    /**
     * Ajoute un produit au panier.
     *
     * @param productById le produit à ajouter.
     */
    void addProduct(Product productById);

    /**
     * Récupère tous les produits contenus dans le panier.
     *
     * @return un tableau contenant tous les produits du panier.
     */
    Product[] getProducts();

    /**
     * Vide complètement le panier.
     */
    void clear();
}
