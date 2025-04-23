package ASSIGNMENT;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int rev=0,count1=0,count2=0;
		int temp=num;
		while(num>0) {
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		for(int i=2;i<=(int)Math.sqrt(temp);i++) {
			if(temp%i==0) {
				count1++;
			    break;
			}
		}
		for(int j=2;j<(int)Math.sqrt(rev);j++) {
			if(rev%j==0) {
				count2++;
			break;
			}
		}
		if(count1==0&&count2==0)
			System.out.println(temp+" is a twisted prime number.");
		else
			System.out.println(temp+" is not a twisted prime number.");
	}
}
