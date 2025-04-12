import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic salary of an employee :");
		double basicSalary = sc.nextDouble();
		double da = basicSalary * 0.40;
        double hra = basicSalary * 0.20;
        double grossSalary = basicSalary + da + hra;
        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("House Rent Allowance (HRA): " + hra);
        System.out.println("Gross Salary: " + grossSalary);
	}

}
