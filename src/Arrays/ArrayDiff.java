package Arrays_Problems;

import java.util.Scanner;

public class ArrayDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Size of the array
            int[] arr = new int[n];

            // Input the array
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            // Variable to store the minimized maximum difference
            int min = Integer.MAX_VALUE;

            // Loop through the array to apply operations and calculate the min difference
            for (int j = 0; j < n - 1; j++) { // Loop until the second-last element
                // Calculate the difference before applying operations
                int diff = Math.abs(arr[j] - arr[j + 1]);

                // Apply the operations to both arr[j] and arr[j + 1] and track the minimum difference
                if (arr[j] % 2 != 0) {
                    arr[j] = arr[j] * 2; // If arr[j] is odd, multiply by 2
                } else {
                    arr[j] = arr[j] / 2; // If arr[j] is even, divide by 2
                }

                if (arr[j + 1] % 2 != 0) {
                    arr[j + 1] = arr[j + 1] * 2; // If arr[j+1] is odd, multiply by 2
                } else {
                    arr[j + 1] = arr[j + 1] / 2; // If arr[j+1] is even, divide by 2
                }

                // After applying the operation, calculate the new difference
                int newDiff = Math.abs(arr[j] - arr[j + 1]);
                min = Math.min(min, newDiff);
            }

            // Print the result after processing the entire array
            System.out.println(min);
        }
    }
}
