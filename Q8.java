import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp;
        x = 10;
        y = 20;
        System.out.println("Before swapping: x = " + x + ", y= " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: x = " + x + ", y = " + y);
	}

}
	
	

		


