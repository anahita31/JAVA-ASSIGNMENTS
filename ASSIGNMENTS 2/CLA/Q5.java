package CLA;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner (System.in);
		System.out.print("Enter three numbers: ");
		int num1=ip.nextInt();
		int num2=ip.nextInt();
		int num3=ip.nextInt();
		int max=Math.max(num1, (Math.max(num2, num3)));
		int min=Math.min(num1, (Math.min(num2, num3)));
		int middle=num1+num2+num3-max-min;
	    System.out.println("The three values in ascending order is "+min+" < "+middle+" < "+max);
	}

}
