package ASSIGNMENT;

import java.util.Scanner;

public class Q11 {
	  public static void bubbleSort(double[] list) {
	        int n = list.length;
	        boolean swapped;

	        for (int pass = 0; pass < n - 1; pass++) {
	            swapped = false;
	            for (int i = 0; i < n - 1 - pass; i++) {
	                if (list[i] > list[i + 1]) {
	                    // Swap elements
	                    double temp = list[i];
	                    list[i] = list[i + 1];
	                    list[i + 1] = temp;
	                    swapped = true;
	                }
	            }
	            // If no elements were swapped, the array is sorted
	            if (!swapped) break;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double[] numbers = new double[10];

	        System.out.print("Enter ten double numbers: ");
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = input.nextDouble();
	        }

	        bubbleSort(numbers);

	        System.out.print("The sorted numbers are: ");
	        for (double num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}



		  