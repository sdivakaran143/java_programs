/**
 *to print unique elements in the array 
 */
import java.util.Scanner;
public class unique_element_in_the_array {
	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("\nenter the n value");
			int n=in.nextInt();
			int[] arr=new int[n];
			System.out.print("\nenter the value for array \n");
			for(int i=0;i<n;i++){
				arr[i]=in.nextInt();
			}
			 System.out.println("\nunique elements in an array is :");

			 for(int i = 0; i < n; i++){
			      for(int j=0;j<n;j++){
			         if(arr[i] == arr[j] && i!=j) {
			         break;
			      }
				if(j == n-1 ){
			         System.out.print("\t"+arr[i]);
			      }
			   }
			 }

		} 
	}
}
