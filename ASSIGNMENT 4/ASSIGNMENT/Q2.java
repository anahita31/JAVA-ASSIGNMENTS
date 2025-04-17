package ASSIGNMENT;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=  new Scanner(System.in);
	     System.out.println("Enter A Number");
	     int n = sc.nextInt();
	     int sum = 0, temp = n;
	     while (temp > 0) {
	            sum += temp % 10; 
	            temp /= 10;      
	        }
	     if (sum % 9 == 0) {
	            System.out.println(n + " is divisible by 9.");
	        } else {
	            System.out.println(n + " is not divisible by 9.");
	        }
	}
}


	        
	        

	        
	        
