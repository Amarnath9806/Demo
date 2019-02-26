package task;

import java.util.Scanner;

public class Bank {

	static double balance = 10000;

	public void trans(double amt) {
		balance = balance + amt;
		System.out.println("Credit Successful\nRemaining balance: " + balance);
	}

	public void trans(int ch, double amt) {

		if (amt > balance)
			System.out.println("Insufficient Balance");
		else {
			balance = balance - amt;
			System.out.println("Debit Successful\nRemaining Balance: " + balance);
		}
	}

	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		int i;
		do {
			System.out.println("Welcome to the Bank\nPress 1 for Credit 2 for Debit");
			int ch = sc.nextInt();
			System.out.println("Enter the amount");
			double amt = sc.nextDouble();
			switch (ch) {
			case 1:
				b.trans(amt);
				break;
			case 2:
				b.trans(ch, amt);
				break;
			default:
				System.out.println("Operation not available");
			}
			System.out.println("Press 1 to continue");
			// i=sc.nextBoolean();
			i = sc.nextInt();
		} while (i == 1);
		System.out.println("Thank you for using the services. Good Bye");
	}
}
