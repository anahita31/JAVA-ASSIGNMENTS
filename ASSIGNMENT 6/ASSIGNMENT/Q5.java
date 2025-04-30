package ASSIGNMENT;

public class Q5 {
	    public static double area(int n, double side) {
	        if (n < 3 || side <= 0) {
	            System.out.println("Error: A polygon must have at least 3 sides and a positive side length.");
	            return 0.0;
	        }
	        return (n * side * side) / (4 * Math.tan(Math.PI / n));
	    }
	    public static void main(String[] args) {
	        int n = 6;           
	        double side = 4.0; 
	        double result = area(n, side);
	        System.out.println("Area of the regular polygon with " + n + " sides of length " + side + " = " + String.format("%.4f", result));
	    }
	}
