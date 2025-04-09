package ugur;

import java.util.Arrays;

public class Task12_sortArrayAsc {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method


    input = [1, 2, 0, 5, 4, 7, 9]

    output = [ 0, 1, 2, 4, 5, 7, 9]
     */

    public static void sortArrayAsc(int[] array){
        // int []newArray = new int[array.length];

        Arrays.sort(array);
        System.out.println("Arrays.toString(array) sorted = " + Arrays.toString(array));

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 0, 5, 4, 9, 7};
        System.out.println("Arrays.toString(array) =         " + Arrays.toString(array));
        sortArrayAsc(array);

    }




}
