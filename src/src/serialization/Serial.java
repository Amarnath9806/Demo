package serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import encapsulation.Encap1;
public class Serial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream fileInputStream= new FileInputStream("D:\\Program\\object.txt");
	ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
	Encap1 s = (Encap1)objectInputStream.readObject();
	s.setName("Amar");
	s.setRoll(422);
	s.setFee(2233);
	System.out.println(s.getName()+" "+s.getFee()+" "+s.getRoll());
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
