package ASSIGNMENT;

public class Q1 {
	public static class SimpleCalculator {
	    public static int additionSimple(int x, int y) {
	        return x + y;
	    }
	    public static int subtractionSimple(int x, int y) {
	        return y - x;
	    }
	    public static int multiplicationSimple(int x, int y) {
	        return x * y;
	    }
	    public static double divisionSimple(int x, int y) {
	        if (x == 0) {
	            System.out.println("Error: Division by zero is not allowed.");
	            return Double.NaN;
	        }
	        return (double) y / x;
	    }
	    public static int remainderSimple(int n, int m) {
	        if (m == 0) {
	            System.out.println("Error: Division by zero in remainder operation.");
	            return 0; 
	        }
	        return n % m;
	    }
	    public static double squareRootSimple(int n) {
	        if (n < 0) {
	            System.out.println("Error: Cannot compute square root of a negative number.");
	            return Double.NaN;
	        }
	        return Math.sqrt(n);
	    }
	    public static void main(String[] args) {
	        System.out.println("Addition: " + additionSimple(5, 3));
	        System.out.println("Subtraction: " + subtractionSimple(2, 8));
	        System.out.println("Multiplication: " + multiplicationSimple(4, 7));
	        System.out.println("Division: " + divisionSimple(2, 10));
	        System.out.println("Remainder: " + remainderSimple(10, 3));
	        System.out.println("Square Root: " + squareRootSimple(25));
	    }
	}
}
