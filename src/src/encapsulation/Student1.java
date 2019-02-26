package encapsulation;

import java.io.Serializable;

public class Student1 implements Serializable {

	public static void main(String args[])
	{
		Encap s1 = new Encap(); 
		Encap s2 = new Encap(); 
		Encap s3 = new Encap(); 
		
		s1.setName("Ravi");
		s1.setRoll(408);
		s1.setFee(10000);
		s1.setCollege("VJIT");
		
		s2.setName("Kiran");
		s2.setRoll(418);
		s2.setFee(20000);
		s2.setCollege("JBIT");
		
		s3.setName("Ravi");
		s3.setRoll(428);
		s3.setFee(30000);
		s3.setCollege("KMIT");
		
		System.out.println(s1.getCollege());
		System.out.println(s2.getCollege());
		System.out.println(s3.getCollege());
	}
}
