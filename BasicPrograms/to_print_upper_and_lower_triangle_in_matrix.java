/*Create a java program to read and print a matrix in upper and lower triangle 
 *
 */
import java.util.Scanner;
public class to_print_upper_and_lower_triangle_in_matrix {
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
	public static void main(String args[]) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the  size of row :");
			int r =in.nextInt();
			System.out.print("enter the  size of coloumn :");
			int c =in.nextInt();
			
			int[][] arr =new int[r][c];
			
			System.out.println("enter the value for matrix 1: ");
			array(arr,r,c);
			
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(i<=j) {
					System.out.print("\t0");
					}
					else {
						System.out.print("\t"+arr[i][j]);
					}
				}
				System.out.println();
			}
			System.out.println("\n");

			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(i>=j) {
					System.out.print("\t0");
					}
					else {
						System.out.print("\t"+arr[i][j]);
					}
				}
				System.out.println();
			}

			
		
			}
			
		}
			}
