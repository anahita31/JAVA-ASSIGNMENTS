package ASSIGNMENT;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc=new Scanner(System.in);
		    System.out.print("Enter a year: ");
		    int year=sc.nextInt();
		    boolean isLeap;
		    if(year%400==0 && year%4==0||year%100!=0)
		    isLeap=true;
		    else
		    isLeap=false; 	
		    	System.out.println(year+" is a leap year: "+isLeap);
			}
	}


