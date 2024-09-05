package com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Order;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.OrderManagementService;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.impl.DefaultOrderManagementService;

/**
 * Cette classe implémente l'interface Menu et représente le menu de consultation des commandes de l'utilisateur.
 */
public class MyOrdersMenu implements Menu {

    // Contexte de l'application injecté
    private ApplicationContext context;

    // Service de gestion des commandes injecté
    private OrderManagementService orderManagementService;

    // Bloc d'initialisation pour récupérer le contexte de l'application et le service de gestion des commandes
    {
        context = ApplicationContext.getInstance();
        orderManagementService = DefaultOrderManagementService.getInstance();
    }

    @Override
    public void start() {
        // Affiche l'en-tête du menu
        printMenuHeader();

        // Vérifie si l'utilisateur est connecté
        if (context.getLoggedInUser() == null) {
            System.out.println(
                    "Veuillez vous connecter ou créer un nouveau compte pour voir la liste de vos commandes");
            new MainMenu().start(); // Redirige vers le menu principal
            return;
        } else {
            // Affiche les commandes de l'utilisateur connecté
            printUserOrdersToConsole();
        }
    }

    private void printUserOrdersToConsole() {
        // Récupère les commandes de l'utilisateur connecté via le service de gestion des commandes
        Order[] loggedInUserOrders = orderManagementService
                .getOrdersByUserId(context.getLoggedInUser().getId());

        // Vérifie si l'utilisateur a des commandes
        if (loggedInUserOrders == null || loggedInUserOrders.length == 0) {
            System.out.println(
                    "Vous n'avez malheureusement pas encore de commandes. "
                    + "Retournez au menu principal pour passer une nouvelle commande");
        } else {
            // Parcourt et affiche chaque commande de l'utilisateur
            for (Order order : loggedInUserOrders) {
                System.out.println(order); // On suppose que la classe Order possède une implémentation toString() pour afficher les informations de la commande.
            }
        }
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** MES COMMANDES *****");
    }
}
