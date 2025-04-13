package ASSIGNMENT;

import java.util.Scanner;

public class Q7 {

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
	    System.out.print("Do you want to pay online(y/n): ");
	    char ans=sc.next().charAt(0);
	    if(ans=='y') {
	    System.out.printf("Total amount: Rs.%.2f",price);
	    double d_price=price*0.03;
	    System.out.printf("\nDiscount: Rs.%.2f",d_price);
	    System.out.printf("\nAmount payable: Rs.%.2f",(price-d_price));
	    }	
	    else 
	    	System.out.printf("Amount payable: Rs.%.2f",price);
	    
		}
}

	


