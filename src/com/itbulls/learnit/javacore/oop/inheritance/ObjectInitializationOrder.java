package com.itbulls.learnit.javacore.oop.inheritance;
// This declares the package where the class is located.
// Packages help organize your code into groups of related classes.

public class ObjectInitializationOrder {
// This defines a public class called `ObjectInitializationOrder`.

	public static void main(String[] args) {
		// The `main` method is the entry point where the program starts running.

		Parent p = new Child();
		// This creates a new object of type `Child`, but it's assigned to a `Parent` reference `p`.
		// This demonstrates polymorphism, where an object of a subclass (Child) is referred to by its superclass (Parent).
		// The key point here is that when the `Child` object is created, both `Parent` and `Child` constructors will run, along with their initialization blocks.
		
		System.out.println("=====================");
		// Prints a line of "=========" to separate the outputs for clarity.

		p = new Child();
		// This creates another `Child` object, again assigned to `p`.
		// The static initialization blocks don't run again since they only execute once when the class is loaded into memory.
	}

}

class Parent {
// This defines a class `Parent`.

	static {
		// This is a static initialization block for the `Parent` class.
		// It runs only once, when the class is first loaded by the Java Virtual Machine (JVM).
		System.out.println("Static init block parent");
	}

	{
		// This is an instance initialization block for the `Parent` class.
		// It runs every time an object of the `Parent` class (or its subclass) is created, before the constructor.
		System.out.println("Init block parent");
	}

	public Parent() {
		// This is the constructor of the `Parent` class.
		// It runs after the instance initialization block whenever a `Parent` or `Child` object is created.
		System.out.println("Parent constructor");
	}
}

class Child extends Parent {
// This defines a class `Child` that extends (inherits from) `Parent`.
// This means the `Child` class can use the properties and methods of the `Parent` class.

	static {
		// This is a static initialization block for the `Child` class.
		// It runs only once when the `Child` class is loaded by the JVM, after the `Parent` static block.
		System.out.println("Static init block child");
	}

	{
		// This is an instance initialization block for the `Child` class.
		// It runs every time a `Child` object is created, after the `Parent` instance block and before the `Child` constructor.
		System.out.println("Init block child");
	}

	public Child() {
		// This is the constructor of the `Child` class.
		// It runs after the instance initialization blocks of both `Parent` and `Child` classes.
		System.out.println("child constructor");
	}
}
