package demo1;

public class Cake {
	 static int birthdayCakeCandles(int[] arr) {
		
		int a= arr[0];
		for (int i = 0; i < arr.length; i++) {
		if(arr[i]>a)	{
			a=arr[i];
		}
			
		}return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] c= { 2,5,3,3};
int a=birthdayCakeCandles(c);
System.out.println(a);
	}
	
}
