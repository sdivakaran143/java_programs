/*Create a java program to multiply two  matrix
 */
import java.util.Scanner;
public class multiply_two_matrix {
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
			System.out.print("enter  row of matrix 1 :");
			int x =in.nextInt();
			System.out.print("enter the coloumn of matrix 1 :");
			int y =in.nextInt();
			
			System.out.print("enter the row of matrix 2 :");
			int m =in.nextInt();
			System.out.print("enter the coloumn of matrix 2 :");
			int n =in.nextInt();
			
			int[][] arr =new int[x][y];
			int[][] arr1 =new int[m][n];
			int[][] mul =new int[x][n];
			if(y!=m) {
				System.out.println("this matrix is invalid...");
			}else {
			
			
			System.out.println("enter the value for matrix 1: ");
			array(arr,x,y);
			prnt(arr);
			
			System.out.println("enter the value for matrix 2: ");
			array(arr1,m,n);
			prnt(arr1);
			
			int sum=0;
			for (int i=0;i<x;i++) {
				for (int j=0;j<n;j++) {
					for (int k=0;k<y;k++) {
						sum+=arr[i][k]*arr1[k][j];
					}
					mul[i][j]=sum;sum=0;
				}
			}
							
			System.out.println("multiplication of two matrix is: ");
			prnt(mul);
			}
			}
		}
		
	}
