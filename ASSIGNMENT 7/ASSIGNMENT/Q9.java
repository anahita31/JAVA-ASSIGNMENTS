package ASSIGNMENT;

import java.util.Scanner;

public class Q9 {
	 public static double mean(double[] x) {
	        double sum = 0;
	        for (double num : x) {
	            sum += num;
	        }
	        return sum / x.length;
	    }

	    /** Compute the standard deviation of double values */
	    public static double deviation(double[] x) {
	        double meanValue = mean(x);
	        double sum = 0;
	        for (double num : x) {
	            sum += Math.pow(num - meanValue, 2);
	        }
	        return Math.sqrt(sum / (x.length - 1));
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double[] numbers = new double[10];

	        // Input 10 numbers
	        System.out.print("Enter ten numbers: ");
	        for (int i = 0; i < 10; i++) {
	            numbers[i] = input.nextDouble();
	        }

	        // Calculate mean and deviation
	        double mean = mean(numbers);
	        double stdDev = deviation(numbers);

	        // Display results
	        System.out.printf("The mean is %.2f\n", mean);
	        System.out.printf("The standard deviation is %.5f\n", stdDev);

	        input.close();
	    }
	}



		   