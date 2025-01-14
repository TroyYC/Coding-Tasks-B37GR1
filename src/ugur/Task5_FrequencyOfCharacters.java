package ugur;

public class Task5_FrequencyOfCharacters {

 /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
 public static void main(String[] args) {
     String input = "AAABBCDD";
     String output = frequencyOfChars(input);
     System.out.println(output); // Output: A3B2C1D2
 }

    public static String frequencyOfChars(String str) {
        StringBuilder result = new StringBuilder();

        while (!str.isEmpty()) {
            char currentChar = str.charAt(0); // Get the first character
            int count = 0;

            // Count occurrences of the current character
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == currentChar) {
                    count++;
                }
            }

            // Append the character and its count to the result
            result.append(currentChar).append(count);

            System.out.println("result = " + result);

            // Remove all occurrences of the current character from the string
            str = str.replace(String.valueOf(currentChar), "");
        }

        return result.toString();
    }



}
