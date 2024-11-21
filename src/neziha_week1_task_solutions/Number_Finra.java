package neziha_week1_task_solutions;

import java.nio.charset.MalformedInputException;

public class Number_Finra {
    public static void main(String[] args) {

          /*
    Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

      */



  /*    for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA");
            } else if (i % 3 == 0) {
                System.out.print("FIN");
            } else if (i % 5 == 0) {
                System.out.print("RA");
            } else {
                System.out.print(" " + i + " ");
            }
        }

    }

}

   */



        //NOT =  There wasn t any information about print or println.I preferred print one.
        //        if we want to get a specific number like (16)


       int i = 15;//FINRA

        if (i % 3 == 0 && i % 5 == 0) {
            System.out.print("FINRA");
        } else if (i % 3 == 0) {
            System.out.print("FIN ");
        } else if (i % 5 == 0) {
            System.out.print("RA ");
        } else {
            System.out.print(" " + i + " ");
        }
    }
}























