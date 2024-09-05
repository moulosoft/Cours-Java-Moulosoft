// Package de l'implémentation de l'interface OrderManagementService
package com.itbulls.learnit.javacore.oop.exam.onlineshop.services.impl;

// Import de la classe Arrays pour la manipulation de tableaux
import java.util.Arrays;

// Import de la classe Order et de l'interface OrderManagementService
import com.itbulls.learnit.javacore.oop.exam.onlineshop.entities.Order;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.OrderManagementService;

// Classe implémentant l'interface OrderManagementService
public class DefaultOrderManagementService implements OrderManagementService {

  // Constante définissant la capacité initiale du tableau d'ordres
  private static final int DEFAULT_ORDER_CAPACITY = 10;

  // Instance unique du service (Singleton)
  private static DefaultOrderManagementService instance;

  // Indice du dernier élément ajouté dans le tableau d'ordres
  private int lastIndex;

  // Tableau d'ordres
  private Order[] orders;

  // Bloc d'initialisation pour initialiser le tableau d'ordres
  {
    orders = new Order[DEFAULT_ORDER_CAPACITY];
  }

  // Méthode statique pour obtenir l'instance unique du service (Singleton)
  public static OrderManagementService getInstance() {
    if (instance == null) {
      instance = new DefaultOrderManagementService();
    }
    return instance;
  }

  // Implémentation de la méthode addOrder de l'interface
  @Override
  public void addOrder(Order order) {
    // Ne rien faire si l'objet order est null
    if (order == null) {
      return;
    }

    // Augmenter la taille du tableau si nécessaire
    if (orders.length <= lastIndex) {
      orders = Arrays.copyOf(orders, orders.length << 1);
    }

    // Ajouter l'ordre au tableau
    orders[lastIndex++] = order;
  }

  // Implémentation de la méthode getOrdersByUserId de l'interface
  @Override
  public Order[] getOrdersByUserId(int userId) {
    // Compter le nombre de commandes pour l'utilisateur donné
    int amountOfUserOrders = 0;
    for (Order order : orders) {
      if (order != null && order.getCustomerId() == userId) {
        amountOfUserOrders++;
      }
    }

    // Créer un tableau pour stocker les commandes de l'utilisateur
    Order[] userOrders = new Order[amountOfUserOrders];

    // Copier les commandes de l'utilisateur dans le nouveau tableau
    int index = 0;
    for (Order order : orders) {
      if (order != null && order.getCustomerId() == userId) {
        userOrders[index++] = order;
      }
    }

    // Renvoyer le tableau des commandes de l'utilisateur
    return userOrders;
  }

  // Implémentation de la méthode getOrders de l'interface
  @Override
  public Order[] getOrders() {
    // Compter le nombre de commandes non nulles
    int nonNullOrdersAmount = 0;
    for (Order order : orders) {
      if (order != null) {
        nonNullOrdersAmount++;
      }
    }

    // Créer un tableau pour stocker les commandes non nulles
    Order[] nonNullOrders = new Order[nonNullOrdersAmount];

    // Copier les commandes non nulles dans le nouveau tableau
    int index = 0;
    for (Order order : orders) {
      if (order != null) {
        nonNullOrders[index++] = order;
      }
    }

    // Renvoyer le tableau des commandes non nulles
    return nonNullOrders;
  }

  // Méthode privée pour effacer l'état du service (utilisée en interne)
  private void clearServiceState() {
    lastIndex = 0;
    orders = new Order[DEFAULT_ORDER_CAPACITY];
  }
}
