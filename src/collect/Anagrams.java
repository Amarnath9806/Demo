package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import arrays.Array;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> ch1= new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);		
		String s1= sc.next();
				ArrayList<Character> ch2= new ArrayList<Character>();
						String s2= sc.next();
						for (int i = 0; i < s1.length(); i++) {
							ch1.add(new Character(s1.charAt(i)));
							
						}
						for (int i = 0; i < s2.length(); i++) {
							ch2.add(new Character(s2.charAt(i)));
						}
//String s1= "LISTEN";
//String s2= "SILENT";
//char[] ch1=s1.toCharArray();
//char[] ch2=s2.toCharArray();


	//for (int i = 0; i < args.length; i++) {
	Collections.sort(ch1);
	Collections.sort(ch2);

if(ch1.equals(ch2))

	
	System.out.println("true");
else
	System.out.println("false");
	
	}
}

