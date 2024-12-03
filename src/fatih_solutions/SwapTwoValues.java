package fatih_solutions;

public class SwapTwoValues {
        public static void main(String[] args) {
            int a = 5;
            int b = 7;

            a = a + b; // a now becomes 12 (5 + 7)
            b = a - b; // b now becomes 5 (12 - 7)
            a = a - b; // a now becomes 7 (12 - 5)

            System.out.println("a = " + a); // a =7
            System.out.println("b = " + b); // b =5

        }
    }
