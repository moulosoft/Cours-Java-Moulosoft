package com.itbulls.learnit.javacore.oop.inheritance;
// This declares the package where the class is located. Packages help organize related classes together.

public class Demo {
// This defines a public class called `Demo`. It's the class where the code will be executed.

	public static void main(String[] args) {
		// The `main` method is the starting point of the program, where the execution begins.

		Product product = new Phone();
		// This creates a new object `product` of type `Product`, but it refers to an instance of the `Phone` class.
		// This works because `Phone` inherits from `Product`, meaning a `Phone` is a specialized type of `Product`.

		product.setName("Nokia 1100");
		// Calls the `setName` method from the `Product` class to set the name of the product to "Nokia 1100".

		System.out.println("Product name: " + product.getName());
		// Calls the `getName` method from the `Product` class to get the product's name and prints it.

		System.out.println("Remaining amount in stock: " + product.calculateRemainingAmount());
		// Calls the `calculateRemainingAmount` method, which is presumably defined in the `Product` class (or overridden in `Phone`), 
		// and prints the remaining stock amount for the product.

		// product.ring();
		// This line is commented out. It attempts to call a method `ring()` on the `Product` type.
		// However, `ring()` likely exists only in the `Phone` class, so this wouldn't work unless cast to `Phone`.

		Phone phone2 = new Phone();
		// Creates a new `Phone` object directly and assigns it to `phone2`.

		phone2.ring();
		// Calls the `ring()` method on `phone2`, which is a method defined in the `Phone` class.
		// This would cause the phone to "ring" (in terms of functionality).

		if (product instanceof Phone) {
			// This checks if the `product` variable is actually an instance of the `Phone` class.
			// This is called "type checking" to ensure it's safe to treat `product` as a `Phone`.

			Phone phone3 = (Phone) product;
			// This "casts" the `product` variable to the `Phone` type, which means it converts `product` into a `Phone` object.
			// This works because `product` was originally created as a `Phone` object.

			phone3.ring();
			// Calls the `ring()` method on the `phone3` object, which is now treated as a `Phone`.
		}

		System.out.println(phone2.calculateAmountOfVariants());
		// Calls the `calculateAmountOfVariants()` method on `phone2`, which presumably returns the number of phone variants (defined in the `Phone` class).
	}
}
