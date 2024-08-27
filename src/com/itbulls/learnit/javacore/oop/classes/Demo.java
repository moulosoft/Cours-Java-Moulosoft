import java.math.BigDecimal;

// Import des classes imbriquées Discount et Tax de la classe Cart
import com.itbulls.learnit.javacore.oop.classes.Cart.Discount;
import com.itbulls.learnit.javacore.oop.classes.Cart.Tax;

public class Demo {

  public static void main(String[] args) {
    
    // Début de la démo du constructeur par défaut
    System.out.println("========== DEMO CONSTRUCTEUR PAR DEFAUT ==========");
    
    // Création d'un panier vide avec le constructeur par défaut
    Cart cart = new Cart();
    // Affichage du panier (probablement la liste des produits et prix)
    System.out.println(cart);
    
    System.out.println();
    
    // Début de la démo du constructeur personnalisé
    System.out.println("========== DEMO CONSTRUCTEUR PERSONNALISÉ ==========");
    
    // Création d'un panier avec des valeurs initiales pour la capacité et la remise
    Cart cart2 = new Cart(2, 2);  // 2 pour l'id et 2 pour le userId
    // Affichage du panier (capacité et remise)
    System.out.println(cart2);
    
    System.out.println();
    
    // Début de la démo de l'ajout de produits au panier
    System.out.println("========== AJOUTER DES PRODUITS AU PANIER ==========");
    
    // Ajout d'un premier produit au panier
    cart.addProduct(new Product("L shaped Showerbath", BigDecimal.valueOf(300)));

/*
cart.addProduct(: On appelle la méthode addProduct de l'objet cart. Cette méthode est  
définie dans la classe Cart et sert à ajouter un produit au panier.
new Product(): On crée une nouvelle instance de la classe Product.
"L shaped Showerbath": On donne un nom au produit.
BigDecimal.valueOf(300): On crée un objet BigDecimal représentant le prix du produit (300). 
Cet objet est utilisé pour représenter des valeurs monétaires avec précision,
évitant les problèmes d'arrondis liés aux types double.
*/
    // Ajout d'un second produit au panier
    cart.addProduct(new Product("P Shaped Right Hand Bath", BigDecimal.valueOf(200)));
/*
Cette ligne fonctionne de manière identique à la première, mais avec un 
produit différent : "P Shaped Right Hand Bath" au prix de 200.

En résumé, ces deux lignes de code réalisent l'opération suivante :

Création de deux produits: On crée deux objets de type Product, chacun avec son nom et son prix.
Ajout des produits au panier: Les deux produits créés sont ajoutés à un panier (représenté par l'objet cart).
*/
    // Affichage du panier (liste des produits et prix totaux)
    System.out.println(cart);
  }
}
