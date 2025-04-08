package ugur;

public class Task1_oddOrEven {

    public static void main(String[] args) {

         /*
    Please write a method that can identify given number is odd or even

    EX:
    identify(5)  >  "Odd"
    identify(6)  >  "Even"

         */
        oddOrEven(5);
        oddOrEven(6);


    }

    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

}
