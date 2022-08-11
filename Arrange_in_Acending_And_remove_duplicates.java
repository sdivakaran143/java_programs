/*
logic program
Example:
Input Array = {99,33,22,33,22,44,55,66,77,88}
Ordered Array = {22,22,33,33,44,55,66,77,88,99}
Output Array = {22,33,44,55,66,77,88,99}
 
Input Format
10
99 33 22 33 22 44 55 66 77 88
Output Format
22,33,44,55,66,77,88,99
 */
import java.util.Scanner;
public class Arrange_in_Acending_And_remove_duplicates {
	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("\nenter the n value");
			int n=in.nextInt();
			int[] arr=new int[n];
			int[] arr1=new int[n];

			System.out.print("\nenter the value for array \n");
			for(int i=0;i<n;i++){
				arr[i]=in.nextInt();
			}
			int inc=0;
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++) {
					if(arr[i]>arr[j]){
						inc=arr[i];
						arr[i]=arr[j];
						arr[j]=inc;
					}
				}
			}
			inc=0;
			for(int i=0;i<n;i++){ 
				try{if(arr[i]==arr[i+1]){
					continue;
				}}
				catch(Exception e){}
				arr1[inc]=arr[i];
			inc++;
			}

			
			for(int i=0;i<inc;i++) {
				System.out.print(" "+arr1[i]);
			}
			
		}
		
	}
	
}