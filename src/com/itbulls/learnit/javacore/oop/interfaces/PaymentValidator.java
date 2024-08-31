package com.itbulls.learnit.javacore.oop.interfaces;

/**
 * Interface définissant les méthodes nécessaires pour valider un paiement.
 */
public interface PaymentValidator {

    /**
     * Code pour valider un paiement donné.
     *
     * @param payment Les données du paiement à valider.
     * @return true si le paiement est valide, false sinon.
     */
    boolean validatePayment(PaymentData payment);

    // Méthode par défaut (optionnelle)
//    default void someDefaultMethod() {
//        System.out.println("This is another default method");
//    }
}
