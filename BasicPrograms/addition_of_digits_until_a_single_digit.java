/*
 * addition of digits  and addition of digits until a single digit
 */
import java.util.Scanner;

public class addition_of_digits_until_a_single_digit {
	public static int mth(int a) {
		int n,sum=0;
		while(a>0) {
			n=a%10;
			sum+=n;
			a=a/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter the digit :");
			int num1=in.nextInt();
			int a=num1;
			System.out.println("the sum of the digit is "+mth(a));
			int c=mth(a);
			while(mth(a)%10>-1) {
				System.out.println("the sum of the digit until single digit is "+mth(c));
				break;
			}
		}
	}
	
}