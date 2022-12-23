/*
 * String reversing and to find palindrom or not
 */
import java.util.Scanner;
public class String_reversing_and_palindrom_or_not {

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("Enter the string to reverse :");
			String str =in.nextLine();
			String rev="";
			for(int i=(str.length()-1);i>=0;i--) {
				rev=rev+str.charAt(i);
			}
			System.out.println("\nthe reverse of trhe string is \""+rev+"\"\n");
			if(str.equals(rev)) {
				System.out.println("Its palindrom");
			}else {
				System.out.println("Its not palindrom");
			}
		}
	}
}