package com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties;

/**
 * Cette interface définit le contrat d'une commande.
 * Elle spécifie les méthodes de base qu'une commande doit implémenter.
 */
public interface Order {

    /**
     * Vérifie la validité du numéro de carte de crédit saisi par l'utilisateur.
     *
     * @param userInput le numéro de carte de crédit saisi par l'utilisateur.
     * @return true si le numéro de carte de crédit est valide, false sinon.
     */
    boolean isCreditCardNumberValid(String userInput);

    /**
     * Définit le numéro de carte de crédit de la commande.
     *
     * @param userInput le numéro de carte de crédit à définir.
     */
    void setCreditCardNumber(String userInput);

    /**
     * Définit les produits inclus dans la commande.
     *
     * @param products le tableau de produits à définir.
     */
    void setProducts(Product[] products);

    /**
     * Définit l'identifiant du client qui a passé la commande.
     *
     * @param customerId l'identifiant du client.
     */
    void setCustomerId(int customerId);

    /**
     * Récupère l'identifiant du client qui a passé la commande.
     *
     * @return l'identifiant du client.
     */
    int getCustomerId();
}
