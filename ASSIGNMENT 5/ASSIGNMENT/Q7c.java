package ASSIGNMENT;

public class Q7c {

	public static void main(String[] args) {
		 for (int i = 1; i <= 5; i++) {
			 for (int k = 1; k <= (5 - i); k++) {
				 System.out.print("  ");
			 }
			 for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
		 }
			 System.out.println();
	}
	}
}
