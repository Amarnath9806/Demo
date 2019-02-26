package collect;
import java.util.ArrayList;
import java.util.Scanner;
public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
ArrayList<Integer> a=new ArrayList<>();
for (int i = 0; i < 5; i++) {
	int b = sc.nextInt();
	a.add(b);
}
System.out.println(a);
	int c= sc.nextInt();
	if(a.contains(c))
	System.out.println("yes");
	else
		System.out.println("no");
	}


	}




