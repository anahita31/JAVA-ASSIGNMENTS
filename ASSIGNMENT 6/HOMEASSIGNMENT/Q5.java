package HOMEASSIGNMENT;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

    // Method to check if three numbers are consecutive
    public static boolean areConsecutive(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers); // Sort in ascending order

        return (numbers[1] - numbers[0] == 1) && (numbers[2] - numbers[1] == 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        boolean result = areConsecutive(x, y, z);

        System.out.println("Are the numbers consecutive? " + result);

        input.close();
    }
}

