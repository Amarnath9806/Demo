package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {

	public static void main(String[] args) {
	try {
		FileInputStream Input=new FileInputStream("D:\\Programs\\demo.txt");
		try {
			System.out.println(Input.read());
			Input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
