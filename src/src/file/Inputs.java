package file;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream Input=new FileInputStream("D:\\Programs\\demo1.txt");
			int i;
			while((i=Input.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
	}
		
	}
}

