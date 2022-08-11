/**
program to count number of consonant and vowels in the given string

i/p
	Programming
o/p
	vowels count-3
 	consonant count-8

 */
import java.util.*;

public class count_consonant_and_vowels_in_the_string {
	static Scanner in =new Scanner(System.in); 
	public static void main(String[] args) {
		  System.out.print("enter the main string : ");
		  String str =in.nextLine().toLowerCase();
		  String vow="aeiou";
		  String vowels="";
		  String constant="";
		  for(int i=0;i<str.length();i++) {
			  if(Character.isAlphabetic(str.charAt(i))) {
				  if(vow.indexOf(str.charAt(i))>-1) {
					  vowels+=str.charAt(i);
				  }else {
					  constant+=str.charAt(i);
				  }
			}
		 }System.out.print("vowels count : "+vowels.length()+"\nconsonant count : "+constant.length());
	}

}
