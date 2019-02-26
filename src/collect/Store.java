package collect;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;
public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	
			
try {
	FileOutputStream fileOutputStream= new FileOutputStream("D:\\Programs\\store.txt");
	ArrayList<Integer> a = new ArrayList<>();
	System.out.println("enter array values");
	for (int i = 0; i < 5; i++) {
		int b = sc.nextInt();
	
		a.add(b);
		fileOutputStream.write( b);
		
	}

	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	

}
}
