/*
 * encoded array
 */
import java.util.*;
public class Encoded_array {

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the size of the array :");
			int n=in.nextInt();
			int[] a = new int[n];
			int[] ea=new int [n];
			int sum=0;
			for(int i=0;i<n;i++) {
				a[i]=in.nextInt();
				sum+=a[i];
			}
			ea[n-1]=a[n-1];
			for(int i=0;i<n-1;i++) {
				ea[i]=a[i]+a[i+1];
			}System.out.print(" orginal array :\n\t ");

			for(int i : a) {
				System.out.print(i+" ");
			}System.out.print("\nencoded array :\n\t");
			for(int i : ea) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("first number in a orginal array : "+a[0]);
			System.out.println("sum of all number in a orginal array : "+sum);

		}
	}

}
