package com.itbulls.learnit.javacore.oop.dry;

// Declares the package where the code resides. This is useful to organize and group similar classes.

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

// Imports required classes and libraries:
// - HashMap and Map are used to store key-value pairs.
// - Predicate is a functional interface that checks if a condition is true for a given input.

public class DryPrincipleSolution {
// This defines a class named `DryPrincipleSolution`.
// "DRY" stands for "Don't Repeat Yourself," a programming principle aimed at reducing repetition of code.

	private static final Map<String, Predicate<String>> VALIDATION_RULES = new HashMap<>();
	// A static map is created where the key is a string (e.g., "email", "phoneNumber"),
	// and the value is a Predicate (a rule that checks if a string matches certain criteria).

	static {
		// A static block is used to initialize the validation rules when the class is loaded.

		VALIDATION_RULES.put("email", input -> {
			// Adds a validation rule for emails.
			// The key is "email" and the value is a lambda expression that checks if the input matches a specific email pattern.

			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
			// This is a regular expression (regex) pattern that defines the format of a valid email.
			// It ensures that the email has characters, an "@" symbol, a domain, and a valid extension.

			return input.matches(emailRegex);
			// The lambda expression returns true if the input matches the email pattern, otherwise false.
		});

		VALIDATION_RULES.put("phoneNumber", input -> {
			// Adds a validation rule for phone numbers.
			// The key is "phoneNumber" and the value is a lambda that checks if the input matches a valid phone number pattern.

			String phoneRegex = "^\\+?[0-9. ()-]{7,25}$";
			// This regex allows for a phone number with optional "+", digits, and common characters like ".", "(", ")", and "-".
			// It ensures the phone number is between 7 and 25 characters long.

			return input.matches(phoneRegex);
			// The lambda returns true if the input matches the phone number pattern.
		});

		VALIDATION_RULES.put("username", input -> {
			// Adds a validation rule for usernames.
			// The key is "username" and the value is a lambda that checks if the input matches a valid username pattern.

			String usernameRegex = "^[a-zA-Z0-9._-]{3,}$";
			// This regex defines a valid username as having at least 3 characters,
			// and allows letters, numbers, ".", "_", and "-".

			return input.matches(usernameRegex);
			// The lambda returns true if the input matches the username pattern.
		});
	}

	public boolean validate(String type, String input) {
		// A method that validates the input based on its type (e.g., "email", "phoneNumber", "username").

		if (input == null || input.isEmpty())
			return false;
		// If the input is null or an empty string, it returns false immediately (input is invalid).

		Predicate<String> validationRule = VALIDATION_RULES.get(type);
		// Retrieves the validation rule (Predicate) from the map using the provided type as the key (e.g., "email").

		if (validationRule != null) {
			// If a validation rule exists for the given type, it proceeds to validate the input.

			return validationRule.test(input);
			// The `test` method checks if the input passes the validation rule and returns true or false.
		}

		throw new IllegalArgumentException("Unknown validation type: " + type);
		// If no validation rule is found for the given type, an exception is thrown with an appropriate message.
	}

	public static void main(String[] args) {
		// The main method where the program execution starts.

		var validator = new DryPrincipleSolution();
		// Creates an instance of the `DryPrincipleSolution` class.

		System.out.println("Email validation: " + validator.validate("email", "user@example.com"));
		// Validates an email and prints whether it's valid or not (true or false).

		System.out.println("Phone validation: " + validator.validate("phoneNumber", "+1234567890"));
		// Validates a phone number and prints the result (true or false).

		System.out.println("Username validation: " + validator.validate("username", "user_123"));
		// Validates a username and prints the result (true or false).
	}
}
