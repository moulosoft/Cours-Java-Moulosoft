// Indique le package auquel appartient ce code (structure de projet)
package com.itbulls.learnit.javacore.oop.exam.onlineshop;

// Importe la classe Menu de l'entité 'menu.onlineshop' (représente un menu)
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;

// Importe la classe MainMenu de l'entité 'menu.impl.onlineshop' (implémentation concrète de Menu)
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl.MainMenu;

// Classe principale de l'application (point d'entrée)
public class Main {

	// Constante définissant la commande de sortie de l'application
	public static final String EXIT_COMMAND = "exit";

	// Méthode principale (point d'entrée de l'application)
	public static void main(String[] args) {
		// Crée une instance du menu principal
		Menu mainMenu = new MainMenu();
		
		// Démarre le menu principal
		mainMenu.start();
	}
}
