package mokhinur_solutions;

public class week1_solutions {
    /*
    Please write a method that can identify given number is odd or even

    EX:
    identify(5)  >  "Odd"
    identify(6)  >   "Even"

         */
    public static void main(String[] args) {
       oddOrEven(4);
       oddOrEven(5);
    }
    public static int oddOrEven(int n) {
        if(n%2==0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
        return n;
    }
}
