package Kamola_solutions;

public class W4_ReverseNegativeNumber {

    public static int reverseNegativeNum(int num) {

        int reversedNumber = 0;

        while (num < 0) {
            int lastDigit = num % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            num = num / 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        int input = -456;
        int output = reverseNegativeNum(input);
        System.out.println("Given num : " + input);
        System.out.println("Reserved num : " + output);

    }
}

    /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654





      Neziha is volunteer
     */


