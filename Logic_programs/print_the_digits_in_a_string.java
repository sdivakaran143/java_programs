/**
 * 4. check if a String contains digits.
	Ex: i/p: hello123
		o/p:123
 */
import java.util.Scanner;

public class print_the_digits_in_a_string {

	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the String :");
		String str=in.nextLine();
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
	}

}
