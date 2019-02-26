package collect;

import java.util.Iterator;
import java.util.HashSet;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet tr = new HashSet();
tr.add("z");
tr.add("g");
tr.add("d");
tr.add("e");
tr.add("b");
tr.add("u");
tr.add(44);
tr.add("a");

Iterator iterator= tr.iterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}






	}

}
