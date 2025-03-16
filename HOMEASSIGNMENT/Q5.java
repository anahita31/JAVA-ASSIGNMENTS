package HOMEASSIGNMENT;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows (N): ");
        int N = input.nextInt();
        String pattern = "1";
        for (int i = 1; i <= N; i++) {
            System.out.println(pattern);
            pattern = pattern + (i + 1) + pattern; 
        }

	}
}





		        