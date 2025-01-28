package mokhinur_solutions;

public class W7_findUnique {

    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */
    public static String findUniqueCharacters(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check if the character appears only once in the string
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                result += currentChar; // Append the unique character to the result string
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String word1 = "AAABBBCCCDEF";
        System.out.println("Unique characters: " + findUniqueCharacters(word1)); // Output: DEF
    }
}
