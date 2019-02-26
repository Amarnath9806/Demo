package exercise;
import java.util.Scanner;
public class Photo {
public static void main(String[] args) {
	int L= 45;
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter the width");
	int w = sc.nextInt();
	System.out.println("enter the height");
	int h =sc.nextInt();
	if(w<45&&h<45) {
		System.out.println("upload another picture");
	}
	 else if((w>=45&&h>=45)) {
		
		if(w==h) {
			System.out.println("accept");
			
		}
		else
			System.out.println("crop");
		}
	
	
}
}
