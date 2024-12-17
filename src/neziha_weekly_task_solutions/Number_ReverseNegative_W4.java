package neziha_weekly_task_solutions;

public class Number_ReverseNegative_W4 {

    /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654

      Neziha is volunteer
     */

    public static int reversedNegativeNumber(int num) {


        if (num >= 0) {//if the number is not negative
            System.out.println("Enter a negative number Please");
            return 0;
        }

        int reversedNumber = 0;


        while (num < 0) { //-456

           // FIRST ITERATION

            int digit = num % 10;                               //Modulus will give us last digit of number = -456 % 10 = 6 remainder
            reversedNumber = reversedNumber * 10 + digit;
                                     //  0  * 10 + 6           // I am shifting exist number left by multiply 10 to make a room
      //    reservedNumber = 6                                 // for  the new digit
                                                               // because I do not want to lose  my first number by replacing
                                                               // with second iteration remaining.
            num = num / 10; //-45                              // remove the last digit from num
           //SECOND ITERATION


         //     digit = -45 % 10 = 5;
         //    reservedNumber =    6 * 10 + 5 =65



            //THIRD ITERATION

        //     digit =-4 % 10  = 4
        //     reservedNumber = 65 * 10 + 4 = 654
        }
        return reversedNumber;
    }


    public static void main(String[] args) {
        int number = -456;
        int reversedNumber = reversedNegativeNumber(number);
        System.out.println("Given number : "+ number);
        System.out.println("Reserved Number : " + reversedNumber);

    }
}




