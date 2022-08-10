import java.util.Scanner;
/*
 *maximum and minimum number in the array 
 */
public class max_and_min_in_array {

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the n value : ");
			int n=in.nextInt();
			int[] arr=new int[n];
			int max = 0;
		
			for(int i=0;i<n;i++){
				System.out.print("\nenter the value "+i+" : ");
				arr[i]=in.nextInt();
			}
			int min=arr[0];
			for(int i=0;i<n;i++) {
				if(max<arr[i]){
					max=arr[i];
				}
			}
			for(int i=0;i<n;i++) {
				if(min>arr[i]){
					min=arr[i];
				}
			}
			System.out.println("\nthe minimum number in the array is "+min);

			System.out.println("the maximum number in the array is "+max);
			

			
		}
	}

}
