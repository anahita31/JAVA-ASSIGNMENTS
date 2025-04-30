package HOMEASSIGNMENT;

import java.util.Scanner;

public class Q4 {
	 // Method to count words in a string
    public static int countWords(String str) {
        
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the string:");
        String text = input.nextLine();

        int wordCount = countWords(text);
        System.out.println("Number of words: " + wordCount);

        input.close();
    }
}


		
		   