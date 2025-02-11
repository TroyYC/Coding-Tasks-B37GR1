package Kamola_solutions;

import java.util.Arrays;

public class W11_MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 5, 0, 6, 9};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToEnd(int[] arr) {

        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
    }
}



 /*
        int index = 0; // Position to place non-zero elements

        // Move non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;}
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index++] = 0;}
        }*/
 /*
    write a program that can move all the zeros to the end of an int array

    input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
    output = [ 1, 2, 5, 6, 9, 0, 0, 0]

    // Kamola is volunteer
     */