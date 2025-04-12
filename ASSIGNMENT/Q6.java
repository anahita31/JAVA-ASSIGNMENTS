package ASSIGNMENT;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter units: ");
	    double units=sc.nextDouble();
	    double price=0;
	    if(units<=50)
	    	price=3*units;
	    else if(units<=200)
	    	price=4.80*units;
	    else if(units<=400)
	    	price=5.80*units;
	    else
	    	price=6.20*units;
	    System.out.println("your monthly bill is Rs."+price);
		}
}


