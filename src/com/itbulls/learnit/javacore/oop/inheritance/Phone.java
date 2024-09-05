package com.itbulls.learnit.javacore.oop.inheritance;
// This declares the package for this class, which organizes the code into a related group of classes.

public class Phone extends Product {
// This defines a class `Phone` that extends (inherits from) the `Product` class.
// This means that `Phone` inherits properties and methods from `Product` and can add its own features or override inherited ones.

	// Default constructor
	public Phone() {
		// This is the constructor for the `Phone` class.
		// It is called when a `Phone` object is created. It has no parameters, meaning it uses default values.

		super("Nokia");
		// `super("Nokia")` calls the constructor of the parent class (`Product`) and passes the string "Nokia" to it.
		// This is how the `Phone` constructor uses the `Product` class's constructor, typically to set the name of the product.

		System.out.println("Some code");
		// This prints "Some code" to the console when a `Phone` object is created.
	}

	public void ring() {
		// This is a method named `ring()`, specific to the `Phone` class.
		// It defines what happens when a phone rings.
		System.out.println("Ring!");
		// When this method is called, it prints "Ring!" to the console.
	}
	
	@Override
	// The `@Override` annotation indicates that this method is overriding a method from the parent class (`Product`).

	public Product[] listVariants() {
		// This method is supposed to list different variants of the `Phone` (like different models).
		// It returns an array of `Product` objects.

		throw new UnsupportedOperationException();
		// However, this implementation does not actually return anything useful.
		// Instead, it throws an exception `UnsupportedOperationException`, which means this operation is not supported or not implemented yet.
	}
	
	public int calculateAmountOfVariants() {
		// This method calculates the number of phone variants.

		return super.listVariants().length;
		// `super.listVariants()` calls the `listVariants()` method from the parent class (`Product`), which should return an array of products (variants).
		// `.length` is used to get the length of that array, which tells us how many variants there are.
		// This method returns the number of variants.
	}

}
