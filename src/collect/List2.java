package collect;

import java.util.ArrayList;
import java.util.Iterator;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> a1= new ArrayList<>();
a1.add(12);
a1.add(34);
System.out.println(a1);
ArrayList<Integer> a2 = new ArrayList<Integer>();
a2.add(55);
a2.add(65);
a1.addAll(a2);
System.out.println(a1);
a1.get(3);

Iterator<Integer> iterator =a2.iterator();
while(iterator.hasNext()) {
	
}
 }

}
