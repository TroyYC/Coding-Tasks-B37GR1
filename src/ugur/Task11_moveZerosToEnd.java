package ugur;

import java.util.Arrays;

public class Task11_moveZerosToEnd {

    /*
    write a program that can move all the zeros to the end of an int array

    input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
    output = [ 1, 2, 5, 6, 9, 0, 0, 0]

     */


    public static void moveZerosToTheEnd(int[] array) {
        int[] newArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {


            if (array[i] == 0) {
                count++;
            } else {
                newArray[i - count] = array[i];
            }
        }
        System.out.println("Arrays.toString(newArray) = " + Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 0, 0, 5, 0, 6, 9};
        System.out.println("Arrays.toString(array) =    " + Arrays.toString(array));

        moveZerosToTheEnd(array);
        // output = [ 1, 2, 5, 6, 9, 0, 0, 0]

    }


}
