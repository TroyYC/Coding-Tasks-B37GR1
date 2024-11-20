package Kamola_solutions;

public class Kamola_Task_EvenOdd {

    //If statement:
    public static String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    //Boolean:
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }


    //Ternary:
    public static String evenOddTernary(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }


    public static void main(String[] args) {

        System.out.println(checkEvenOdd(88)); //Even
        System.out.println(checkEvenOdd(77)); //Odd

        System.out.println("-----------------------------------");

        System.out.println(isEven(88)); // true
        System.out.println(isOdd(77));  // true

        System.out.println("-----------------------------------");

        System.out.println(evenOddTernary(88));//Even
        System.out.println(evenOddTernary(77));//Odd


    }
}
