package ASSIGNMENT;

import java.util.Scanner;

public class Q3 {
	 public static int reverse(int number) {
	        int reversed = 0;
	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number /= 10;
	        }
	        return reversed;
	    }
	    public static boolean isPalindrome(int number) {
	        return number == reverse(number);
	    }
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int number = input.nextInt();

	        if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }
	    }
	}

	
		   