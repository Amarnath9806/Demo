package exercise;

import java.util.Arrays;

public class Merge {

	public static void main(String args[]) {
		int[] a= {3,6,4,56};
		int[] b= {1,8,4,8,2,3};
		int c = a.length;
		int d= b.length;
		int[] e= new int[c+d];
		Arrays.sort(a);
		Arrays.sort(b);
		System.arraycopy(a, 0, e, 0, c);
		System.arraycopy(b, 0, e, c, d);
		Arrays.sort(e);
		System.out.println(Arrays.toString(e));
	

	}
}
