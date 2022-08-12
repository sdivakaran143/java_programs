/*
 *   1 
    1 1 
   1 2 1 
  1 3 3 1 
Pascal’s Triangle Program

 */

import java.util.*;
public class pascals_triangle {


	public static void main(String[] args) {
		try(Scanner in=new Scanner(System.in)){
		System.out.print("enter the value :");
		int v=in.nextInt();
		int n=0;int a;
		
		for(int i=1;i<=v;i++) {
			a=1;
			for(int j=n;j<v;j++) {
				System.out.print(" ");
			}n++;
			 for(int j=1; j<=i; j++){
			    System.out.print(a+" ");
			      a=a*(i-j)/j;
			 }
			 System.out.println();
			}
		}
	}

}
