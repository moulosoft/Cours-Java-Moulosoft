package com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties;

/**
 * Cette interface définit le contrat d'un utilisateur.
 * Elle spécifie les méthodes de base qu'un utilisateur doit implémenter.
 */
public interface User {

    /**
     * Récupère le prénom de l'utilisateur.
     *
     * @return le prénom de l'utilisateur.
     */
    String getFirstName();

    /**
     * Récupère le nom de famille de l'utilisateur.
     *
     * @return le nom de famille de l'utilisateur.
     */
    String getLastName();

    /**
     * Récupère le mot de passe de l'utilisateur.
     *
     * @return le mot de passe de l'utilisateur.
     */
    String getPassword();

    /**
     * Récupère l'adresse email de l'utilisateur.
     *
     * @return l'adresse email de l'utilisateur.
     */
    String getEmail();

    /**
     * Récupère l'identifiant unique de l'utilisateur.
     *
     * @return l'identifiant de l'utilisateur.
     */
    int getId();

    /**
     * Définit le nouveau mot de passe de l'utilisateur.
     *
     * @param newPassword le nouveau mot de passe.
     */
    void setPassword(String newPassword);

    /**
     * Définit la nouvelle adresse email de l'utilisateur.
     *
     * @param newEmail la nouvelle adresse email.
     */
    void setEmail(String newEmail);
}
