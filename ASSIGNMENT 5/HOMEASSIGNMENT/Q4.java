package HOMEASSIGNMENT;

public class Q4 {

	 public static double cos(double x) {
		        double result = 1.0;  
		        double term = 1.0;  
		        int n = 2;  
		        double tolerance = 1e-6;
		        while (true) {
		            term *= -x * x / ((n - 1) * n); 
		            result += term;
		            if (Math.abs(term) < tolerance) {
		                break;
		            }
		            n += 2;  
		        }
		        return result;
		    }
		    public static void main(String[] args) {
		        double x = Math.toRadians(60);  
		        double result = cos(x);
		        System.out.println("cos(60 degrees) = " + result);
		    }
		}

