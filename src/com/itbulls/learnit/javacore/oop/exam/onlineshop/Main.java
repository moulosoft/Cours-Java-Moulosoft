// Déclaration de package : Indique que la classe appartient au package "com.itbulls.learnit.javacore.oop.exam.onlineshop"
package com.itbulls.learnit.javacore.oop.exam.onlineshop;

// Instructions d'import : Importent des classes nécessaires d'autres packages
//  - Menu : Interface représentant probablement la structure générale d'un menu
//  - MainMenu : Implémentation concrète de l'interface Menu, probablement spécifique au menu principal
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl.MainMenu;

// Déclaration de la classe publique Main
public class Main {

  // Déclaration de la constante EXIT_COMMAND : Texte utilisé pour quitter le programme
  //  - public : Accessible depuis d'autres classes
  //  - static : Appartient à la classe et non aux instances
  //  - final : Valeur immuable
  //  - String : Type de donnée (chaîne de caractères)
  //  - EXIT_COMMAND : Nom de la constante, valeur "exit"
  public static final String EXIT_COMMAND = "exit";

  // Méthode principale du programme (point d'entrée)
  public static void main(String[] args) {
    // Création d'un objet MainMenu : Initialise le menu principal de l'application
    Menu mainMenu = new MainMenu();

    // Appel de la méthode start() sur l'objet mainMenu : Lance le menu principal
    mainMenu.start();
  }
}
