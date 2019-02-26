package collect;

import java.util.ArrayList;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList animals = new  ArrayList();
animals.add(12);
animals.add("haa");
animals.add(123);
System.out.println(animals);
System.out.println(animals.get(2));
animals.add(3,"wer");
System.out.println(animals.get(2));
	}

}
