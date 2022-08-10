/*
 * fibonacci series
 */
import java.util.Scanner;
public class fibonacci_series {

	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
		int c,a=0,b=1;
		System.out.print("enter the n value : ");
		int n=in.nextInt();
		System.out.print("the fibno series is : \n\t");
		System.out.print(a+","+b);
		for(int i=0;i<n;i++){
			c=a+b;
			a=b;b=c;
			System.out.print(","+c);
		}
		
	   }
	}
}
