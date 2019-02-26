package collect;

import java.util.ArrayList;
import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
ArrayList<Integer> a=new ArrayList<>();
for (int i = 0; i < 5; i++) {
	int b = sc.nextInt();
	a.add(b);
}
int c= sc.nextInt();
System.out.println(a.indexOf(c));

	}
}
