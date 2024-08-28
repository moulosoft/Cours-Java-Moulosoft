package com.itbulls.learnit.javacore.oop.classes.typesofclasses;

import com.itbulls.learnit.javacore.oop.classes.Cart;
import com.itbulls.learnit.javacore.oop.classes.Cart.Discount;
import com.itbulls.learnit.javacore.oop.classes.Cart.Tax;

public class Demo {

    public static void main(String[] args) {
        // Création d'un nouvel utilisateur (instance de la classe User)
        User user = new User();

        // === Commentaire sur les classes imbriquées et internes ===

        // // Tentative de création d'une instance de la classe imbriquée statique Tax (commentaire)
	    //les arguments de Tax(String taxType, double taxRate)
         Tax tax = new Cart.Tax("someTaxType", 0);
        // La classe Tax est imbriquée statiquement dans la classe Cart, 
        // on peut y accéder directement via Cart.Tax

        // // Tentative de création d'une instance de la classe interne Discount (commentaire)
//les arguments de la classe  Discount(String discountName, double discountRate)
         Discount discount = new Cart().new Discount("firstClientDiscount", 0);
        // La classe Discount est une classe interne à la classe Cart, 
        // on doit créer une instance de Cart d'abord et ensuite utiliser new Discount

        // === Démonstration de la classe abstraite ===

        // // Product est une classe abstraite, car il a été déclaré à l'extérieur https://github.com/AndriiPiatakha/learnit_java_core/blob/master/src/com/itbulls/learnit/javacore/oop/classes/typesofclasses/Product.java 
	    //par public abstract class Product, on ne peut pas en créer d'instance directement (commentaire)
        // Product product = new Product();
/*
Caractéristiques d'une classe abstraite :
Contient au moins une méthode abstraite: Une méthode abstraite est déclarée avec le mot-clé abstract et n'a pas de corps (implémentation).
Ne peut pas être instanciée: On ne peut pas créer directement un objet d'une classe abstraite.
Peut contenir des méthodes concrètes: En plus des méthodes abstraites, une classe abstraite peut contenir des méthodes avec une implémentation complète.

Caractéristiques principales :
Corps complet: Une méthode concrète contient un bloc d'instructions entre accolades {} qui décrivent les opérations à réaliser.
Peut être appelée directement: Contrairement à une méthode abstraite, une méthode concrète peut être invoquée directement sur un objet de la classe où elle est définie.
Peut être redéfinie: Une méthode concrète héritée d'une classe parente peut être redéfinie (ou surchargée) dans une classe fille pour fournir une implémentation spécifique.

exemple:

public class Animal {
    public void seDeplacer() {
        System.out.println("L'animal se déplace.");
    }
}

public class Chien extends Animal {
    // Redéfinition de la méthode seDeplacer()
    @Override
    public void seDeplacer() {
        System.out.println("Le chien court.");
    }
}
*/

        // Création d'une instance de la classe MasterProduct (héritée de la classe Product déclarée ici 
	   // https://github.com/AndriiPiatakha/learnit_java_core/blob/master/src/com/itbulls/learnit/javacore/oop/classes/typesofclasses/MasterProduct.java)
        MasterProduct masterProduct = new MasterProduct();

        // Création d'une instance de la classe VariantProduct (hérite de Product)
        VariantProduct variantProduct = new VariantProduct();

        // Définition du nom du produit principal avec la methode setName qui vient normalement de la classe 
// Product mais comme masterProduct est héritée de Product , masterProduct peut l'utiliser.
        masterProduct.setName("Mercedes S-klass");

        // Activation de la disponibilité de livraison pour le produit variant grâce à l'héritage
        variantProduct.setDeliveryAvailable(true);

        // === Démonstration de la classe anonyme ===

        // Création d'une instance anonyme de la classe Product (implémentation directe)
        Product product = new Product() {
            @Override
            public boolean isAvailableInStock() {
                return false; // Ce produit n'est pas disponible en stock
            }
        };
    }
}
