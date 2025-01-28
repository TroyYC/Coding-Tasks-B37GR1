package Kamola_solutions;

public class W5_FrequencyOfCharacters {

    public static String frequencyOfChars(String str) {
        int[] frequencies = new int[256];  // Array to store frequencies of ASCII characters
        StringBuilder result = new StringBuilder();  // To build the result string

        // Count frequencies of each character in the string
        for (char each : str.toCharArray()) {
            frequencies[each]++;  // Increment frequency at the index corresponding to the character's ASCII value
        }

        // Build the result string by iterating over the string again
        for (char each : str.toCharArray()) {
            if (frequencies[each] > 0) {  // If the character has not been processed yet
                result.append(each).append(frequencies[each]);  // Append the character and its frequency
                frequencies[each] = 0;  // Mark the character as processed
            }
        }

        return result.toString();  // Return the result string
    }

    public static void main(String[] args) {
        String testString = "AAABBCDD";  // Test string
        System.out.println("Frequency of characters: " + frequencyOfChars(testString));
        // Expected Output: A3B2C1D2
    }

     /*
    Write function that can find the frequency of characters

            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


     */

}