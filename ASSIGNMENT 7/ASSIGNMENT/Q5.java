package ASSIGNMENT;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println("At least two elements are required.");
            return;
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Initialize largest and second largest
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second largest number.");
        } else {
            System.out.println("The second largest number is: " + second);
        }

        input.close();
    }
}

		        