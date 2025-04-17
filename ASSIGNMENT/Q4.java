package ASSIGNMENT;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int computerguess=(int)(Math.random()*9)+1;
		System.out.print("User guess a number between 1 and 9: ");
		int userGuess=sc.nextInt();
		System.out.println("Computer guesses: "+computerguess);
		if (userGuess == computerguess) {
            System.out.println("You got it right!");
        } else if (userGuess == computerguess + 1 || userGuess == computerguess - 1) {
            System.out.println("Almost got it!");
        } else {
            System.out.println("You got it wrong. The correct number was " + computerguess);
        }
	}
}


