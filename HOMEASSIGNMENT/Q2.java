package HOMEASSIGNMENT;

import java.util.Scanner;

public class Q2 {
	// Volume of cube: side³
    public static double volume(int side) {
        return side * side * side;
    }

    // Volume of sphere: (4/3) × π × r³
    public static double volume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    // Volume of cuboid: length × breadth × height
    public static double volume(int length, int breadth, int height) {
        return length * breadth * height;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cube
        System.out.print("Enter side of the cube: ");
        int side = sc.nextInt();
        System.out.println("Volume of Cube = " + volume(side));

        // Sphere
        System.out.print("Enter radius of the sphere: ");
        float radius = sc.nextFloat();
        System.out.println("Volume of Sphere = " + volume(radius));

        // Cuboid
        System.out.print("Enter length, breadth, and height of the cuboid: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int height = sc.nextInt();
        System.out.println("Volume of Cuboid = " + volume(length, breadth, height));

        sc.close();
    }
}

	
		    