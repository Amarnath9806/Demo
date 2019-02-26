package exception;

public class MyCalculator {
	public static void longPower(int[] a ,int[] b) {
		
		
	

		for (int i = 0; i < b.length; i++) {
			if(a[i]>0 && b[i]>0) {
				System.out.println("ok");
				System.out.println("power is calculated");
				}
		
			
				else {
					try {
						if(a[i]>0 && b[i]>0);
						throw new ArithmeticException("0");
					} catch (Exception e) {
						System.out.println(e);
					}
					try {
						if(a[i]==0 && b[i]==0);
						throw new ArithmeticException("0");
					} 
					catch (Exception e) {
						System.out.println(e);
					}
					
					public static void main(String args[]) {
						int [] a= {1,-1,0,4};
						int[] b= {2,3,0,5};
						longPower(a,b);
					}
					
			
		}
	
		

