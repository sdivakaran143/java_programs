/*
 * Create a java program to check the two strings are equal or not without using string
functions.
 */
import java.util.Scanner;
public class Check_the_given_strings_are_equal_or_not {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the string 1 :");
		String str=in.nextLine();
		System.out.print("Enter the string 2 :");
		String str2 =in.nextLine();
		
		if(str.length()==str2.length()) {
			int n=str.length();
			for(int i=0;i<n;i++){
				if(str.charAt(i)==str2.charAt(i)) {
				}else {
					System.out.println("the given Strings Are Not Equal");
					break;
				}
				if(i==n-1) {
					System.out.println("the given Strings Are Equal");
				}
			}
		}
		else {
			System.out.println("the given Strings Are Not Equal");
		}
	}

}
