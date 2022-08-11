/*
 * Write a java program to check if two given String is the anagram of each other
 */

import java.util.*;
public class Given_string_is_annagram_or_not_1 {
	static Scanner in =new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.print("Enter the String 1 :");
		String str1=in.nextLine().toLowerCase();
		
		System.out.print("Enter the String 2 :");
		String str2=in.nextLine().toLowerCase();
		String s=str2;
		boolean res = true;
			int n=str1.length();
			for(int i=0;i<n;i++){
				char ch= str1.charAt(i);
				if(Character.isAlphabetic(ch)) {
				int index = str2.indexOf(ch);
				if(index<0) {
					res=false;
					break;
				}
				StringBuilder sb =new StringBuilder(str2);
				sb.deleteCharAt(index);
				str2=sb.toString();
				}
			}
		if(res==true) {
			System.out.println("the given Strings \""+str1+"\" & \""+s+ "\" is anagram");
		}
		else {
			System.out.println("the given Strings \""+str1+" & \""+s+"\" is not anagram");
		}
		
	}

}
