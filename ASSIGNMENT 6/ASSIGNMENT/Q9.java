package ASSIGNMENT;
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password=sc.nextLine();        
		if(rightPassword(password)) {
			System.out.println("Valid password");
		}
		else 
			System.out.println("Invalid password");
		}
		public static boolean rightPassword(String password) {
			int count=0;
			if(password.length()>=8) {
				for(int i=0; i<password.length();i++) {
					if(Character.isLetterOrDigit(password.charAt(i))) {
						if(Character.isDigit(password.charAt(i))) {
							count++;
						}
						if(count>=2) {
							return true;
						}
					}
				}
			}
			return false;
		}

	}
