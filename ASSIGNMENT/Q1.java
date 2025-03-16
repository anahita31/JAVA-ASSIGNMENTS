package ASSIGNMENT;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number");
        int b = sc.nextInt();
        System.out.println("Enter The Third Number");
        int c = sc.nextInt();
        System.out.print("Numbers Displayed: ");
        int sum = 0;
        for (int i = a ; i<b ; i+=c) {
        	System.out.println(i + " ");
        	sum = sum+i;
        	}
        System.out.println("The sum of numbers displayed is " + sum);
	}
}


