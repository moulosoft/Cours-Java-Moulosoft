Sure, here’s the code with comments in plain English:

```java
package com.itbulls.learnit.javacore.oop.dry;

// This is the DryPrincipleProblem class
public class DryPrincipleProblem {

    // Method to check if an email is valid
    public boolean validateEmail(String email) {
        // Check if the email is null or empty
        if (email == null || email.isEmpty()) {
            return false; // If it's null or empty, return false
        }
        // Regular expression to match a valid email format
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // Check if the email matches the regular expression
        return email.matches(emailRegex);
    }

    // Method to check if a phone number is valid
    public boolean validatePhoneNumber(String phoneNumber) {
        // Check if the phone number is null or empty
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false; // If it's null or empty, return false
        }
        // Regular expression to match a valid phone number format
        String phoneRegex = "^\\+?[0-9. ()-]{7,25}$";
        // Check if the phone number matches the regular expression
        return phoneNumber.matches(phoneRegex);
    }

    // Method to check if a username is valid
    public boolean validateUsername(String username) {
        // Check if the username is null or empty
        if (username == null || username.isEmpty()) {
            return false; // If it's null or empty, return false
        }
        // Regular expression to match a valid username format
        String usernameRegex = "^[a-zA-Z0-9._-]{3,}$";
        // Check if the username matches the regular expression
        return username.matches(usernameRegex);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of DryPrincipleProblem
        var validator = new DryPrincipleProblem();

        // Print the result of email validation
        System.out.println("Email validation: " + validator.validateEmail("user@example.com"));
        // Print the result of phone number validation
        System.out.println("Phone validation: " + validator.validatePhoneNumber("+1234567890"));
        // Print the result of username validation
        System.out.println("Username validation: " + validator.validateUsername("user_123"));
    }
}
