package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.menu.impl;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.ProductManagementService;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.impl.DefaultProductManagementService;

/**
 * Cette classe implémente l'interface Menu et représente le menu du catalogue de produits.
 */
public class ProductCatalogMenu implements Menu {

    // Commande pour passer au paiement (probablement saisie par l'utilisateur)
    public static final String CHECKOUT_COMMAND = "checkout";

    // Contexte de l'application injecté
    private ApplicationContext context;

    // Service de gestion des produits
    private ProductManagementService productManagementService;

    // Bloc d'initialisation pour récupérer le contexte de l'application et le service de gestion des produits
    {
        context = ApplicationContext.getInstance();
        productManagementService = DefaultProductManagementService.getInstance();
    }

    @Override
    public void start() {
        // <write your code here> // Code à implémenter pour afficher et gérer le catalogue de produits
    }

    @Override
    public void printMenuHeader() {
        // <write your code here> // Code à implémenter pour afficher l'en-tête du menu
    }
}
