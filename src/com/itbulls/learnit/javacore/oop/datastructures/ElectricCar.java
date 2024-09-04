package com.itbulls.learnit.javacore.oop.datastructures;

// Cette ligne indique que la classe ElectricCar appartient à un package spécifique.
// Un package sert à organiser le code en modules réutilisables.

public class ElectricCar implements Vehicle {
    // Cette ligne déclare une classe publique nommée ElectricCar.
    // Le mot-clé "public" signifie que cette classe peut être utilisée par d'autres classes.
    // Le mot-clé "implements" indique que cette classe implémente l'interface Vehicle.
    // Cela signifie qu'elle doit fournir une définition pour toutes les méthodes de l'interface Vehicle.

    @Override
    public void drive() {
        // L'annotation @Override indique que cette méthode redéfinie une méthode de la classe parente (ici, l'interface Vehicle).
        // Cette méthode est appelée lorsque la voiture électrique roule.
        System.out.println("Electric car drives");
    }

    @Override
    public void startEngine() {
        // Cette méthode est appelée lorsque le moteur de la voiture électrique est démarré.
        // Bien qu'une voiture électrique n'ait pas de moteur à combustion interne traditionnel,
        // cette méthode peut être utilisée pour simuler le démarrage d'un moteur électrique ou d'autres actions.
        System.out.println("Engine is started");
    }
}
