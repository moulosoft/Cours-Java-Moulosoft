package com.itbulls.learnit.javacore.oop.kiss;
// This declares the package where the class is located.
// The package helps organize your code into folders.

import java.util.Scanner;
// This imports the `Scanner` class, which is used to get input from the user.

public class KissPrincipleSolution {
// This defines a public class called `KissPrincipleSolution`.
// The "KISS" principle stands for "Keep It Simple, Stupid", meaning the goal is to make the code simple and easy to understand.

	public static void main(String[] args) {
		// The `main` method is the starting point of the program, where it begins execution.

		Scanner scanner = new Scanner(System.in);
		// Creates a `Scanner` object to take input from the user (keyboard input).

		System.out.print("Enter a number: ");
		// Prints a message asking the user to enter a number.

		int number = scanner.nextInt();
		// Reads the user input and stores the integer value in the `number` variable.

		scanner.close();
		// Closes the `Scanner` object to prevent resource leaks.

		if (number < 0) {
			// Checks if the input number is negative.

			System.out.println("Factorial is not defined for negative numbers.");
			// If the number is negative, it prints a message saying that factorials are not defined for negative numbers.
		} else {
			// If the number is zero or positive, it moves forward to calculate the factorial.

			long result = calculateFactorial(number);
			// Calls the `calculateFactorial` method with the input number and stores the result in the `result` variable.

			System.out.println("The factorial of " + number + " is " + result);
			// Prints the factorial of the input number.
		}
	}

	private static long calculateFactorial(int n) {
		// This method calculates the factorial of the input number `n`.

		long factorial = 1;
		// Initializes the `factorial` variable to 1, as multiplying by 1 doesn't change the result.

		for (int i = 1; i <= n; i++) {
			// A loop that starts at 1 and runs until it reaches `n`.

			factorial *= i;
			// Multiplies the current value of `factorial` by `i` in each iteration of the loop.
			// This builds up the factorial value step by step.
		}

		return factorial;
		// After the loop ends, the method returns the calculated factorial.
	}
}
