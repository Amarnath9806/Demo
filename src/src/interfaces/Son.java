package interfaces;

public class Son implements Father, Mother{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		s.name();
	}
	public void name()
	{
		System.out.println("Interface");
	}
}
