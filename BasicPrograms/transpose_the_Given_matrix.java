/*Create a java program to transpose matrix
 */
import java.util.Scanner;
public class transpose_the_Given_matrix {
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
			int x =in.nextInt();
			System.out.print("enter the  size of coloumn :");
			int y =in.nextInt();

			
			int[][] arr =new int[x][y];
			int[][] trans =new int[y][x];

			System.out.println("enter the value for matrix 1: ");
			array(arr,x,y);
			prnt(arr);
			
			for(int i=0;i<y;i++) {
				for(int j=0;j<x;j++) {
					trans[i][j]=arr[j][i];
				}
			
			}
			
			System.out.println("transpose of  matrix is: ");
			prnt(trans);
			}
			
		}
		
	}
