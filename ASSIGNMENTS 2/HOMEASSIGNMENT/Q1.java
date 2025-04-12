package HOMEASSIGNMENT;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter the number of minutes: ");
		        long minutes = input.nextLong();
		        final int MINUTES_IN_YEAR = 365 * 24 * 60;
		        final int MINUTES_IN_DAY = 24 * 60;
		        long years = minutes / MINUTES_IN_YEAR;
		        long remainingMinutes = minutes % MINUTES_IN_YEAR;
		        long days = remainingMinutes / MINUTES_IN_DAY;
		        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
		        
		        
		    }
		}

	


