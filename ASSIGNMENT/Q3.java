package ASSIGNMENT;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=  new Scanner(System.in);
	     System.out.println("Enter A Number");
	     int N = sc.nextInt();
	     int sum = 0, count = 0;
	     System.out.print("Random numbers generated are: ");
	     do {
	    	 int randomNum = (int) (Math.random() * N) + 1; // Generates random number between 1 and N
	            System.out.print(randomNum + " ");
	            sum += randomNum;
	            count++;
	     } while (count < N);
	     double average = (double) sum / N;
	     System.out.printf("\nAverage of %d random numbers is %.2f", N, average);
	}
}

	        
	        

	    
	

	        
	        

	     