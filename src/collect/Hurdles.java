package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hurdles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("enter the number of hurdles");
int n = sc.nextInt();
System.out.println("enter the max height dan can jump");
int k= sc.nextInt();
int[] array= new int[n];

for (int i = 0; i < n; i++) {
	int num =sc.nextInt();
	array[i]=num;
}
Arrays.sort(array);
System.out.println(Arrays.toString(array));
int x = array[n-1]-k;
	
if(x>0) {
	System.out.println(x);
}
	else {
		System.out.println("0");
	
}
}
}
