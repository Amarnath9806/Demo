package file;



		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;
		import java.util.Scanner;
		public class Output {

			public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);

		try {
			FileOutputStream 	file = new FileOutputStream("D:\\Programs\\demo1.txt");
			System.out.println("enter name");
			String s=sc.next();
			byte[] b=s.getBytes();
			file.write(b);
			file.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		}
		}


	