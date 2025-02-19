package mokhinur_solutions;

public class W12_SortArrayAsc {
     /*
    Write a method that can sort an int array in Ascending order without using the sort method


    input = [1, 2, 0, 5, 4, 7, 9]
    output = [ 0, 1, 2, 4, 5, 7, 9]
     */

    // Mokhinur is volunteer

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 4, 7, 9};
        sortArray(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortArray(int[] arr) {
        int num = arr.length;
        for (int i = 1; i < num; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j--;
            }
            arr[j + 1] = key; // Place the key at its correct position
        }
    }
}
