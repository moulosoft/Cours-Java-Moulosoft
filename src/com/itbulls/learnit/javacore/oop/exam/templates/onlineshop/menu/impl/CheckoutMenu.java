package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.menu.impl;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.OrderManagementService;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.impl.DefaultOrderManagementService;

/**
 * Cette classe implémente l'interface Menu et représente le menu de paiement.
 */
public class CheckoutMenu implements Menu {

    // Contexte de l'application injecté
    private ApplicationContext context;

    // Service de gestion des commandes
    private OrderManagementService orderManagementService;

    // Bloc d'initialisation pour récupérer le contexte de l'application et le service de gestion des commandes
    {
        context = ApplicationContext.getInstance();
        orderManagementService = DefaultOrderManagementService.getInstance();
    }

    @Override
    public void start() {
        // <write your code here> // Code à implémenter pour lancer le menu de paiement
    }

    @Override
    public void printMenuHeader() {
        // <write your code here> // Code à implémenter pour afficher l'en-tête du menu
    }
}
