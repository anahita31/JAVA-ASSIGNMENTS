package ASSIGNMENT;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for which you want to find the multiplication table: ");
        int n = sc.nextInt();
        System.out.println("The multiplication table of " + n + " is:");
		for (int i = 1; i<=10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}
}
			
				
			
	
		

    
    
	    

