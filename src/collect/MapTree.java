package collect;

import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer, String> treeMap=new TreeMap<Integer, String>();
treeMap.put(25, "qwert");
treeMap.put(24, "poiu");
for(Entry<Integer, String> m:treeMap.entrySet()) {
	System.out.println(m.getKey()+ " "+m.getValue());
}
	}

}
