package HOMEASSIGNMENT;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfSquares = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sumOfSquares += i * i; 
            sum += i; 
        }
        int squareOfSum = sum * sum;
        int difference = squareOfSum - sumOfSquares; 
        System.out.println("The sum of the squares of the first ten natural numbers is: " + sumOfSquares);
        System.out.println("The square of the sum of the first ten natural numbers is: " + squareOfSum);
        System.out.println("The difference is: " + difference);
    }
}

		        