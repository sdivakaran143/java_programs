import java.util.Scanner;

/*
 * copy the array into new array  
 */
public class copy_array_into_new_array {

	public static void main(String[] args) {
				try(Scanner in =new Scanner(System.in)){
					System.out.print("enter the n value : ");
					int n=in.nextInt();
					int[] arr=new int[n];
					int[] arr1=new int[n];
					
				for(int i=0;i<n;i++){
					System.out.print("\nenter the n value "+i+" : ");
					arr[i]=in.nextInt();
				}

				for(int i=0;i<n;i++){
					arr1[i]=arr[i];
				}
				System.out.println("\nthe orginal array value is :\n");
				for(int i : arr) {
					System.out.print("\t"+i);
				}
				
				System.out.println("\nthe copied array value is :\n");
				for(int i : arr1) {
					System.out.print("\t"+i);
				}
				}

	}

}
