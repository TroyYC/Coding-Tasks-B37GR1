package Masoumeh;

public class Number_ReverseNegative_W4 {

    /*Write a return method that can reverse
negative number and return it as int
      Ex:
      input => -456
      output => -654
     */



    public static int reverseNum(int number){
        if(number < 10 && number >= 0){
            return number;
        }

        int result = 0;
        while ( number !=0 ) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(reverseNum(-456));
    }


}









