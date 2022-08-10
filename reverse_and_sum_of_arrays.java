/*
array basic program and n numbers in array and reverse and sum of the array elements
*/
import java.util.Scanner;
public class reverse_and_sum_of_arrays {

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the n value : ");
			int n=in.nextInt();
			int[] arr=new int[n];
			int[] arr1=new int[n];
			int sum=0;

			for(int i=0;i<n;i++){
				System.out.print("\nenter the n value "+i+" : ");
				arr[i]=in.nextInt();
				sum+=arr[i];
			}
			
			for(int i=n-1,j=0;j<n;j++,i--){
				arr1[j]=arr[i];
			}
			
			for(int i : arr) {
				System.out.print("\t"+i);
			}
			System.out.println("\nthe reverse of the array is : ");
			for(int i : arr1) {
				System.out.print("\t"+i);
			}
			
			System.out.println("\n\nthe sum of the elements in the array is "+sum);
		}

	}

}
