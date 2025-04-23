package ASSIGNMENT;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter second number: ");
	    int num2=sc.nextInt();
	    for(int i=num1+1;i<num2;i++) {
	    	boolean isPrime=true;
	    	  for(int j=2;j<=(int)Math.sqrt(i);j++) {  
	    		  if(i%j==0) {             
	    			  isPrime=false;
	    			  break;
	    	  }
	    	  }
	    		  if(isPrime && i>1)
	    			  System.out.println(i+" ");
	    }
		}
	}
	
