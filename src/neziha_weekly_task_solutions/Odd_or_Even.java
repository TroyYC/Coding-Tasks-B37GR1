package neziha_weekly_task_solutions;

public class Odd_or_Even {
    public static void main(String[] args) {
         /*
    Please write a method that can identify given number is odd or even

    EX:
    identify(5)  >  "Odd"
    identify(6)  >   "Even"

         */

        oddOrEvenNumber(5) ;//Number is Even
        oddOrEvenNumber(6) ;//Number is Odd

    }
    public static void oddOrEvenNumber(int n) {
        if (n % 2 == 0) {
            System.out.println("Number is Odd");
        }else if (n % 2 != 0) {
            System.out.println("Number is Even");
        }else {
            System.out.println("Invalid number");
        }
    }
}
