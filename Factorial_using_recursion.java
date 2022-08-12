/*
 * factorial using recursion
 */
import java.util.*;
public class Factorial_using_recursion {
	static int i=0;
	public static int fact(int f) {
		if(i==1) {
			return f;
		}
		i--;
	return fact(f*i);
	}

	public static void main(String[] args) {
		try(Scanner in=new Scanner(System.in)){
			System.out.print("enter the value :");
			int f=in.nextInt();
			i=f;
			System.out.println("the factorial of "+f+" is "+fact(f));
		}
		
	}

}
