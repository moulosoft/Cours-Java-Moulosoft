package com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl;

import java.util.Scanner;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Order;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.impl.DefaultOrder;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.OrderManagementService;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.impl.DefaultOrderManagementService;

/**
 * Cette classe implémente l'interface Menu et représente le menu de passage en caisse.
 */
public class CheckoutMenu implements Menu {

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
        // Boucle infinie pour répéter la demande de confirmation d'achat
        while (true) {
            printMenuHeader();
            Scanner sc = new Scanner(System.in);
            String userInput = sc.next();

            // Tente de créer la commande en fonction du numéro de carte saisi
            if (!createOrder(userInput)) {
                continue; // Recommence la boucle si la création échoue
            }

            // Vide le panier de la session après validation de la commande
            context.getSessionCart().clear();
            break; // Sort de la boucle si la création est réussie
        }

        System.out.println("Merci pour votre achat. Les détails de livraison de votre commande ont été envoyés à votre adresse email.");
    }

    private boolean createOrder(String creditCardNumber) {
        // Création d'une nouvelle commande
        Order order = new DefaultOrder();

        // Vérifie la validité du numéro de carte de crédit saisi par l'utilisateur
        if (!order.isCreditCardNumberValid(creditCardNumber)) {
            return false; // Retourne false si le numéro est invalide
        }

        // Définit les informations de la commande
        order.setCreditCardNumber(creditCardNumber);
        order.setProducts(context.getSessionCart().getProducts()); // Récupère les produits du panier
        order.setCustomerId(context.getLoggedInUser().getId()); // Récupère l'identifiant de l'utilisateur connecté

        // Ajoute la commande au système via le service de gestion des commandes
        orderManagementService.addOrder(order);

        return true; // Retourne true si la commande a été créée avec succès
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** PASSER EN CAISSE *****");
        System.out.print("Entrez votre numéro de carte de crédit sans espaces et appuyez sur Entrée pour confirmer l'achat: ");
    }
}
