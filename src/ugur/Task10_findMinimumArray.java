package ugur;

import java.util.Arrays;

public class Task10_findMinimumArray {
    // Function to find the minimum number in an array
    public static int findMin(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static int findMinimum(int[] nums) {
        int min = nums[0];

        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            System.out.println(min);
        }

        return min;

    }

    public static void main(String[] args) {
        int[] myArray = {10, 9, 8, 15, 3};
        System.out.println("The minimum number is: " + findMin(myArray));

        System.out.println("The minimum number is: " + findMinimum(myArray));

    }


}
