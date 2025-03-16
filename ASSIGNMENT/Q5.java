package ASSIGNMENT;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int N = sc.nextInt();
		        int sum=0;
		        for (int i = 1; i <= N / 2; i++) {
		            if (N % i == 0) {
		                sum += i; 
		            }
		        }
		        if (sum == N) {
		            System.out.println(N + " is a Perfect Number.");
		        } else {
		            System.out.println(N + " is NOT a Perfect Number.");
		        }
		    }
}
