package CLA;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int n3=Integer.parseInt(args[2]);
		boolean res=(n1<=(n2*n3))||(n2<=(n1*n3))||(n3<=(n1*n2));
		System.out.println(res);

	}

}
