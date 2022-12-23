/*
 * binary value  to decimal value  
 */
import java.util.Scanner;
public class binary_to_decimal_value {

	public static void main(String[] args) {
		try(Scanner in=new Scanner(System.in)){
			
			int arr[]=new int[50];
			
			System.out.print("enter the value :");
			int dec=in.nextInt();
			int rem=dec,i=0;
			while (dec>0) {
				arr[i]=dec%2;
				dec/=2;
				i++;
			}
			System.out.print("the binary value of "+rem +"is : ");
			for(int j=i-1;j>=0;j--) {
				System.out.print(arr[j]);
			}
		}

	}

}
