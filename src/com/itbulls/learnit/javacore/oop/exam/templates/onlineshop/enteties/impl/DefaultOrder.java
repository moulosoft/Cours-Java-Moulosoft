package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.enteties.impl;

import com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.enteties.Order;
import com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.enteties.Product;

/**
 * Cette classe implémente l'interface Order et représente une commande.
 */
public class DefaultOrder implements Order {

    // Constante pour le nombre de chiffres dans un numéro de carte de crédit
    private static final int AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER = 16;

    // Attributs de la commande
    private String creditCardNumber; // Numéro de carte de crédit
    private Product[] products; // Tableau de produits dans la commande
    private int customerId; // Identifiant du client

    @Override
    public boolean isCreditCardNumberValid(String creditCardNumber) {
        // Vérifie la validité du numéro de carte de crédit
        // Implémentez ici la logique de validation, par exemple en vérifiant la longueur et le format
        return false; // Remplacez ce 'false' par la condition de validation appropriée
    }

    @Override
    public void setCreditCardNumber(String creditCardNumber) {
        // Définit le numéro de carte de crédit de la commande
        // Implémentez ici la logique pour stocker le numéro de carte de crédit
        this.creditCardNumber = creditCardNumber; // Remplacez cette ligne par votre code
    }

    @Override
    public void setProducts(Product[] products) {
        // Définit les produits de la commande
        // Implémentez ici la logique pour stocker les produits dans la commande
        this.products = products; // Remplacez cette ligne par votre code
    }

    @Override
    public void setCustomerId(int customerId) {
        // Définit l'identifiant du client associé à la commande
        // Implémentez ici la logique pour stocker l'identifiant du client
        this.customerId = customerId; // Remplacez cette ligne par votre code
    }

    @Override
    public int getCustomerId() {
        // Récupère l'identifiant du client associé à la commande
        return this.customerId;
    }

    @Override
    public String toString() {
        // Représentation textuelle de la commande
        // Implémentez ici la logique pour construire une chaîne de caractères représentant la commande
        // Vous pouvez inclure les informations telles que le numéro de commande, le client, les produits, etc.
        return null; // Remplacez ce 'null' par la chaîne de caractères appropriée
    }
}
