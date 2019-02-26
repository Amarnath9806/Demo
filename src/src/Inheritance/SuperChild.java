package Inheritance;

public class SuperChild extends SuperParent{

	String name = "Ravi";
	public SuperChild()
	{
		System.out.println(name);
		System.out.println(super.name);
		display();
		super.display();
	}
	/*public static void main(String[] args) {
		
		new SuperChild();
		

	}*/
	void display()
	{
		System.out.println("Son Name is: "+name);
	}

}
