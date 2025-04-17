package ASSIGNMENT;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three integer numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			 if(a>c) {	
			    System.out.println(a+" is largest ");
			      if(b>c) {
			    	  System.out.println(b+" is 2nd largest");
			      }
			      else
			    	  System.out.println(c+" is 2nd largest");
		      }
			 else {
				 System.out.println(c+" is largest");
			     System.out.println(a+" is 2nd largest");
			 }	
		}
			 else if(b>c) {
	               System.out.print(b+" is largest");
	                  if(a>c)
	                	  System.out.print(a+" is 2nd largest");
	                  else
	                	  System.out.print(c+"is 2nd largest");
		    }
	   else
		   System.out.print(c+" is largest");
		   System.out.print(b+" is second laregst");
		}
		}
