package Kamola_solutions;

import java.util.*;

public class W13_UniqueSumZero {
    public static int[] sumZero(int N) {
        int[] result = new int[N];
        int sum = 0;
        
        for (int i = 0; i < N - 1; i++) {
            result[i] = i + 1; // Assign unique positive numbers
            sum += result[i];
        }
        
        // The last number is the negative sum of all previous numbers
        result[N - 1] = -sum;
        
        return result;
    }
    
    public static void main(String[] args) {
        int N = 4;
        System.out.println(Arrays.toString(sumZero(N)));
    }
}