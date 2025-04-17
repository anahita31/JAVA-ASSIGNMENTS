package ASSIGNMENT;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("Enter the second number:");
        int y = sc.nextInt();
        System.out.println("Enter the third number:");
        int z = sc.nextInt();
        if (x < y && y < z) {
            System.out.println("Increasing");
        } else if (x > y && y > z) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }

	}

}
