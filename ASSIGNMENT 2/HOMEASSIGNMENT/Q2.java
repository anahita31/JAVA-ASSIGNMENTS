package HOMEASSIGNMENT;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of eggs: ");
		int eggs = sc.nextInt();
		int EGGSINGROSS = 144;
		int EGGSINDOZEN = 12;
		int gross = eggs/EGGSINGROSS;
		int remainingeggs = eggs%EGGSINGROSS;
		int dozens = remainingeggs / EGGSINDOZEN;
		int leftover = remainingeggs % EGGSINDOZEN;
		System.out.println("Your number of eggs is " + gross + " gross, " + dozens + " dozen, and " + leftover + " eggs.");
		
		
		
	}

}
