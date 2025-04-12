package HOMEASSIGNMENT;

public class Q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int W = 1, G = 2, K = 3, A = 4;
		        
		        // Display original values
		        System.out.println("Before swapping: W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);
		        
		        // Swapping using an extra variable
		        int temp = W;
		        W = G;
		        G = K;
		        K = A;
		        A = temp;
		        
		        System.out.println("After swapping (using temp variable): W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);
		        
		        // Reset values
		        W = 1; G = 2; K = 3; A = 4;
		        
		        // Swapping without using an extra variable
		        W = W + G + K + A;
		        A = W - (G + K + A);
		        K = W - (G + K + A);
		        G = W - (G + K + A);
		        W = W - (G + K + A);
		        
		        System.out.println("After swapping (without temp variable): W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);
		    }
}

	




