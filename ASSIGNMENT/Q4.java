package ASSIGNMENT;
public class Q4 {
	 public static int numberOfDaysInAYear(int year) {
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            return 366;
	        } else {
	            return 365;
	        }
	    }
	    public static void main(String[] args) {
	        System.out.println("Year Days");
	        for (int year = 2000; year <= 2020; year++) {
	            System.out.println(year + " "+ numberOfDaysInAYear(year));
	        }
	    }
	}

	
		   