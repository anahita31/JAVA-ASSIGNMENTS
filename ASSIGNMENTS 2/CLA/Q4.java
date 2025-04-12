package CLA;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t=Double.parseDouble(args[0]);
		t=Math.toRadians(t);
		double res=Math.cos(5*t)+Math.sin(7*t);
		System.out.println("The value of cos(5t)+sin(7t) when t="+t+" is :"+res);
	}

}
