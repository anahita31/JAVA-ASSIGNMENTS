package ASSIGNMENT;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        // Input decimal number
	        System.out.print("Enter a decimal number: ");
	        int decimal = input.nextInt();

	        // Convert to octal
	        String octal = Integer.toOctalString(decimal);

	        // Display result
	        System.out.println("Octal representation: " + octal);

	        input.close();
	    }
	}

		
		       