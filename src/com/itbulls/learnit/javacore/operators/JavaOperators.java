package com.itbulls.learnit.javacore.operators;

public class JavaOperators {

    public static void main(String[] args) {

        // ============ Opérateurs Arithmétiques

        // *** Opérateurs Arithmétiques Unnaires

        // +
        // -
        // ++
        // --

        System.out.println("===== Opérateurs Arithmétiques Unnaires =====");

        int i = +10; // Opérateur unaire + (pas d'effet ici)
        int i2 = -10; // Opérateur unaire - (négation)
        int i3 = ++i; // Incrémentation préfixée (i est incrémenté avant l'affectation)
        int i4 = i++; // Incrémentation postfixée (i est incrémenté après l'affectation)
        int i5 = --i; // Décrémentation préfixée (i est décrémenté avant l'affectation)
        int i6 = i--; // Décrémentation postfixée (i est décrémenté après l'affectation)
        System.out.println("i = " + i);   // 10
        System.out.println("i2 = " + i2);  // -10
        System.out.println("i3 = " + i3);  // 11
        System.out.println("i4 = " + i4);  // 11
        System.out.println("i5 = " + i5);  // 11
        System.out.println("i6 = " + i6);  // 11
        System.out.println("i = " + i);    // 10

        System.out.println();

        // *** Opérateurs Arithmétiques Binaires

        // +
        // -
        // /
        // %
        // *

        System.out.println("===== Opérateurs Arithmétiques Binaires =====");

        int i7 = 10 + 1; // Addition
        int i8 = i7 - 1; // Soustraction
        int i9 = i8 / 2; // Division entière
        int i10 = i9 % 2; // Modulo (reste de la division)
        int i11 = 5 % 10; // Modulo
        int i12 = i10 * 3; // Multiplication
        System.out.println("i7 = " + i7); // 11
        System.out.println("i8 = " + i8); // 10
        System.out.println("i9 = " + i9); // 5
        System.out.println("i10 = " + i10); // 1
        System.out.println("i11 = " + i11); // 5
        System.out.println("i12 = " + i12); // 3
        System.out.println("Hello " + "World" + "!"); // Concaténation de chaînes de caractères

        System.out.println();

        // ============ Opérateurs d'Affectation

        // =
        // +=
        // -=
        // *=
        // /=
        // %=

        System.out.println("===== Opérateurs d'Affectation =====");

        int i13 = 10;
        i13 += 2; // Equivalent à i13 = i13 + 2;
        System.out.println(i13); // 12

        System.out.println();

        // ============ Opérateurs Relationnels

        // ==
        // !=
        // >
        // <
        // >=
        // <=

        System.out.println("===== Opérateurs Relationnels =====");

        int i14 = 10;
        int i15 = 20;

        System.out.println(i14 == i15); // false
        System.out.println(i14 != i15); // true
        System.out.println(i14 > i15); // false
        System.out.println(i14 < i15); // true
        System.out.println(i14 >= i15); // false
        System.out.println(i14 <= i15); // true

        System.out.println();

        // ============ Opérateurs Logiques

        // &
        // &&
        // |
        // ||
        // !
        // ^

        System.out.println("===== Opérateurs Logiques =====");

        // System.out.println(false & (5 / 0 == 0) ); // Runtime Exception
        System.out.println(false && (5 / 0 == 0) ); // false (évaluation paresseuse)
        // System.out.println(true | (5 / 0 == 0) ); // Runtime Exception
        System.out.println(true || (5 / 0 == 0) ); // true (évaluation paresseuse)
        System.out.println("!true = " + !true); // false (négation)
        System.out.println(true ^ true); // false (OU exclusif)
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true

        System.out.println();

        // ============ Opérateurs Bit à Bit

        // &
        // |
        // ^
        // ~
        // >>
        // >>>
        // <<

        System.out.println("===== Opérateurs Bit à Bit =====");

        System.out.println("4 & 5 = " + (4 & 5)); // 4
        /*
         *         1 0 0
         *         & & &
         *         1 0 1
         *         -----
         *         1 0 0 = 4
         */

        System.out.println("4 | 5 = " + (4 | 5)); // 5
        /*
         *         1 0 0
         *         | | |
         *         1 0 1
         *         -----
         *         1 0 1 = 5
         */

        System.out.println("4 ^ 5 = " + (4 ^ 5)); // 1
        /*
         *         1 0 0
         *         ^ ^ ^
         *         1 0 1
         *         -----
         *         0 0 1 = 1
         */

        System.out.println("~1 = " + ~1);
        System.out.println(Integer.toBinaryString(1)); // 00000001
        System.out.println(Integer.toBinaryString(-2)); // 11111110
        System.out.println((byte) 0b11111110); // -2
        System.out.println((byte) 0b10000000); // -128 = -(2 ^ 7)
        System.out.println((byte) 0b11000000); // -64 = -(2 ^ 7) + (2 ^ 6)

        System.out.println("5 = " + 0b101);
        System.out.println("5 >> 1 = " + (0b101 >> 1));
        System.out.println("5 in binary format = " + Integer.toBinaryString(5)); 101
        System.out.println("2 in binary format = " + Integer.toBinaryString(2)); // 10

        System.out.println("5 = " + 0b101); // 000000101
        System.out.println("5 >>> 1 = " + (0b101 >>> 1)); // 000000010

        int negativeByteValue = 0b11111111111111111111111110000000;
        System.out.println("-128 = " + negativeByteValue); // 11111111111111111111111110000000
        System.out.println("-128 >>> 1 = " + (negativeByteValue >>> 1)); // 011111111111111111111111110000
        System.out.println("5 = " + 0b101); // Affiche 5 en représentation décimale et binaire (101 en binaire)
        System.out.println("5 << 1 = " + (0b101 << 1)); // Décale les bits de 5 d'une position vers la gauche (équivalent à une multiplication par 2)
        System.out.println("5 in binary format = " + Integer.toBinaryString(5)); // Convertit 5 en chaîne binaire
        System.out.println("10 in binary format = " + Integer.toBinaryString(10)); // Convertit 10 en chaîne binaire

        System.out.println("10 * 2 = 10 << 1 = " + (10 << 1)); // Démonstration de l'équivalence entre multiplication par 2 et décalage à gauche
        System.out.println("10 / 2 = 10 >> 1 = " + (10 >> 1)); // Démonstration de l'équivalence entre division par 2 et décalage à droite

        System.out.println();

        // ============ Opérateur Ternaire

        // (condition) ? expression_si_vrai : expression_si_faux

        System.out.println("===== Opérateur Ternaire =====");

        System.out.println(2 > 1 ? "2 est plus grand que 1" : "2 n'est pas plus petit que 1"); // Condition vraie, affiche le premier résultat
        System.out.println(2 < 1 ? "2 est plus grand que 1" : "2 n'est pas plus petit que 1"); // Condition fausse, affiche le deuxième résultat

        // ============ Ordre de priorité des opérateurs

        // ()
        // []
        // .

        // ++
        // --

        // +
        // -
        // !
        // ~
        // ( type )

        // *
        // /
        // %

        // +
        // -

        // <<
        // >>
        // >>>

        // <
        // <=
        // >
        // >=
        // instanceof

        // ==
        // !=

        // &

        // ^

        // |

        // &&

        // ||

        // ? :

        // =
        // +=
        // -=
        // *=
        // /=
        // %=
        
	}

}
