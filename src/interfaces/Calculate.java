package interfaces;

public class Calculate implements Operations{

	public static void main(String[] args) {
		Calculate c=new Calculate(); // or Operations o = new Calculate();
		c.add();
		c.sub();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Subtraction");
	}
	

}
