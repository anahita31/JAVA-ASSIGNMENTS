package HOMEASSIGNMENT;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=ip.nextInt();
		int a=0,b=1,f=0;
	    if(n==1) 
				System.out.print("Fibonacci series is: "+a);
		else if(n==2)
				System.out.print("Fibonacci series is: "+a+" "+b);
		else if(n>=3) {
			System.out.print("Fibonacci series is: "+a+" "+b+" ");
			for(int i=3;i<=n;i++) {
				f=a+b;
				System.out.print(f+" ");
				a=b;
				b=f;
			}
			}
		else
			System.out.print("Enter a value greater than 0");
		}
}
