/*
 *occurence of the element in the array 
 */
import java.util.Scanner;

public class occurence_of_the_element_in_the_array {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("enter the n value : ");
			int n=in.nextInt();
			int[] arr=new int[n];
			int[] arr1=new int[n];
			int[] arr2=new int[1000];
			
			
			for(int i=0;i<n;i++){
				System.out.print("enter the value "+i+" : ");
				arr[i]=in.nextInt();
			}
			int d=0,inc=0;
			for(int i=0;i<n;i++) {
				if(arr2[arr[i]]==0) {
					arr1[inc]=arr[i];
					d++;inc++;
				}
				arr2[arr[i]]++;
			}
			for(int i=0;i<d;i++) {
				System.out.println(arr1[i]+" occurs "+arr2[arr1[i]]+" times");
				}
			}
			
		}

	}


