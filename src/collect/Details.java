package collect;
import java.util.ArrayList;
import java.util.Scanner;
import encapsulation.*;
public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Encap1> sa = new ArrayList<Encap1>();
		sa.add(getInfo());
		sa.add(getInfo());

	}

	private static Encap1 getInfo() {
Scanner sc = new Scanner(System.in);
System.out.println("enter the student details");
Student student = new Student();
student.setName(sc.next());
student.setRoll(sc.next());
student.setFee
		return Encap1;
	}

}
