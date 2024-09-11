package com.itbulls.learnit.javacore.oop.datastructures;
// Cette ligne indique que le fichier de code appartient au package
// Un package est utilisé pour organiser les classes et les fichiers Java en groupes logiques.
public class Motorcycle implements Vehicle {
// Cette ligne déclare une classe publique nommée Motorcycle. 
// Le mot clé public signifie que cette classe peut être accessible depuis n'importe où dans le programme.
// Le mot clé implements indique que la classe Motorcycle implémente l'interface Vehicle. 
// Une interface est un contrat qui définit des méthodes que les classes qui l'implémentent doivent implémenter.
	@Override  //Cette annotation indique que la méthode suivante réécrit une méthode de la classe parente ou de l'interface.
	public void drive() { 
// Cette méthode est définie dans l'interface Vehicle.
//  Elle est appelée lorsque le véhicule se déplace.
//  La méthode imprime simplement "Motorcycle drives" sur la console		
		System.out.println("Motorcycle drives");
	}

	@Override
	public void startEngine() { 
//  Cette méthode est également définie dans l'interface Vehicle.
// Elle est appelée pour démarrer le moteur du véhicule.
// La méthode imprime "Engine is started" sur la console.		
		System.out.println("Engine is started");		
	}

}

// ce code Java définit une classe Motorcycle qui implémente l'interface Vehicle.
//  La classe Motorcycle contient deux méthodes, drive() et startEngine(), qui sont définies dans l'interface Vehicle.
// Ces méthodes sont utilisées pour simuler le comportement d'une moto, comme conduire et démarrer le moteur.

