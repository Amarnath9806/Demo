package OOPs;

public class Bank1 {
	long accNo;
	double balance;
	
	Bank1()
	{
		this(123, 5679);
		System.out.println("Constructer Called");
	}
	
	public Bank1(long accNo,double balance)
	{
		this.accNo=accNo;
		this.balance=balance;
		System.out.println(accNo+" "+balance);
	}
	
	public Bank1(long accNo)
	{
		this();
		this.accNo=accNo;
		System.out.println(this.accNo);
	}
	
	public static void main(String[] args) {
		Bank1 b=new Bank1(3459);
	}

}
