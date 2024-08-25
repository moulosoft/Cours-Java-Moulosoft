package com.itbulls.learnit.javacore.oop.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Cart {

	// Constantes définissant les valeurs par défaut du panier
	private static final int DEFAULT_CART_CAPACITY = 10; // Capacité par défaut du panier
	private static final int MONEY_SCALE = 2; // Nombre de décimales pour les prix
	private static final double DEFAULT_TAX_RATE = 0.15; // Taux de taxe par défaut
	private static final String DEFAULT_TAX_TYPE = "incomeTax"; // Type de taxe par défaut
	private static final double DEAFULT_DISCOUNT_RATE = 0; // Taux de remise par défaut
	private static final String DEFAULT_DISCOUNT_NAME = "zeroDiscount"; // Nom de la remise par défaut

	// Compteur statique pour suivre le nombre de paniers créés
	private static int cartCounter;

	// Propriétés du panier
	private int id; // Identifiant du panier
	private int userId; // Identifiant de l'utilisateur associé au panier
	private BigDecimal totalNetPrice; // Prix total hors taxes
	private BigDecimal totalGrossPrice; // Prix total avec taxes
	private BigDecimal totalTax; // Montant total des taxes
	private Tax tax; // Objet Tax définissant le type et le taux de taxe
	private Product[] products; // Tableau contenant les produits du panier
	private int indexToAddNewProduct; // Indice pour ajouter un nouveau produit dans le tableau products
	private Discount discount; // Objet Discount définissant le nom et le taux de remise

	// Bloc d'initialisation statique exécuté lors du chargement de la classe Cart
	static {
		System.out.println("Cart.class est chargé dans la JVM"); // Message indiquant le chargement de la classe
	}

	// Bloc d'initialisation exécuté lors de la création d'un objet Cart
	{
		cartCounter++; // Incrémente le compteur de paniers
		userId = 1; // Valeur par défaut pour l'identifiant utilisateur (peut être modifiée)
		tax = new Tax(DEFAULT_TAX_TYPE, DEFAULT_TAX_RATE); // Crée un objet Tax avec les valeurs par défaut
		discount = new Discount(DEFAULT_DISCOUNT_NAME, DEAFULT_DISCOUNT_RATE); // Crée un objet Discount 
		//avec les valeurs par défaut
	}

	// Constructeur par défaut (sans arguments)
	public Cart() {
	}

	// Constructeur avec arguments (id et userId)
	public Cart(int id, int userId) {
		this.id = id;
		this.userId = userId;
	}

	// Méthode pour ajouter un produit au panier
	public void addProduct(Product product) {
		if (product == null) { // Vérifie si le produit est null
			return;
		}
		if (products == null) { // Initialise le tableau products si vide
			products = new Product[DEFAULT_CART_CAPACITY];
		}
		if (products.length < indexToAddNewProduct + 1) { // Augmente la taille du tableau si nécessaire
			products = Arrays.copyOf(products, products.length << 1);
		}
		products[indexToAddNewProduct++] = product; // Ajoute le produit au tableau et incrémente l'indice
		calculateTotalNetPrice(); // Recalcule le prix total hors taxes
		calculateTotalGrossPrice(); // Recalcule le prix total avec taxes
	}

	// Méthode privée pour calculer le prix total hors taxes
	private BigDecimal calculateTotalNetPrice() {
		this.totalNetPrice = BigDecimal.valueOf(Arrays.stream(this.products) // Convertit les prix des produits
         		//en double et les somme
				.mapToDouble(product -> product != null ? product.getPrice().doubleValue() : 0)
				.sum()).setScale(MONEY_SCALE, RoundingMode.HALF_UP); // Arrondi à l'unité supérieure 
		//avec MONEY_SCALE décimales
		return this.totalNetPrice;
	}

	// Méthode privée pour calculer le prix total avec taxes
	private BigDecimal calculateTotalGrossPrice() {
		if (this.totalNetPrice.doubleValue() < 0) { // Vérifie si le prix total est négatif (ne devrait pas arriver)
			calculateTotalNetPrice(); // Recalcule le prix total si nécessaire
		}
		BigDecimal orderDiscount = this
