package mokhinur_solutions;

public class W4_Number_ReverseNegative {
    /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654
     */
    public static int reverseNegativeNumber(int num) {
        // Check if the number is negative
        if (num >= 0) {
            throw new IllegalArgumentException("The number must be negative.");
        }

        // Convert the number to a positive string (removing the negative sign)
        String reversedString = new StringBuilder(String.valueOf(-num)).reverse().toString();

        // Convert the reversed string back to an integer and add the negative sign
        return -Integer.parseInt(reversedString);
    }

    public static void main(String[] args) {
        int number = -6849;
        int reversed = reverseNegativeNumber(number);
        System.out.println("Reversed number: " + reversed); // Output: -9486
    }
}
