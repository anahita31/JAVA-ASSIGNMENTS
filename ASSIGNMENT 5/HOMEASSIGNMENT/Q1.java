package HOMEASSIGNMENT;

public class Q1 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				 if (j == 5 - 1 - i) {
					 System.out.print("* ");
				 }else {
					 System.out.print((5 - j) + " ");
				 }
			}
			System.out.println();
		}

	}

}
