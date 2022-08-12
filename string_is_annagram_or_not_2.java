/*
 * Write a java program to check if two given String is the anagram of each other
 */
import java.util.*;
public class string_is_annagram_or_not_2 {
	static Scanner in =new Scanner(System.in); 

	public static void main(String[] args) {
		System.out.print("Enter the String 1 :");
		String str1=in.nextLine().toLowerCase();
		System.out.print("Enter the String 2 :");
		String str2=in.nextLine().toLowerCase();
		
		 char[] stra1 =str1.toCharArray();
		 char[] stra2 =str2.toCharArray();
		
		 Arrays.sort(stra1);
		 Arrays.sort(stra2);
		 
		 
		 str1=new String(stra1);
		 str2=new String(stra2);
		 
	if(str1.equals(str2)) {
		System.out.println("the given Strings  is anagram");
	}
	else {
		System.out.println("the given Strings  is not anagram");
	}
	}
}
