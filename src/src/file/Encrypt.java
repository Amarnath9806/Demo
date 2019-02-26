package file;
import java.util.Scanner;
public class Encrypt {
	public static void encrypt()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s;
		s=sc.next();
		char[] letters=s.toCharArray();
		StringBuilder a=new StringBuilder();
		for (int i = 0; i < letters.length; i++) {
			a.append((char)(byte)((letters[i])+3));
		}
		System.out.println(a);
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       encrypt();
	       
		}

}
