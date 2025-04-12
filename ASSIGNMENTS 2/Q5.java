import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the hemisphere ");
		double radius = sc.nextDouble();
		double surfaceArea = 3 * Math.PI * Math.pow(radius, 2);
		double volume = (2.0 / 3) * Math.PI * Math.pow(radius, 3);
		System.out.println("The Surface Area  of the hemisphere is: " + surfaceArea + " square units");
        System.out.println("The Volume of the hemisphere is: " + volume + " cubic units");


		
	}

}
