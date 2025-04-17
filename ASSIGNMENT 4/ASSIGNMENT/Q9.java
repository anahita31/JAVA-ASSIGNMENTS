package ASSIGNMENT;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter An Integer number: ");
		int number = sc.nextInt();
		int place = 1;
		int result = 0;
		while(number>0) {
			int digit = number %10;
			if (digit!=0) {
				result = digit * place + result;
				place = place *10;
			}
			number = number/10;
		}
		 System.out.println("New number after removing zeros: " + result);
	}
}
