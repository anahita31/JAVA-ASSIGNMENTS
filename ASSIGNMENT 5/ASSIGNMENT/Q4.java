package ASSIGNMENT;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of m:");
		int m=sc.nextInt();
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		if(m < n && m>0 && n>0) {   
			for(int i=m;i<=n;i++) {     
				int fact=1;
				for(int j=i;j>0;j--) {  
					fact*=j;
				}
			System.out.println("The factorial of "+i+" is: "+fact);
			}
		}
		else
			System.out.println("the value of m must be less than n and m and n>0");
		}
}
