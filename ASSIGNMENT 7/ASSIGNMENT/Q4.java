package ASSIGNMENT;

import java.util.Scanner;

public class Q4 {
	 public static double min(double[] array) {
	        double min = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }
	        return min;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double[] numbers = new double[10];

	        System.out.println("Enter ten numbers:");

	        for (int i = 0; i < 10; i++) {
	            numbers[i] = input.nextDouble();
	        }

	        double minimum = min(numbers);
	        System.out.println("The minimum number is: " + minimum);

	        input.close();
	    }
	}


		   