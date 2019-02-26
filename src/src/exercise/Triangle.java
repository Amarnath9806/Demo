package exercise;
import java.util.Scanner;
public class Triangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the sides of triangle ");
	int a = sc.nextInt();
	int b= sc.nextInt();
	int c = sc.nextInt();
	int d = a*a;
	int e = b*b;
	int f =c*c;
	 if(d==e+f) {
		 System.out.println("right angle trianglr");}
	 else if(e==d+f) {
		 System.out.println("right angle tria");
	 }
	 else if(f==d+e) {
		 System.out.println("right angle tria");
	 }
		 
	 
		 else {
			 System.out.println("not a right angle triangle");
			 
		 }
		 
		
	}
}

