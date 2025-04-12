package ASSIGNMENT;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter your marks: ");
		int marks=ip.nextInt();
		int num=marks/10;
		char grade='n';
		switch(num) {
		case 10:
		case 9:
			grade='O';
			break;
		case 8:
			grade='A';
			break;
		case 7:
			grade='B';
			break;
		case 6:
			grade='C';
			break;
		case 5:
			grade='D';
			break;
		case 4:
			grade='E';
			break;
		default:
			grade='F';
		}
		System.out.println(grade);
	}
}

