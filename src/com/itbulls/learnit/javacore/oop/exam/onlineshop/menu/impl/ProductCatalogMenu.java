package com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl;

import java.util.Scanner;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Cart;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Product;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.ProductManagementService;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.impl.DefaultProductManagementService;

/**
 * Cette classe implémente l'interface Menu et représente le menu du catalogue des produits.
 */
public class ProductCatalogMenu implements Menu {

    // Constante pour la commande de passage en caisse
    private static final String CHECKOUT_COMMAND = "checkout";

    // Contexte de l'application injecté
    private ApplicationContext context;

    // Service de gestion des produits injecté
    private ProductManagementService productManagementService;

    // Bloc d'initialisation pour récupérer le contexte de l'application et le service de gestion des produits
    {
        context = ApplicationContext.getInstance();
        productManagementService = DefaultProductManagementService.getInstance();
    }

    @Override
    public void start() {
        // Variable pour stocker le menu à lancer
        Menu menuToNavigate = null;

        // Boucle infinie pour la navigation dans le menu
        while (true) {
            // Affiche l'en-tête du menu
            printMenuHeader();

            // Affiche la liste des produits
            printProductsToConsole();

            // Lit la saisie de l'utilisateur
            String userInput = readUserInput();

            // Vérifie si l'utilisateur est connecté
            if (context.getLoggedInUser() == null) {
                menuToNavigate = new MainMenu();
                System.out.println("Vous n'êtes pas connecté. Veuillez vous connecter ou créer un nouveau compte");
                break;
            }

            // Gère la navigation vers le menu principal
            if (userInput.equalsIgnoreCase(MainMenu.MENU_COMMAND)) {
                menuToNavigate = new MainMenu();
                break;
            }

            // Gère la commande de passage en caisse
            if (userInput.equalsIgnoreCase(CHECKOUT_COMMAND)) {
                Cart panierSession = context.getSessionCart();

                // Vérifie si le panier est vide
                if (panierSession == null || panierSession.isEmpty()) {
                    System.out.println("Votre panier est vide. Veuillez d'abord ajouter un produit au panier, puis passer à la caisse");
                } else {
                    menuToNavigate = new CheckoutMenu();
                    break;
                }
            } else {
                // Traitement de l'ajout d'un produit au panier
                Product produitAAjouter = fetchProduct(userInput);

                // Vérifie si le produit existe
                if (produitAAjouter == null) {
                    System.out.println("Veuillez saisir l'identifiant du produit si vous souhaitez l'ajouter au panier. Ou saisissez 'checkout' pour passer à la caisse. Ou saisissez 'menu' pour revenir au menu principal.");
                    continue;
                }

                // Ajoute le produit au panier et affiche un message de confirmation
                processAddToCart(produitAAjouter);
            }
        }

        // Lance le menu sélectionné
        menuToNavigate.start();
    }

    private String readUserInput() {
        System.out.print("Identifiant du produit à ajouter au panier ou saisissez 'checkout' pour passer à la caisse: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        return userInput;
    }

    private void printProductsToConsole() {
        Product[] produits = productManagementService.getProducts();
        for (Product produit : produits) {
            System.out.println(produit); // On suppose que la classe Product possède une implémentation toString() pour afficher les informations du produit.
        }
    }

    private Product fetchProduct(String userInput) {
        try {
            int productIdToAddToCart = Integer.parseInt(userInput);
            return productManagementService.getProductById(productIdToAddTo
