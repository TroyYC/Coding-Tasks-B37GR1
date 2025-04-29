package ugur;

public class Practice {

    public static void main(String[] args) {

        int[] arrayName = {99, 45, 4, 56, 77, 34, 76, 7};

        System.out.println(findMinimum(arrayName));
        System.out.println(findMinimum2(arrayName));
        System.out.println(4);
    }

    public static int findMinimum(int[] arr) {
        int minimum = arr[0];

        for (int each : arr) {

            if (each < minimum) {
                minimum = each;
            }
        }

        return minimum;
    }

    public static int findMinimum2(int[] arr) {
        int minimum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
