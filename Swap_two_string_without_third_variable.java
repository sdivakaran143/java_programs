/*
 * Create a java program to swap two strings without third variable
 */
import java.util.Scanner;
public class Swap_two_string_without_third_variable {
	static Scanner in =new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the String 1 :");
		String str1=in.nextLine();
		System.out.print("Enter the String 2 :");
		String str2=in.nextLine();
		System.out.print("\n\tBefore swaping :\n");
		System.out.println("the value of String 1 :"+str1+"\nthe value of String 2 :"+str2);
		int str1len=str1.length();
		
		str1+=str2;
		str2=str1.substring(0,str1len);
		str1=str1.substring(str1len);
		
		System.out.print("\n\tAfter swaping :");
		System.out.print("\nthe value of String 1 :"+str1+"\nthe value of String 2 :"+str2);
	}

}
