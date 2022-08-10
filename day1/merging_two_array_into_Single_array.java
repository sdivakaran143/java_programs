/*
 * merging the two arrays into Single array
 */
import java.util.Scanner;
import java.util.Arrays;

public class merging_two_array_into_Single_array {

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("\nenter the array size :");
			int n=in.nextInt();
			int[] arr=new int[n+n];
			int[] arr1=new int[n];
			int[] arr2=new int[n];
			
			System.out.println("enter the array1 value :");
			for(int i=0;i<n;i++){
				System.out.print("\nenter the value "+i+" : ");
				arr1[i]=in.nextInt();
			}
			System.out.println("enter the array2 value :");
			for(int i=0;i<n;i++){
				System.out.print("\nenter the value "+i+" : ");
				arr2[i]=in.nextInt();
			}
			int j=0;
			for(int i=0;i<(n+n);i++){
				if(i<n) {
					arr[i]=arr1[i];
				}else {
					arr[i]=arr2[j];
					j++;
				}
			}
			Arrays.sort(arr);
			System.out.print("the merged array is :\n");
			for(int i:arr) {
				System.out.print("\t"+i);
			}
				
		}

	}

}
