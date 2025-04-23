package ASSIGNMENT;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find sum of series: ");
		int n=sc.nextInt();
		int sum=0,tempsum=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				tempsum+=j;
			}
		}
		sum+=tempsum;
	  System.out.println(sum);
		}
	}

