package HOMEASSIGNMENT;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1 {
		public static char firstNonRepeatedChar(String str) {
	        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

	        // Count each character
	        for (char ch : str.toCharArray()) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }

	        // Find the first non-repeated character
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() == 1) {
	                return entry.getKey();
	            }
	        }

	        return '\0'; // null character if none found
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        char result = firstNonRepeatedChar(input);

	        if (result != '\0') {
	            System.out.println("First non-repeated character is: " + result);
	        } else {
	            System.out.println("No non-repeated character found.");
	        }

	        scanner.close();
	    }
	}

		

		    