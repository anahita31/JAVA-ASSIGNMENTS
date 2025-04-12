package HOMEASSIGNMENT;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

      
        System.out.print("Enter your gender (M or F): ");
        char gender = ip.next().charAt(0);
        gender = Character.toUpperCase(gender);
        System.out.print("First name: ");
        String first_name = ip.next();
        System.out.print("Last name: ");
        String last_name = ip.next();
        System.out.print("Enter your age: ");
        int age = ip.nextInt();
        if (age >= 20) {
            if (gender == 'M') {
                System.out.println("Then I shall call you Mr. " + first_name + " " + last_name);
            } 
            else if (gender == 'F') {
                System.out.print("Are you married (y/n): ");
                char married = ip.next().charAt(0);
                married = Character.toLowerCase(married);

                if (married == 'y') {
                    System.out.println("Then I shall call you Mrs. " + first_name + " " + last_name);
                } 
                else if (married == 'n') {
                    System.out.println("Then I shall call you Ms. " + first_name + " " + last_name);
                } 
                else {
                    System.out.println("Invalid input for marital status.");
                }
            } 
            else {
                System.out.println("Invalid input for gender.");
            }
        } 
        else {
            System.out.println("You are under 20, so no formal title is needed.");
        }

        
    }
}
