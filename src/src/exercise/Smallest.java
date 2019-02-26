package exercise;
import java.util.Arrays;
import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		int[] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the number");
			int a = sc.nextInt();
		arr[i]=a;
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("enter k");
	int k =sc.nextInt();
Arrays.sort(arr);
smallest(arr , k);
largest(arr,k);
	}
		
		

	

	private static void largest(int[] arr, int k) {
		
		System.out.println(arr[arr.length-k]);
	}

	private static void smallest(int[] arr, int k) {
		
		System.out.println(arr[k-1]);
	
		
	}

}
