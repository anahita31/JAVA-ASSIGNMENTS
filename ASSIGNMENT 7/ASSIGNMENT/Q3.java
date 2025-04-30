package ASSIGNMENT;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        int[] numbers = new int[10];

	        System.out.println("Enter 10 integers:");

	        // Input 10 integers
	        for (int i = 0; i < 10; i++) {
	            numbers[i] = input.nextInt();
	        }

	        // Input the number to search
	        System.out.print("Enter the number to search: ");
	        int target = input.nextInt();

	        // Count occurrences
	        int count = 0;
	        for (int num : numbers) {
	            if (num == target) {
	                count++;
	            }
	        }

	        // Output result
	        if (count > 0) {
	            System.out.println(target + " is present and appears " + count + (count > 1 ? " times." : " time."));
	        } else {
	            System.out.println(target + " is not present in the array.");
	        }

	        input.close();
	    }
	}

		       