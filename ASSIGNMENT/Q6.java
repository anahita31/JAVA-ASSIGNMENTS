package ASSIGNMENT;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base:");
        int b = sc.nextInt();
        System.out.print("Enter Power:");
        int p = sc.nextInt();
        int result = 1;
		for (int i = 1;i<=p ; i++) {
        	 result = result*b;
        }
		System.out.println(b + " raised to the power of " + p + " is: " + result);
	}
}
