package encapsulation;

public class Student impl {

	public static void main(String[] args) {
		Encap s1=new Encap();
		s1.setName("Ravi");
		s1.setRoll(408);
		s1.setFee(5000.350);
		
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
		System.out.println(s1.getFee());
		
		Encap s2=new Encap();
		s2.setName("Kiran");
		s2.setRoll(410);
		s2.setFee(4000);
		
		System.out.println(s2.getName());
		System.out.println(s2.getRoll());
		System.out.println(s2.getFee());

	}

}
