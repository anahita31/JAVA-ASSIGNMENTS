package ASSIGNMENT;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter the number of elements: ");
	        int n = input.nextInt();
	        int[] arr = new int[n];

	        // Input array elements
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = input.nextInt();
	        }

	        // Reverse using two-pointer method
	        int i = 0, j = n - 1;
	        while (i < j) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        }

	        // Output the reversed array
	        System.out.println("Reversed array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        input.close();
	    }
	}

		       