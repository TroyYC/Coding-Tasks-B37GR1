package salman_uyghur;

/**
 * @author : salman
 * @created : 11/13/2024,12:24 AM
 * @Email : salmanuyghur3@gmail.com
 **/
public class Week1_Solutions {
        /*
    Please write a method that can identify given number is odd or even

    EX:
    identify(5)  >  "Odd"
    identify(6)  >   "Even"

         */

    public static void main(String[] args) {

        int[] x = {25,9,16,63,70,23};
        int[] y = {41,55,72,55,20,10};
        System.out.println("this array has"+sumEvenAndOdd(x));
        System.out.println(sumEvenAndOdd(y));

    }

    public static int sumEvenAndOdd(int[] numbers) {
        int sum = 0;
        for (int number : numbers){
            if (number % 2 == 0){
                sum += number;
                System.out.println("even = "+number);

            }else {
                sum = number;
                System.out.println("odd = "+number);

            }
        }return sum;
    }
}
