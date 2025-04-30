package ASSIGNMENT;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int[] arr = new int[100];  // Max size
        int n = 0;

        while (true) {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Create array");
            System.out.println("2. Display array");
            System.out.println("3. Insert element at specific position");
            System.out.println("4. Delete element from specific position");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of elements: ");
                    n = input.nextInt();
                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = input.nextInt();
                    }
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Array elements: ");
                        for (int i = 0; i < n; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (n == arr.length) {
                        System.out.println("Array is full. Cannot insert.");
                        break;
                    }
                    System.out.print("Enter element to insert: ");
                    int element = input.nextInt();
                    System.out.print("Enter position (0 to " + n + "): ");
                    int pos = input.nextInt();
                    if (pos < 0 || pos > n) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    for (int i = n; i > pos; i--) {
                        arr[i] = arr[i - 1];
                    }
                    arr[pos] = element;
                    n++;
                    System.out.println("Element inserted.");
                    break;

                case 4:
                    if (n == 0) {
                        System.out.println("Array is empty. Nothing to delete.");
                        break;
                    }
                    System.out.print("Enter position to delete (0 to " + (n - 1) + "): ");
                    int delPos = input.nextInt();
                    if (delPos < 0 || delPos >= n) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    for (int i = delPos; i < n - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    n--;
                    System.out.println("Element deleted.");
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
