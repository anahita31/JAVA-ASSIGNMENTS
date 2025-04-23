package HOMEASSIGNMENT;

import java.util.Scanner;

public class Q3 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the angle in degrees: ");
		        double degrees = sc.nextDouble();
		        double x = Math.toRadians(degrees);
		        double term = x;          
		        double sum = 0;        
		        int n = 1;                
		        int sign = 1;            
		        double error = 1e-6;      
		        while (Math.abs(term) > error) {
		            sum += sign * term;
		            n += 2; 
		            term = term * x * x / (n * (n - 1)); 
		            sign *= -1; 
		        }
		        System.out.printf("sin(%.2f°) = %.6f\n", degrees, sum);
		        System.out.printf("Using Math.sin(%.2f°) = %.6f\n", degrees, Math.sin(x));
		 
		    }
		}
