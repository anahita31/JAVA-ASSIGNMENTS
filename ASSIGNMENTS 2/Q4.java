import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		 int number = sc.nextInt();
		 if (number < 0 || number > 1000) {
	            System.out.println("Invalid input! Please enter a number between 0 and 1000.");
	        } else {
	            // Extract and sum the digits
	            int sum = 0;
	            int temp = number;
	            
	            while (temp > 0) {
	                sum += temp % 10; // Extract last digit and add to sum
	                temp /= 10; // Remove last digit
	            }
	            
	            // Display the result
	            System.out.println("The sum of the digits is " + sum);
	        }
	        
		 
	}

}
