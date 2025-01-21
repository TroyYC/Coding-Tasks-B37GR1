package Kamola_solutions;
import java.util.ArrayList;
import java.util.List;

public class W6_RemoveDuplicates {
    public static void main(String[] args) {
        String input = "a a a b b b c c c";

        System.out.println("Option 1: Using a Loop");
        System.out.println(removeDuplicatesLoop(input));

        System.out.println("Option 2: Using StringBuilder and Array");
        System.out.println(removeDuplicatesStrBuilder(input));

        System.out.println("Option 3: Using ArrayList");
        System.out.println(removeDuplicatesCollection(input));
    }

    // Opt1-Loop
    public static String removeDuplicatesLoop(String input) {
        String[] letters = input.split(" ");
        String result = "";
        for (int i = 0; i < letters.length; i++) {
            if (i == 0 || !letters[i].equals(letters[i - 1])) {
                result += letters[i] + " ";
            }
        }
        return result.trim();
    }

    // Opt2- StrBuilder and Array
    public static String removeDuplicatesStrBuilder(String input) {
        String[] letters = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < letters.length; i++) {

            if (i == 0 || !letters[i].equals(letters[i - 1])) {
                result.append(letters[i]).append(" ");
            }
        }
        return result.toString().trim();
    }

    // Opt3 - ArrayList
    public static String removeDuplicatesCollection(String input) {
        String[] letters = input.split(" ");
        List<String> resultList = new ArrayList<>();

        for (String letter : letters) {
            if (resultList.isEmpty() || !resultList.get(resultList.size() - 1).equals(letter)) {
                resultList.add(letter);
            }
        }
        return String.join(" ", resultList);
    }
}
