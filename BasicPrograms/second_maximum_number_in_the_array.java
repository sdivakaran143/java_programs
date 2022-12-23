import java.util.*;
/*
 *2nd maximum number in the array 
 */
public class second_maximum_number_in_the_array {

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the n value : ");
			int n=in.nextInt();
			int[] arr=new int[n];
			int max = 0;
			int max2=0;
			for(int i=0;i<n;i++){
				System.out.print("\nenter the value "+i+" : ");
				arr[i]=in.nextInt();
			}
			/*Arrays.sort(arr);
			System.out.printf("the 2nd maximum number in the array is : %s",arr[arr.length-2]+"\t");
			*/
			for(int i=0;i<n;i++) {
				if(max<arr[i]){
					max=arr[i];
				}
			}
			for(int i=0;i<n;i++) {
				if(max2<arr[i]){
					if(max>arr[i]) {
						max2=arr[i];
					}
				}
			}
			System.out.println("\nthe maximum number in the array is "+max);
			
			System.out.println("the the 2 nd maximum number in the array is "+max2);
		}
	}
}