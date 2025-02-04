package fatih_solutions;

public class FindMinimumArray {

    public class FindMinimum {
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

        public static void main(String[] args) {
            int[] myArray = {5, 2, 8, 1, 3};
            System.out.println("The minimum number is: " + findMin(myArray));
        }
    }
}
