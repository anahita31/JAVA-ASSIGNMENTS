import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a degree in Fahrenheit:");
		double  Fahrenheit = sc.nextDouble();
		double celsius = ((Fahrenheit -32) *(5.0/9)); 
	  System.out.println(Fahrenheit + " Fahrenheit is " + String.format("%.2f", celsius) + " Celsius");
	}
}
