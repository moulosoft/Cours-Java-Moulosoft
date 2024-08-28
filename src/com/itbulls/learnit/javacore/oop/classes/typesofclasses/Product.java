package com.itbulls.learnit.javacore.oop.classes.typesofclasses;  // Déclaration du package auquel appartient la classe Product.

public abstract class Product {  // abstract: Déclaration d'une classe abstraite. On ne peut pas créer directement une instance de cette classe.

    // Attribut privé pour stocker l'identifiant du produit
    private int id;

    // Attribut privé pour stocker le nom du produit
    private String name;

    // Attribut privé pour stocker la quantité minimale de commande
    private int minOrderQuantity;

    // Attribut privé indiquant si la livraison est disponible
    private boolean isDeliveryAvailable;

    // Méthode abstraite obligeant les classes filles à implémenter la vérification de stock
    public abstract boolean isAvailableInStock();

    // Méthode pour obtenir la quantité restante en stock (implémentation fictive ici)
    public int getRemainingAmountInStock() {
        // Code simulé pour vérifier la quantité de produit en base de données (à implémenter)
        return 100; // Valeur fictive pour l'exemple
    }

    // Getters et Setters pour les attributs de la classe

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinOrderQuantity() {
        return minOrderQuantity;
    }

    public void setMinOrderQuantity(int minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public boolean isDeliveryAvailable() {
        return isDeliveryAvailable;
    }

    public void setDeliveryAvailable(boolean isDeliveryAvailable) {
        this.isDeliveryAvailable =  isDeliveryAvailable;
    }
}
