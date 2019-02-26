package collect;

import java.util.ArrayList;
import java.util.LinkedList;

public class Timeinb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> aa = new ArrayList<Integer>();
for (int i = 0; i <10e5; i++) {
	aa.add(i);
	
}
long start =System.currentTimeMillis();
System.out.println(start);
int j= aa.size()/2;
for (int i = 0; i < 1000; i++) {
	aa.add(j, i);
	j++;
	
}
long stop = System.currentTimeMillis();
System.out.println("time" +(start-stop));
}

}
