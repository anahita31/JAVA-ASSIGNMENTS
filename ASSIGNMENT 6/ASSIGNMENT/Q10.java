package ASSIGNMENT;

import java.util.Scanner;

public class Q10 {
	    // Area of triangle: (1/2) * base * height
	    public static double area(double base, double height) {
	        return 0.5 * base * height;
	    }

	    // Area of square: side * side
	    public static double area(int side) {
	        return side * side;
	    }

	    // Area of circle: π * radius^2
	    public static double area(float radius) {
	        return Math.PI * radius * radius;
	    }

	    // Area of rectangle: length * width
	    public static double area(int length, int width) {
	        return length * width;
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Triangle
	        System.out.print("Enter base and height of triangle: ");
	        double base = sc.nextDouble();
	        double height = sc.nextDouble();
	        System.out.println("Area of Triangle = " + area(base, height));

	        // Square
	        System.out.print("Enter side of square: ");
	        int side = sc.nextInt();
	        System.out.println("Area of Square = " + area(side));

	        // Circle
	        System.out.print("Enter radius of circle: ");
	        float radius = sc.nextFloat();
	        System.out.println("Area of Circle = " + area(radius));
	        System.out.print("Enter length and width of rectangle: ");
	        int length = sc.nextInt();
	        int width = sc.nextInt();
	        System.out.println("Area of Rectangle = " + area(length, width));

	        sc.close();
	    }
	}
