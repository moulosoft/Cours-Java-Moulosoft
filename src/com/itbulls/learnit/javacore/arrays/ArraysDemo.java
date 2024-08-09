package com.itbulls.learnit.javacore.arrays;

import java.util.Arrays;




public class ArraysDemo {

    public static void main(String[] args) {
        int[] arr; // Déclaration d'un tableau d'entiers
        int arr2[]; // Autre façon de déclarer un tableau d'entiers

        arr = new int[10]; // Création d'un tableau d'entiers de taille 10
        // System.out.println(arr.length); // Affiche la longueur du tableau
        // System.out.println(arr[0]); // Affiche la valeur de la première case du tableau (initialement 0)

        double[] arr3 = new double[10]; // Création d'un tableau de doubles de taille 10
        // System.out.println(arr3[0]); // Affiche la valeur de la première case du tableau (initialement 0.0)

        boolean[] arr4 = new boolean[10]; // Création d'un tableau de booléens de taille 10
        // System.out.println(arr4[0]); // Affiche la valeur de la première case du tableau (initialement false)

        // System.out.println(arr4[10]); // Cela causerait une erreur car l'indice est hors limites

        int[] arr5 = {3, 2, 1}; // Création d'un tableau d'entiers initialisé avec des valeurs

        int[][] matrix = {
                {1, 2, 3}, // Création d'un tableau à deux dimensions (matrice)
                {4, 5, 6}
        };

        // System.out.println(matrix[0][2]); // Affiche la valeur de la première ligne, troisième colonne (3)

        int[][] matrix2 = new int[10][10]; // Création d'une matrice de 10x10
        // System.out.println(matrix2[0]); // Affiche l'adresse mémoire du premier tableau de la matrice

        System.out.println(Arrays.toString(arr5)); // Affiche le contenu du tableau arr5 sous forme de chaîne de caractères
        Arrays.sort(arr5); // Trie le tableau arr5 par ordre croissant
        System.out.println(Arrays.toString(arr5)); // Affiche le tableau arr5 trié
    }
}
