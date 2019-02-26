package collect;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> ha = new HashSet<Integer>();
ha.add(23);
ha.add(45);
ha.add(23);
ha.add(null);
ha.add(66);
ha.add(54);
ha.add(24);
ha.add(23);
ha.add(null);

Iterator<Integer> iterator =ha.iterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}




	}

}
