package Loop;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numbers: ");
		double num1= sc.nextDouble();
		double num2= sc.nextDouble();
		System.out.println("Enter the operator");
		String c=sc.next();
		switch (c)
		{
		case "+" :System.out.println("Sum is: "+(num1+num2));
					break;
		case "-" :System.out.println("Difference is: "+(num1-num2));
		break;
		case "*" :System.out.println("Multiplication is: "+(num1*num2));
		break;
		case "/" :System.out.println("Division is: "+(num1/num2));
		break;
		case "%" :System.out.println("Modular Division is: "+(num1%num2));
		break;
		default: System.out.println("Invalid Operator");
		}
	}

}
