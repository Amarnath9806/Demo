package exception;

public class Exp {
	public static void main(String arr[]) {
		System.out.println("start");
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {}
		System.out.println("end");
	
	}

}
