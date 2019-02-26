package collect;

import java.util.ArrayList;
import java.util.LinkedList;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> ll = new LinkedList<Integer>();
for (int i = 0; i < 1000000; i++) {
	ll.add(i);
	
}
long start = System.currentTimeMillis();
for (int i = 0; i < 1000000; i++) {
	ll.add(i);
	
}
long end =System.currentTimeMillis();
System.out.println("time" +(end-start));
	}

}
