/*Create a java program to read and print a matrix
 *Create a program to add two matrices in java
 */
import java.util.Scanner;
public class Add_two_natrix {
	public static void array(int[][] arr,int r,int c) {
		Scanner in =new Scanner(System.in);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("enter the value for "+i+","+j+" : ");
				arr[i][j]=in.nextInt();
			}
		}
		in.close();
	}
	public static void prnt(int[][] arr) {
		for(int i[] : arr) {
			for(int j : i ) {
				System.out.print("\t"+j);
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the  size of row :");
			int r =in.nextInt();
			System.out.print("enter the  size of coloumn :");
			int c =in.nextInt();
			
			int[][] arr =new int[r][c];
			int[][] arr1 =new int[r][c];
			int[][] add =new int[r][c];
			
			System.out.println("enter the value for matrix 1: ");
			array(arr,r,c);
			prnt(arr);
			
			System.out.println("enter the value for matrix 2: ");
			array(arr1,r,c);
			prnt(arr1);
			
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					add[i][j]=arr[i][j]+arr1[i][j];
				}
			}
			
			System.out.println("ADDition of two matrix is: ");
			prnt(add);
			}
			
		}
		
	}
