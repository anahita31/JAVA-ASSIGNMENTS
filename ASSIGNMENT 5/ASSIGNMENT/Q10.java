package ASSIGNMENT;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms (n > 3): ");
        int n = sc.nextInt();
        if (n <= 3) {
            System.out.println("Please enter a value greater than 3.");
            return;
        }
        int a = 0, b = 1, c = 2;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 4; i <= n; i++) {
            int d = a + b + c;
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
}
}
