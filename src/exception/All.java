package exception;

public class All {
	public static void main(String arr[]) {
		int a=19;
		int b=11;
		System.out.println("print");
		try {
			System.out.println(a/0);
		
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("end");
		}
	}

}
