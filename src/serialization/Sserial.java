package serialization;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import encapsulation.Encap1;
public class Sserial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encap1 encap1=new Encap1();
encap1.setName("name");
encap1.setRoll(1234);
encap1.setFee(2222);
try {
	FileOutputStream fileOutputStream = new FileOutputStream("D:\\Programs\\object.txt");
	ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}
