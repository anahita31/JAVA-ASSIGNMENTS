package HOMEASSIGNMENT;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner ip = new Scanner(System.in);

		        // Generate a random choice for the computer (0: Scissor, 1: Rock, 2: Paper)
		        int computer = (int) (Math.random() * 3);

		        // Ask the user for input
		        System.out.print("Scissor (0), Rock (1), Paper (2): ");
		        int user = ip.nextInt();

		        // Validate user input
		        if (user < 0 || user > 2) {
		            System.out.println("Invalid input! Please enter 0, 1, or 2.");
		        } else {
		            // Determine the result of the game
		            String result;
		            if (computer == user) {
		                result = "It is a draw!";
		            } else if ((user == 0 && computer == 2) || // Scissor beats Paper
		                       (user == 1 && computer == 0) || // Rock beats Scissor
		                       (user == 2 && computer == 1)) { // Paper beats Rock
		                result = "You won!";
		            } else {
		                result = "You lost!";
		            }
		            String[] choices = {"Scissor", "Rock", "Paper"};
		            System.out.println("The computer choose: " + choices[computer]);
		            System.out.println("You choose: " + choices[user]);
		            System.out.println(result);
		        
		    }
		}
		}

	
