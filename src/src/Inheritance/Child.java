package Inheritance;

public class Child extends Parent {

	String desig="Doctor";
	public void show()
	{
		System.out.println(desig);
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		c.name = "Ravi";
		c.display();
	}

}
