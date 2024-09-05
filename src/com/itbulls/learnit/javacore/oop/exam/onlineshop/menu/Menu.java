package com.itbulls.learnit.javacore.oop.exam.onlineshop.menu;

/**
 * Cette interface définit le contrat de base pour tous les menus de l'application.
 * Un menu est une entité qui peut être lancée (start) et qui possède un en-tête (printMenuHeader).
 */
public interface Menu {

    /**
     * Lance le menu. C'est la méthode principale qui est appelée pour démarrer un menu.
     * Elle contient la logique spécifique à chaque menu (par exemple, afficher des options,
     * lire les entrées utilisateur, etc.).
     */
    void start();

    /**
     * Affiche l'en-tête du menu. L'en-tête est généralement le titre du menu.
     */
    void printMenuHeader();
}
