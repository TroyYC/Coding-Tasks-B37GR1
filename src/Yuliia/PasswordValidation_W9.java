package Yuliia;

/*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */

//Yuliia is volunteer

public class PasswordValidation_W9 {

    public static boolean isValidPassword(String password) {
        // Requirement 1: Password must be at least 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Flags to track the requirements
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Iterating through each character in the password
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true; // Check for uppercase letter
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true; // Check for lowercase letter
            } else if (Character.isDigit(ch)) {
                hasDigit = true; // Check for digit
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true; // Check for special character
            }

            // Optimization: Exit early if all requirements are met
//            if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
//                return true;
//            }
        }

        // Return true only if all flags are true
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        // Test casesP
        System.out.println(isValidPassword("Pass@123")); // true
        System.out.println(isValidPassword("pass123"));  // false (missing uppercase and special char)
        System.out.println(isValidPassword("12345"));    // false (missing other conditions)
        System.out.println(isValidPassword("Pass12"));   // false (missing special character)
        System.out.println(isValidPassword("P@ss1 "));   // false (contains space)
    }
}

