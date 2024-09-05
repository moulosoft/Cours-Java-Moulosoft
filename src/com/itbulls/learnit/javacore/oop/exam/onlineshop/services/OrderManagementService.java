package com.itbulls.learnit.javacore.oop.exam.onlineshop.services;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.entities.Order;

// Interface définissant les opérations possibles sur les commandes
public interface OrderManagementService {

    // Méthode pour ajouter une nouvelle commande
    // Prend en paramètre un objet Order représentant la commande à ajouter
    void addOrder(Order order);

    // Méthode pour récupérer toutes les commandes d'un utilisateur
    // Prend en paramètre l'identifiant de l'utilisateur (userId)
    // Retourne un tableau d'objets Order contenant les commandes de l'utilisateur
    Order[] getOrdersByUserId(int userId);

    // Méthode pour récupérer toutes les commandes
    // Retourne un tableau d'objets Order contenant toutes les commandes
    Order[] getOrders();
}
