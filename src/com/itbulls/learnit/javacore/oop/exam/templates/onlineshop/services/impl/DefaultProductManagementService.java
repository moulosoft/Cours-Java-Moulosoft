// Indique le package auquel appartient ce code (structure de projet)
package com.itbulls.learnit.javacore.oop.exam.templates.onlineshop.services.impl;

// Importe la classe Product de l'entité onlineshop (représente un produit)
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.Product;

// Importe la classe DefaultProduct de l'entité onlineshop.impl (implémentation de Product)
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.impl.DefaultProduct;

// Importe l'interface ProductManagementService (définit les méthodes de gestion de produit)
import com.itbulls.learnit.javacore.oop.exam.onlineshop.services.ProductManagementService;

// Déclaration d'une classe publique DefaultProductManagementService implémentant l'interface ProductManagementService
public class DefaultProductManagementService implements ProductManagementService {

	// Variable statique privée pour l'instance unique (Singleton pattern)
	private static DefaultProductManagementService instance;
	
	// Tableau statique privé pour stocker les produits
	private static Product[] products;
	
	// Bloc d'initialisation statique pour initialiser les produits avant la création de la première instance
	static {
		initProducts();
	}

	// Méthode privée statique pour initialiser le tableau de produits avec des exemples
	private static void initProducts() {
		products = new Product[] {
				// Crée des instances de DefaultProduct avec des informations sur les produits
				new DefaultProduct(1, "Hardwood Oak Suffolk Internal Door", "Doors", 109.99),
				// ... (autres produits)
		};
	}
	
	// Constructeur privé pour empêcher l'instanciation directe (Singleton pattern)
	private DefaultProductManagementService() {
		
	}

	// Méthode statique publique pour obtenir une instance unique (Singleton pattern)
	public static ProductManagementService getInstance() {
		if (instance == null) {
			instance = new DefaultProductManagementService();
		}
		return instance;
	}

	// Redéfinition de la méthode getProducts() de l'interface (retourne le tableau de produits)
	@Override
	public Product[] getProducts() {
		return products;
	}

	// Redéfinition de la méthode getProductById() de l'interface (à implémenter pour rechercher un produit par ID)
	@Override
	public Product getProductById(int productIdToAddToCart) {
		// <write your code here> (implémentez la recherche par ID)
		return null;
	}
}
