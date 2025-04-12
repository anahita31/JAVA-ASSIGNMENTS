package HOMEASSIGNMENT;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner ip = new Scanner(System.in);
		        System.out.print("Enter today's day of the week (0-6): ");
		        int day_no = ip.nextInt();
		        if (day_no < 0 || day_no > 6) {
		            System.out.println("Invalid input! Please enter a number between 0 and 6.");
		            return; 
		        }
		        System.out.print("Enter number of days elapsed since today: ");
		        int no_day = ip.nextInt();
		        int futureDay = (day_no + no_day) % 7;
		        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		        System.out.println("Today is " + days[day_no] + " and the future day is " + days[futureDay]);
	}

}
