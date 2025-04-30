package HOMEASSIGNMENT;

import java.util.Scanner;

public class Q3 {
    // Method to get the correct middle character
    public static char getMiddleCharacter(String str) {
        int length = str.length();
        int middleIndex;

        if (length == 0) {
            return '\0'; // Return null character if string is empty
        }

        if (length % 2 == 0) {
            // Even length: return second middle character
            middleIndex = length / 2;
        } else {
            // Odd length: return middle character
            middleIndex = length / 2;
        }

        return str.charAt(middleIndex);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        if (text.length() == 0) {
            System.out.println("String is empty.");
        } else {
            char middleChar = getMiddleCharacter(text);
            System.out.println("Middle character: " + middleChar);
        }

        input.close();
    }
}
