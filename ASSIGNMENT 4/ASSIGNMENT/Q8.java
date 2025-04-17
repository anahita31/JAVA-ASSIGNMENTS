package ASSIGNMENT;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int computerGuess = (int) (Math.random() * 10) + 1;
		int userGuess;
		System.out.println("Guess A Number Between 1 And 10:");
		while (true) {
			System.out.println("Computer Guess:"+ computerGuess);
			System.out.println("User Guess:");
			userGuess = sc.nextInt();
		if (userGuess >computerGuess) {
			System.out.println("Too High , Try Again.");
		}else if (userGuess < computerGuess) {
			System.out.println("Too Low ,Try Again");
		}else {
			System.out.println("Good Guess!");
			break;
		}
		}
	}
}
