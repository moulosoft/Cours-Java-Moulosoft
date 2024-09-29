// Ce package définit l'emplacement de ce fichier dans la structure du projet
package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.services;

// On importe la classe Order qui représente une commande
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Order;

// On définit une interface nommée OrderManagementService
// Une interface en Java définit un contrat : elle spécifie les méthodes qu'une classe doit implémenter
public interface OrderManagementService {

    // Cette méthode ajoute une nouvelle commande au système
    void addOrder(Order order);

    // Cette méthode retourne un tableau de commandes pour un utilisateur spécifique, identifié par son ID
    Order[] getOrdersByUserId(int userId);
    
    // Cette méthode retourne un tableau de toutes les commandes du système
    Order[] getOrders();
}
