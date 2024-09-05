package com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties;

/**
 * Cette interface définit le contrat d'un produit.
 * Elle spécifie les méthodes de base qu'un produit doit implémenter.
 */
public interface Product {

    /**
     * Récupère l'identifiant unique du produit.
     *
     * @return l'identifiant du produit.
     */
    int getId();

    /**
     * Récupère le nom du produit.
     *
     * @return le nom du produit.
     */
    String getProductName();
}
