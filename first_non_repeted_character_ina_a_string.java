/*
 * program to print first non repeated character from String.
	i/p: hello
	o/p:h
 */
import java.util.*;
public class first_non_repeted_character_ina_a_string {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		String nr="";
		System.out.print("Enter the string :");
		String str=in.nextLine();
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)&&i!=j){
					break;
				}
				if(j==str.length()-1) {
					nr+=str.charAt(i);
				}
			}
		}
		System.out.println("the first non reapeted element in string is : "+nr);
	}
}
