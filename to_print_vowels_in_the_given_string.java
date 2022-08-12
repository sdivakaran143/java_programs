import java.util.Scanner;

/**
 * print vowels in the given string
 */
public class to_print_vowels_in_the_given_string {

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){

		String v="aeiou";
		System.out.print("enter the string :");
		String str =in.nextLine();
		System.out.println("the vowels in the string "+str+" is :");
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<v.length();j++) {
				if(str.charAt(i)==v.charAt(j)){
					System.out.print("\t"+v.charAt(j));
				}

			}
		}
		
		}
	}

}
