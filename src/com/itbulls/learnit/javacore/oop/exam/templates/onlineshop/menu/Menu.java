package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.menu;

/**
 * Cette interface définit le contrat de base pour tous les menus de l'application.
 * Un menu est un élément interactif qui permet à l'utilisateur de naviguer et d'interagir avec l'application.
 */
public interface Menu {

    /**
     * Démarre le menu.
     * Cette méthode est appelée lorsque l'utilisateur sélectionne ce menu.
     * Elle contient la logique principale pour afficher le menu, gérer les choix de l'utilisateur et effectuer les actions correspondantes.
     */
    void start();

    /**
     * Affiche l'en-tête du menu.
     * Cette méthode est généralement appelée avant d'afficher les options du menu.
     * Elle permet d'indiquer à l'utilisateur le nom ou le titre du menu.
     */
    void printMenuHeader();
}
