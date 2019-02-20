package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Evenodd obj =new Evenodd();
		int[] arr=accept();
		evenodd(arr);
		



}

	private static void evenodd(int[] arr) {
		int count=0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2==0) 
			count++;
	}
		int[] even= new int[count];
		int j=0,k =0;
		int[] odd =new int[arr.length-count];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				even[j]=arr[i];
			j++;}
			else {
				odd[k]= arr[i];
				k++;
			}
			
		}
		Arrays.sort(even);
		Arrays.sort(odd);
		int[] c= new int[even.length+odd.length];
		System.arraycopy(even, 0, c, 0, even.length);
		System.arraycopy(odd, 0, c, even.length, odd.length);
		System.out.println(Arrays.toString(c));
		
	}

	private static int[] accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		int[] arr= new int[n];
		System.out.println("enter the number");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
		

	}
	//	for (int i : arr) {
		//	System.out.println(i);
		//}
return arr;
		
	}
}
