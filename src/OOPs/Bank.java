package OOPs;

public class Bank {
		long accNo;
		double balance;
		Bank()
		{
			System.out.println("Constructor Called");
		}
		public Bank(int i, int j)
		{
			accNo=i;
			balance=j;
			System.out.println(accNo+" "+balance);
		}
		public static void main(String args[])
		{
			Bank b1=new Bank();
			Bank b2=new Bank(12, 500);
			Bank b3=new Bank();
			Bank b4=new Bank(14, 750);
		}



}
