package com.itbulls.learnit.javacore.oop.kiss;
// This declares the package where the class is located.
// The package helps to organize code into folders and group related classes.

import java.util.Scanner;
// This imports the `Scanner` class, which allows the program to take input from the user.

public class KissPrincipleProblem {
// This defines a public class named `KissPrincipleProblem`.
// "KISS" stands for "Keep It Simple, Stupid," a principle that encourages simplicity in programming.

	public static void main(String[] args) {
		// This is the main method, the entry point of the program where execution begins.

		Scanner scanner = new Scanner(System.in);
		// Creates a `Scanner` object that reads input from the keyboard.

		System.out.print("Enter a number: ");
		// Prompts the user to enter a number.

		int number = scanner.nextInt();
		// Reads the user's input as an integer and stores it in the variable `number`.

		scanner.close();
		// Closes the scanner after use to avoid resource leaks.

		if (number < 0) {
			// Checks if the user entered a negative number.

			System.out.println("Factorial is not defined for negative numbers.");
			// If the number is negative, it prints a message saying factorials are not defined for negative numbers.
		} else {
			// If the number is zero or positive, it proceeds to calculate the factorial.

			long result = calculateFactorial(number);
			// Calls the `calculateFactorial` method and stores the result in the `result` variable.

			System.out.println("The factorial of " + number + " is " + result);
			// Prints the calculated factorial along with the number entered by the user.
		}
	}

	private static long calculateFactorial(int n) {
		// This method calculates the factorial of the given number `n`.

		if (n == 0) {
			// If the number is 0, we know that the factorial of 0 is defined as 1.
			return 1;
		}

		// Complex loop with redundant checks
		long factorial = 1;
		// Initializes a variable `factorial` to store the result. It starts at 1 because multiplying by 1 doesn't change the result.

		for (int i = 1; i <= n; i++) {
			// A loop that starts from 1 and runs until `i` equals the number `n`.

			if (i % 2 == 0) {
				// This condition checks if `i` is an even number, but the logic inside doesn't matter since the else block does the same thing.
				factorial *= i; // Multiplies the current value of `factorial` by `i`.
			} else {
				// This block is for odd numbers, but it does the exact same thing as the block for even numbers, which makes it redundant.
				factorial *= i; // Multiplies the current value of `factorial` by `i`.
			}
		}

		return factorial;
		// Returns the calculated factorial after the loop ends.
	}
}
