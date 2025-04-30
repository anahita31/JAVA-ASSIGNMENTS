package ASSIGNMENT;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        int[] counts = new int[101]; // Array to count numbers 1 to 100

	        System.out.println("Enter the integers between 1 and 100 (end with 0):");

	        while (true) {
	            int num = input.nextInt();
	            if (num == 0) {
	                break;
	            }
	            if (num >= 1 && num <= 100) {
	                counts[num]++;
	            } else {
	                System.out.println("Invalid number (only 1 to 100 allowed). Try again.");
	            }
	        }

	        for (int i = 1; i <= 100; i++) {
	            if (counts[i] > 0) {
	                System.out.println(i + " occurs " + counts[i] + " " + (counts[i] > 1 ? "times" : "time"));
	            }
	        }

	        input.close();
	    }
	}


		      