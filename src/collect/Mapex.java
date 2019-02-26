package collect;

import java.util.HashMap;
import java.util.Map;

public class Mapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
hashMap.put(101, "amar");
hashMap.put(102,"nath");
hashMap.put(103,"qqq");

for(Map.Entry m:hashMap.entrySet()) {
	System.out.println(m.getKey()+ " " +m.getValue());
}
	}

}
