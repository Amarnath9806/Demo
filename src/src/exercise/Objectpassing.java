package exercise;
import java.util.Scanner;

import encapsulation.Encap1.java;
import encapsulation.Student;
public class Objectpassing {
	  Scanner sc = new Scanner(System.in);
	 Student s = new Student();
	public static void main(String[] args) {
		Objectpassing ob= new Objectpassing();
		Student s= new Student();
		
		accept();
		display();

	}

	private static void display() {
		
		
	}

	private static void accept() {
		System.out.println("enter name");
		s.setName(sc.next());
		
	}

}
