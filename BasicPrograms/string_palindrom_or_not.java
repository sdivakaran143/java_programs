/*
 * to check the given number is palindrom or not palindrom
 * 
 */
import java.util.Scanner;

public class string_palindrom_or_not {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter the value : ");
			int a=in.nextInt();
			int rev=0,n=a,ln;
			while(a>0) {
				ln=a%10;
				rev=(rev*10)+ln;
				a=a/10;
			}
			if(n==rev) {
				System.out.println("Its a polindrom");
			}
			else {
				System.out.println("Its not a polindrom");
			}
		}
	}
}
