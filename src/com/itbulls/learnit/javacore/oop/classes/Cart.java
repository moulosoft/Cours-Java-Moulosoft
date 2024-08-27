// explication du code  video youtube  https://youtu.be/Yub_bsPM6ic 

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

	/*
Décomposition du concept :

private: Cela signifie que cette variable ou méthode est accessible uniquement depuis la classe dans 
laquelle elle est déclarée. Elle n'est pas visible depuis d'autres classes.

static: Indique que cette variable appartient à la classe elle-même et non à une instance
particulière de cette classe. Toutes les instances de la classe partagent la même valeur pour cette variable.
sans le static on a besoin de creer un constructeur pour utiliser la variable.

final: Signifie que la valeur de cette variable ne peut pas être modifiée après son initialisation. C'est une constante.

	*/
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

			/*
products.length: Donne la taille actuelle du tableau products.
indexToAddNewProduct: Indique l'indice où le nouveau produit doit être ajouté.
indexToAddNewProduct + 1: Représente l'indice qui serait occupé par le nouveau produit si on l'ajoutait.
Condition: Si l'indice où l'on veut ajouter le nouveau produit est supérieur ou égal à la taille
actuelle du tableau, cela signifie qu'il n'y a plus de place.
Arrays.copyOf: Cette méthode de la classe Arrays permet de créer une copie d'un tableau existant.
products: Le tableau d'origine à copier.
products.length << 1: Calcule la nouvelle taille du tableau. L'opérateur << 1 est un décalage à gauche d'un
bit, ce qui équivaut à multiplier par 2. En d'autres termes, on double la taille du tableau.
			*/
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
/*
BigDecimal.valueOf(...):

Cette méthode de la classe BigDecimal crée un objet BigDecimal à partir d'une valeur numérique. Ici, la valeur numérique provient du résultat du stream.
Arrays.stream(this.products):

Arrays.stream(): Cette méthode crée un flux séquentiel de valeurs à partir d'un tableau.
this.products: C'est un tableau de produits, probablement une propriété de la classe où se trouve cette méthode.
.mapToDouble(product -> product != null ? product.getPrice().doubleValue() : 0):

.mapToDouble(): Cette méthode transforme chaque élément du flux en un double.
product != null ? product.getPrice().doubleValue() : 0: C'est une expression ternaire qui :
Si product n'est pas nul, elle récupère le prix du produit (sous forme de double) en appelant product.getPrice().doubleValue().
Si product est nul, elle retourne 0.
.sum():

Cette méthode somme tous les double obtenus après la transformation.
.setScale(MONEY_SCALE, RoundingMode.HALF_UP):

.setScale(): Cette méthode permet de définir le nombre de décimales et le mode d'arrondi.
MONEY_SCALE: Une constante (probablement définie ailleurs) qui spécifie le nombre de décimales souhaité.
RoundingMode.HALF_UP: Indique que l'arrondi doit se faire à l'unité supérieure si la partie fractionnaire est supérieure ou égale à 0.5.
*/
	// Méthode privée pour calculer le prix total avec taxes
	private BigDecimal calculateTotalGrossPrice() {
  // Vérifie si le prix net total est négatif
  if (this.totalNetPrice.doubleValue() < 0) {
    // Si oui, recalcule le prix net total avant de continuer
    calculateTotalNetPrice();
  }

  // Calcule la remise sur la commande
  BigDecimal orderDiscount = this.totalNetPrice
      // Multiplie le prix net total par le taux de remise
      .multiply(BigDecimal.valueOf(discount.getDiscountRate()))
      // Arrondi à l'unité supérieure avec MONEY_SCALE décimales
      .setScale(MONEY_SCALE, RoundingMode.HALF_UP);

  // Calcule le montant total de la taxe
  this.totalTax = this.totalNetPrice
      // Multiplie le prix net total par le taux de taxe
      .multiply(BigDecimal.valueOf(tax.getTaxRate()))
      // Arrondi à l'unité supérieure avec MONEY_SCALE décimales
      .setScale(MONEY_SCALE, RoundingMode.HALF_UP);

  // Calcule le prix brut total (prix net + taxe - remise)
  this.totalGrossPrice = this.totalNetPrice.add(this.totalTax).subtract(orderDiscount);

  // Retourne le prix brut total
  return this.totalGrossPrice;
}

public int getId() {
  // Renvoie l'identifiant du panier
  return id;
}

public void setId(int id) {
  // Vérifie si l'identifiant est positif
  if (id < 0) {
    return;
  }
  // Définit l'identifiant du panier
  this.id = id;
}

public int getUserId() {
  // Renvoie l'identifiant de l'utilisateur associé au panier
  return userId;
}

public void setUserId(int userId) {
  // Définit l'identifiant de l'utilisateur associé au panier
  this.userId = userId;
}

public Product[] getProducts() {
  // Renvoie une copie du tableau des produits du panier
  // (pour éviter de modifier directement le tableau interne)
  return Arrays.copyOf(products, products.length);
}

public int getIndexOfLastProductAdded() {
  // Renvoie l'index du dernier produit ajouté au panier
  return indexToAddNewProduct;
}

public static int getCartCounter() {
  // Renvoie le nombre total de paniers créés (méthode statique)
  return cartCounter;
}

public BigDecimal getTotalNetPrice() {
  // Renvoie le prix net total du panier (sans taxes ni remises)
  return totalNetPrice;
}

public BigDecimal getTotalGrossPrice() {
  // Renvoie le prix brut total du panier (avec taxes et remise appliquée)
  return totalGrossPrice;
}

public BigDecimal getTotalTax() {
  // Renvoie le montant total des taxes du panier
  return totalTax;
}

public Discount getDiscount() {
  // Renvoie l'objet Discount associé au panier (s'il y en a un)
  return discount;
}

public void setDiscount(Discount discount) {
  // Définit l'objet Discount associé au panier
  this.discount = discount;
}

public void setTax(Tax tax) {
  // Définit l'objet Tax associé au panier
  this.tax = tax;
}

@Override
public String toString() {
  // Renvoie une représentation textuelle du panier
  // (utile pour le débogage ou l'affichage)
  return "Cart [id=" + id + ", userId=" + userId + ", totalNetPrice="
          + totalNetPrice + ", totalGrossPrice=" + totalGrossPrice + ", totalTax="
          + totalTax + ", products=" + Arrays.toString(products)
          + ", indexOfLastProductAdded=" + indexToAddNewProduct + "]";
}

public class Discount {
  // Classe interne représentant une remise
  private String discountName;
  private double discountRate;

  public Discount(String discountName, double discountRate) {
    this.discountName = discountName;
    this.discountRate = discountRate;
  }

  public String getDiscountName() {
    return discountName;
  }

  public void setDiscountName(String discountName) {
    this.discountName = discountName;
  }

  public double getDiscountRate() {
    return discountRate;
  }

  public void setDiscountRate(double discountRate) {
    this.discountRate = discountRate;
  }
}

public static class Tax {
  // Classe interne représentant une taxe
  private String taxType;
  private double taxRate;

  public Tax(String taxType, double taxRate) {
    this.taxType = taxType;
    this.taxRate = taxRate;
  }

  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  public double getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(double taxRate) {
    this.taxRate = taxRate;
  }
}
}
