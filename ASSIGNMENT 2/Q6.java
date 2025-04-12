import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of seconds: ");
		double t = sc.nextDouble();
	    double g = 32.174;
	    double distance = 0.5*g*t*t;
	    System.out.println("Distance travelled: " + distance + " feet");
	}
}
		
		
		