package ugur;

public class Task9_passwordValidation {

    public static void main(String[] args) {
        /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */
        String password = "Asdf4.";
        System.out.println("password is valid = " + passwordValidation(password));
    }

    //    public static boolean passwordValidation(String password) {
//        if (password.contains(" ")) {
//            return false;
//        } else if (password.length() < 6) {
//            return false;
//        } else if (!password.matches("(.*[a-z].*)")) {
//            return false;
//        } else if (!password.matches("(.*[A-Z].*)")) {
//            return false;
//        } else if (!password.matches("(.*[0-9].*)")) {
//            return false;
//        } else if (!password.matches("(.*[ -/, :-@].*)")) {
//            return false;
//        } else
//            return true;
//
//    }
    public static boolean passwordValidation(String password) {
        boolean hasLowerCaseChar = password.matches("(.*[a-z].*)");
        boolean hasUpperCaseChar = password.matches("(.*[A-Z].*)");
        boolean hasSpecialChar = password.matches("(.*[ -/, :-@].*)");
        boolean hasDigit = password.matches("(.*[0-9].*)");

        if (!password.contains(" ") && password.length() >= 6) {
            if (hasLowerCaseChar && hasUpperCaseChar && hasDigit && hasSpecialChar) {
                return true;
            }
        }
        return false;
    }

}
