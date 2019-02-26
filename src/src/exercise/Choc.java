package exercise;
import java.util.Scanner;
public class Choc {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of friends");
	int n = sc.nextInt();
	System.out.println("enter number of cholates");
	int c= sc.nextInt();
	if(c%n==0) {
		System.out.println("yes");
		
	}
	else
		System.out.println("no");
	}

}
