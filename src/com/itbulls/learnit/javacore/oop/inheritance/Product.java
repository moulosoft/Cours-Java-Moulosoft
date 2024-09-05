package com.itbulls.learnit.javacore.oop.inheritance;
// This declares the package where this class is located.
// Packages help organize related classes into groups.

public class Product {
// This defines the `Product` class, which represents a product with an ID and name.
// It is a base class (or parent class) that other classes like `Phone` might extend.

	private int id;
	// This declares a private variable `id` to store the product's ID.
	// The `private` keyword means that only this class can access it directly.
	
	private String name;
	// This declares a private variable `name` to store the product's name.
	// Again, it is only accessible within this class.

	public Product(String name) {
		// This is a constructor for the `Product` class.
		// It is called when an object of this class is created.
		// The constructor takes a `String` parameter `name` and assigns it to the `name` variable.
		this.name = name;
	}

	public int calculateRemainingAmount() {
		// This is a method that returns the remaining amount of the product.
		// For simplicity, it's a stub that always returns 100.
		// In a real-world case, this might be calculated based on stock data.
		return 100;
	}

	public String getName() {
		// This is a getter method for the `name` variable.
		// It returns the value of the `name` property of the product.
		return this.name;
	}
	
	public void setName(String name) {
		// This is a setter method that allows changing the `name` of the product.
		// It takes a `String` parameter and assigns it to the `name` variable.
		this.name = name;
	}
	
	public Product[] listVariants() {
		// This method returns an array of `Product` objects, representing different variants of this product.
		// In a real-world application, this could fetch data from a database or some other source.
		// Here, it returns a fake array with 3 empty `Product` objects as a placeholder.
		return new Product[3];
	}
}
