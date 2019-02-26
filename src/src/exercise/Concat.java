package exercise;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Concat {
public static void main(String[] args) {

split("amar","nath");
String s =" ";
System.out.println(s);
}
private static String split(String s1, String s2) {
	int i=0;
	String s =" ";
	while(i<s1.length()&&i<s2.length()) {
		 s += s1.charAt(i)+s2.charAt(i);
		i++;
	
		}
	return s;
	
	}


	
}
