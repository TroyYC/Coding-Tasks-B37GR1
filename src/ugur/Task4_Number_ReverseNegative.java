package ugur;

public class Task4_Number_ReverseNegative {

    public static void main(String[] args) {
        int number = -456;
        int reversedNumber = reversedNegativeNumber(number);
        System.out.println("Given number : " + number);
        System.out.println("Reversed Number : " + reversedNumber);

    }
   /*
    Write a return method that can reverse
negative number and return it as int
      Ex:
      input => -456
      output => -654
     */

    public static int reversedNegativeNumber(int num) {
        int reversedNumber = 0;

        while (num < 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num = num / 10;
        }
        return reversedNumber;
    }
}


