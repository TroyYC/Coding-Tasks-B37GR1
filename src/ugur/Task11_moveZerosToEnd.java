package ugur;

public class Task11_moveZerosToEnd {

    /*
    write a program that can move all the zeros to the end of an int array

    input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
    output = [ 1, 2, 5, 6, 9, 0, 0, 0]

     */

    public static void moveZerosToTheEnd(int[] array) {
        // int[] newArray;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0) {


            }
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 0, 0, 5, 0, 6, 9};

        moveZerosToTheEnd(array);
        // output = [ 1, 2, 5, 6, 9, 0, 0, 0]

    }


}
