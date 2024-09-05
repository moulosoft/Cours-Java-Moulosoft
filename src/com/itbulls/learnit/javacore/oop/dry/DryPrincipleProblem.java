package com.itbulls.learnit.javacore.oop.dry;
// This line declares the package where this class is located.
// Packages are like folders that help organize your code.

public class DryPrincipleProblem {
// This defines a public class called `DryPrincipleProblem`.
// A class is a blueprint for creating objects, and here, it's used to validate different types of user inputs.

    // Method to check if an email is valid
    public boolean validateEmail(String email) {
        // This method will check whether an email is valid or not.
        // It returns `true` if the email is valid and `false` otherwise.

        // Check if the email is null or empty
        if (email == null || email.isEmpty()) {
            return false; // If the email is null (doesn't exist) or an empty string, return false.
        }

        // Regular expression to match a valid email format
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // This is a regular expression (regex) that defines the rules for what a valid email looks like.
        // It ensures the email has the correct format like "user@example.com".

        // Check if the email matches the regular expression
        return email.matches(emailRegex);
        // The `matches` method checks if the given email matches the pattern defined by `emailRegex`.
        // It returns `true` if the email is valid, otherwise `false`.
    }

    // Method to check if a phone number is valid
    public boolean validatePhoneNumber(String phoneNumber) {
        // This method will check if a phone number is valid or not.

        // Check if the phone number is null or empty
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false; // If the phone number is null or empty, return false.
        }

        // Regular expression to match a valid phone number format
        String phoneRegex = "^\\+?[0-9. ()-]{7,25}$";
        // This regex defines a valid phone number format.
        // It allows for optional "+" sign, digits, spaces, parentheses, and hyphens, and requires the phone number to be 7 to 25 characters long.

        // Check if the phone number matches the regular expression
        return phoneNumber.matches(phoneRegex);
        // The `matches` method checks if the phone number follows the rules set by `phoneRegex`.
        // It returns `true` if the phone number is valid, otherwise `false`.
    }

    // Method to check if a username is valid
    public boolean validateUsername(String username) {
        // This method will check if a username is valid or not.

        // Check if the username is null or empty
        if (username == null || username.isEmpty()) {
            return false; // If the username is null or empty, return false.
        }

        // Regular expression to match a valid username format
        String usernameRegex = "^[a-zA-Z0-9._-]{3,}$";
        // This regex ensures the username is at least 3 characters long.
        // It allows letters, numbers, periods (.), underscores (_), and hyphens (-).

        // Check if the username matches the regular expression
        return username.matches(usernameRegex);
        // The `matches` method checks if the username follows the pattern defined by `usernameRegex`.
        // It returns `true` if the username is valid, otherwise `false`.
    }

    // Main method to run the program
    public static void main(String[] args) {
        // This is the entry point of the program where the execution begins.

        // Create an instance of DryPrincipleProblem
        var validator = new DryPrincipleProblem();
        // This line creates a new object `validator` of the class `DryPrincipleProblem`.
        // We use this object to call the validation methods.

        // Print the result of email validation
        System.out.println("Email validation: " + validator.validateEmail("user@example.com"));
        // Calls the `validateEmail` method to check if "user@example.com" is valid and prints the result.

        // Print the result of phone number validation
        System.out.println("Phone validation: " + validator.validatePhoneNumber("+1234567890"));
        // Calls the `validatePhoneNumber` method to check if "+1234567890" is valid and prints the result.

        // Print the result of username validation
        System.out.println("Username validation: " + validator.validateUsername("user_123"));
        // Calls the `validateUsername` method to check if "user_123" is valid and prints the result.
    }
}
