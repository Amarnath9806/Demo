package array;
import java.util.Scanner;
public class Diagonal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row and col");
		int row= sc.nextInt();
		int col= sc.nextInt();
		int mat[][]= new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <col; j++) {
				mat[i][j]=sc.nextInt();
				
				System.out.print(mat[i][j]);
			
				}
			System.out.println();
			
			}
		}
	}

