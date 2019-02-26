package array;
import java.util.Scanner;
public class Plusminus {
	public static void plusMinus(int[] arr) {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("enter no of elements");
		int n = sc.nextInt();
		System.out.println("enter the elements");
		int[] a= new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
	
			plusMinus(a);
			
		}

}
