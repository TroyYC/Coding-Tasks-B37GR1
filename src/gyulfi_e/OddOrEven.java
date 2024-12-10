package gyulfi_e;

public class OddOrEven {
    public static void main(String[] args) {

        int num = 0;

        oddOrEven(6);


    }

    public static void oddOrEven(int num) {


        if (num % 2 == 0) {
            System.out.println("Odd");
        } else if (num % 2 == 1){
            System.out.println("Even");
        }

    }





}

/*
    Please write a method that can identify given number is odd or even

    EX:
    identify(5)  >  "Odd"
    identify(6)  >  "Even"

    Mokhinur is volunteer

 */
