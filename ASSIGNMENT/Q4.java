package ASSIGNMENT;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int x = input.nextInt();
		System.out.print("Enter the second number: ");
		int y = input.nextInt();
		while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("The GCD is: " + x);
    }
}
        
