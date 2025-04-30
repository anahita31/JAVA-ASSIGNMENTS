package ASSIGNMENT;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10 {
	public static int[] eliminateDuplicates(int[] list) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        for (int num : list) {
            if (!resultList.contains(num)) {
                resultList.add(num);
            }
        }

        // Convert ArrayList to int[]
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinct = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int num : distinct) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


		