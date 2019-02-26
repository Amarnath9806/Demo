package collect;

import java.util.ArrayList;
import java.util.Collections;

import encapsulation.Student2;

public class SortStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student2> a1=new ArrayList<Student2>();
a1.add(new Student2("Amar",11,22));
a1.add(new Student2("Amrar",131,232));
a1.add(new Student2("Amar",111,223));
Collections.sort(a1);
for(Student2 st:a1) {
	System.out.println(st.rollno+" "+st.name + " " +st.fee);
}
	}

}
