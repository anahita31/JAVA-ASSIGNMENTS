package HOMEASSIGNMENT;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num=sc.nextInt();
		boolean both=(num%5==0&&num%6==0);
			System.out.println("Is "+num+" divisible by 5 and 6?:  "+both);
	    boolean either=(num%5==0||num%6==0); 
	    	System.out.println("Is "+num+" divisible by 5 or 6?: "+either);
	    boolean notboth= (num%5==0^num%6==0);
	       System.out.println("Is "+num+" divisible by 5 or 6, but not both?: "+notboth);
		}
	}
