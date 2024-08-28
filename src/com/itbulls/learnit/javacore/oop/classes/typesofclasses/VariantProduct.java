package com.itbulls.learnit.javacore.oop.classes.typesofclasses;

// Indique le package auquel appartient la classe

public class VariantProduct extends Product {
	
	// Attribut privé de la classe VariantProduct
	private MasterProduct[] variants; // Tableau d'objets de type MasterProduct

	@Override
	public boolean isAvailableInStock() {
		// Parcourt le tableau de variantes
		for (MasterProduct masterProduct : variants) {
/*
Débute une boucle for qui parcourt chaque élément du tableau variants.
À chaque itération, la variable masterProduct contient une référence à l'élément courant du tableau.
*/
			// Vérifie si au moins une variante est disponible en stock
			if (masterProduct.isAvailableInStock()) {
				return true;
			}
		}
		// Si aucune variante n'est disponible, retourne false
		return false;
	}

}
