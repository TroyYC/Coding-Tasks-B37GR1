package mokhinur_solutions;

public class W3_SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        System.out.println("a = " + a + ", b = " + b);

        a = a + b; //we will assign another number that equals to addition of a and b;
        b = a - b; // so then b will equal to the difference of our second a and b which is 5;
        a = a - b; // and a = 7

        System.out.println("a = " + a + ", b = " + b);
    }
     /*
    Swap two variable values without using a third variable

    int a = 5;
    int b = 7;

   System.out.println("a = " + a); //=> a = 7
   System.out.println("b = " + b); //=> b = 5
     */


}
