package com.itbulls.learnit.javacore.primitives;

public class PrimitiveTypes {

    public static void main(String[] args) {
        // byte: entier signé sur 8 bits, plage : -128 à 127
        byte b = 1;

        // short: entier signé sur 16 bits, plage : -32768 à 32767
        short s; // Déclaration d'une variable de type short
        s = 2; // Affectation d'une valeur à la variable short

        // int: entier signé sur 32 bits, couramment utilisé pour les entiers
        int i = 3;

        // long: entier signé sur 64 bits, pour les grands entiers
        long l = 4;

        // char: caractère Unicode sur 16 bits
        char c = 'a';

        // boolean: représente les valeurs vrai ou faux
        boolean bool = true;

        // float: nombre à virgule flottante simple précision sur 32 bits
        float f = 1.2F; // Le suffixe 'F' est requis pour les littéraux float

        // long avec des underscores pour une meilleure lisibilité
        long l2 = 2_000_000_000_000L; // Le suffixe 'L' est requis pour les littéraux long

        // double: nombre à virgule flottante double précision sur 64 bits
        double d = 1.3;

        // var: inférence de type de variable locale (Java 10+)
        var v = 1; // Inféré comme étant un int

        // Conversion de type : conversion d'un short en int
        int i3 = s;

        // Conversion implicite : char en int (valeur ASCII)
        char c2 = 100;
        System.out.println(c2); // Affiche le caractère correspondant à 100 (d)
        System.out.println("Our first class on java programming.......!");

        // Conversion implicite : int en double
        double d2 = i3;
        d2 = l; // Conversion implicite de long en double

        // Conversion explicite (cast) de int en byte, perte de données possible
        b = (byte) i3;

        // Dépassement de capacité dans byte : valeur en dehors de la plage de byte
        byte b2 = (byte) 128;
        System.out.println(b2); // Affiche -128 en raison du dépassement de capacité

        // Nombre long avec des underscores pour une meilleure lisibilité
        long number = 499_999_999_000_000_001L;

        // Conversion de long en double, perte de précision possible
        double converted = (double) number;
        System.out.println(number - (long) converted); // Différence due à la perte de précision

        // Autoboxing : int en Integer
        Integer i4 = 1;

        // Unboxing : Integer en int
        int i5 = i4;
    }
}
