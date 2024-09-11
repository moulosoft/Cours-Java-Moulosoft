package com.itbulls.learnit.javacore.oop.datastructures;

public interface Vehicle {
	//  Cette ligne déclare une interface publique nommée Vehicle
	//  Une interface est un contrat qui définit des méthodes que les classes qui l'implémentent doivent implémenter
	// Le mot clé public signifie que cette interface peut être accessible depuis n'importe où dans le programme.
	
	void drive();
	// Cette ligne définit une méthode abstraite nommée drive().
	//  Une méthode abstraite est une méthode qui n'a pas de corps (implémentation)
	// Les classes qui implémentent l'interface doivent fournir une implémentation concrète pour cette méthode.
	
	void startEngine();
	//  Cette ligne définit une autre méthode abstraite nommée startEngine()
	//  Les classes qui implémentent l'interface doivent également fournir une implémentation concrète pour cette méthode.

}
// En résumé, ce code Java définit une interface nommée Vehicle
// Cette interface spécifie deux méthodes abstraites, drive() et startEngine(). 
// Toute classe qui souhaite implémenter l'interface Vehicle doit fournir des définitions concrètes pour ces deux méthodes
// Cela permet de définir un contrat que les classes qui représentent des véhicules doivent respecter.

