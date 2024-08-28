package com.itbulls.learnit.javacore.oop.classes.typesofclasses;

// Indique le package auquel appartient la classe

import java.util.Arrays;

// Importe la classe Arrays du package java.util

import com.itbulls.learnit.javacore.oop.classes.Product;

// Importe la classe Product d'un autre package (probablement défini ailleurs)

public class User {
	
	// Constante publique et finale pour le seuil de remise en USD (dollars américains)
	public static final int DISCOUNT_THRESHOLD_USD = 1000;
	
	// Constante publique et finale pour le pourcentage de remise (5%)
	public static final double FIVE_PERCENT_DISCOUNT = 0.05;
	
	// Attributs privés de la classe User
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private Product[] products; // Tableau d'objets de type Product
	
	public double calculateDiscount() {
		// Calcule le prix total de tous les produits achetés
		double totalPriceAllProductsBought = Arrays.stream(products)
				.map(product -> product.getPrice()) // Récupère le prix de chaque produit
				.mapToDouble(price -> price.doubleValue()) // Convertit le prix en double
				.sum();
		
		// Vérifie si le prix total dépasse le seuil de remise
		if (totalPriceAllProductsBought >= DISCOUNT_THRESHOLD_USD) {
			// Retourne le pourcentage de remise s'il dépasse le seuil
			return FIVE_PERCENT_DISCOUNT;
		} else {
			// Sinon, retourne 0 (pas de remise)
			return 0;
		}
	}
	
	// Méthodes getters et setters pour les attributs de la classe
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
}
