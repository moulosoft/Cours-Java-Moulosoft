// Ce package définit l'emplacement exact de ce fichier dans la structure de votre projet Java.
package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.services;

// On importe la classe Product qui représente un produit dans notre boutique en ligne.
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Product;

// On déclare une interface nommée ProductManagementService.
// Une interface en Java définit un contrat : elle spécifie les méthodes qu'une classe doit implémenter.
// Cette interface sert à définir les opérations de base pour gérer les produits.
public interface ProductManagementService {

    // Cette méthode permet de récupérer tous les produits disponibles.
    // Elle renvoie un tableau de produits, ce qui signifie qu'elle peut retourner plusieurs produits.
    Product[] getProducts();

    // Cette méthode permet de récupérer un produit spécifique en utilisant son identifiant.
    // L'identifiant du produit est passé en paramètre.
    // Cette méthode est utile par exemple pour afficher les détails d'un produit ou l'ajouter au panier.
    Product getProductById(int productIdToAddToCart);
}
