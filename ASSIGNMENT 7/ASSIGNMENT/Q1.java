package ASSIGNMENT;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();

	        System.out.print("Enter the size of the array (N): ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        int sum = 0;

	        System.out.print("Random values in the array: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = rand.nextInt(100); // Random number between 0 and 99
	            System.out.print(arr[i] + " ");
	            sum += arr[i];
	        }

	        double average = (double) sum / n;

	        System.out.println("\nSum = " + sum);
	        System.out.println("Average = " + average);

	        sc.close();
	    }
	}
		    