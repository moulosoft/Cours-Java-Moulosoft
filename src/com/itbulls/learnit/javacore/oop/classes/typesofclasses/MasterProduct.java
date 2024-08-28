package com.itbulls.learnit.javacore.oop.classes.typesofclasses;

public class MasterProduct extends Product {  /// on declare la classe MasterProduct comme étant une classe héritée de Product

    // Attribut privé indiquant si le produit peut être loué
    private boolean isAvailableForLease;

    // Redéfinition de la méthode isAvailableInStock() héritée de la classe parente Product
    @Override
    public boolean isAvailableInStock() {
        // Vérifie si la quantité restante en stock est supérieure à 0
        return getRemainingAmountInStock() > 0;
    }
}
