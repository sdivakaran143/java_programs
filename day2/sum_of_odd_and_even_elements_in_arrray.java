/*
 * sum of odds and even elements
 */
import java.util.Scanner;

public class sum_of_odd_and_even_elements_in_arrray {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("enter the n value : ");
			int n=in.nextInt();
			int[] arr=new int[n];
			int[] odd=new int[n];
			int[] even=new int[n];

			int sumodd=0,sumeven=0;
			System.out.println("enter the value for the array : ");

			for(int i=0;i<n;i++){
				System.out.print("enter the value "+i+" : ");
				arr[i]=in.nextInt();
			}
			int e=0,o=0;
			for(int i=0;i<n;i++){
			 if(arr[i]%2==0) {
			 even[e]=arr[i];
			 sumeven+=arr[i];
			 e++;
			 }
			 else {
				 odd[o]=arr[i];
				 sumodd+=arr[i];
				 o++;
				 
			 }
			}
			System.out.println("\nthe even elements in the array: ");

			 for(int i=0;i<e;i++){
					System.out.print("\t"+even[i]);

				}
				System.out.println("\n the sum of the even elements "+sumeven);
				System.out.println("\nthe odd elements in the array: ");

			 for(int i=0;i<o;i++){
					System.out.print("\t"+odd[i]);
					
				}
			 System.out.println("\n the sum of the odd elements "+sumodd);

			
			
			
		}
	}

}
