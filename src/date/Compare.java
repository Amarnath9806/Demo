package date;

import java.util.Date;

public class Compare {

	public Compare() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d1 = new Date( 2019, 02, 22);
System.out.println(d1);


Date d2= new Date();
System.out.println(d2);
Date d3 = new Date(2000,11,11);
System.out.println(d3);
int a = d1.compareTo(d3);
System.out.println(a);
boolean b = d1.after(d2);
	System.out.println(b);
	}

}
