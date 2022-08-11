/*
 * replace the vowels in the string
 */
import java.util.*;
public class replace_the_vowels_in_the_String {

	public static void main(String[] args) {
		try(Scanner in=new Scanner(System.in)){
		String v="aeiou";
		System.out.print("enter the string :");
		String str =in.nextLine();
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<v.length();j++) {
				if(str.charAt(i)==v.charAt(j)){
					str=str.replace(v.charAt(j),'*');
				}
			}

			}
		System.out.println("the replaced  string  is : "+str);

	}
	}
}
