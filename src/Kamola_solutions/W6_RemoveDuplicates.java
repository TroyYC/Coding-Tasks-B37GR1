package Kamola_solutions;

import java.util.ArrayList;
import java.util.List;

public class W6_RemoveDuplicates {
    public static void main(String[] args) {
        String input = "a a a b b b c c c";

        System.out.println("Option 1: Using a Loop");
        System.out.println(removeDuplicatesUsingLoop(input));

        System.out.println("Option 2: Using StringBuilder and Array");
        System.out.println(removeDuplicatesUsingStringBuilder(input));

        System.out.println("Option 3: Using ArrayList");
        System.out.println(removeDuplicatesUsingCollections(input));
    }

    // Opt1-Loop
    public static String removeDuplicatesUsingLoop(String input) {
        String[] letters = input.split(" "); // Split the string by spaces
        String result = ""; // Initialize an empty result string

        for (int i = 0; i < letters.length; i++) {
            // Add the letter only if it's not the same as the previous one
            if (i == 0 || !letters[i].equals(letters[i - 1])) {
                result += letters[i] + " "; // Append the unique letter with a space
            }
        }
        return result.trim();
    }

    // Opt2- StrBuilder and Array
    public static String removeDuplicatesUsingStringBuilder(String input) {
        String[] letters = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < letters.length; i++) {
            // Add the letter only if it's not the same as the previous one
            if (i == 0 || !letters[i].equals(letters[i - 1])) {
                result.append(letters[i]).append(" "); // Append the unique letter with a space
            }
        }
        return result.toString().trim();
    }

    // Opt3 - ArrayList
    public static String removeDuplicatesUsingCollections(String input) {
        String[] letters = input.split(" "); // Split the string by spaces
        List<String> resultList = new ArrayList<>();

        for (String letter : letters) {
            // Add the letter only if it's not already in the list
            if (resultList.isEmpty() || !resultList.get(resultList.size() - 1).equals(letter)) {
                resultList.add(letter);
            }
        }

        return String.join(" ", resultList);
    }

}
