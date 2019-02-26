package date;
import java.util.*;
public class Curr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Currency c1= Currency.getInstance("INR");
Currency c2 =Currency.getInstance("USD");
System.out.println(c1.getCurrencyCode());
System.out.println(c2.getCurrencyCode());
System.out.println(c1.getSymbol());
System.out.println(c1.getDisplayName());
System.out.println(c2.getSymbol());
System.out.println(c2.getDisplayName());

	}

}
