package ASSIGNMENT;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x and y coordinates: ");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		String quad="unknown ";
	    if (x==0) {
	    	if(y==0)
	    		quad="origin";
	    	else 
	    		quad="y-axis";
	    		}
	    else if(x>0) {
	    	if(y>0)
	    		quad="1st quadrant";
	    	else if(y<0)
	     		quad="4th quadrant";
	    	else
	    		quad="x-axis";
	    }
	    else if(x<0) {
	    	if(y>0)
	    		quad="2nd quadrant";
	    	else if(y<0)
	    		quad="3rd quadrant";
	    	else
	    		quad="x-axis";
	    }
	    System.out.println("("+x+" , "+y+") is in "+quad);
	    	
		}
	}

	


