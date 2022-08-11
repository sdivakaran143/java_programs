import java.util.Scanner;
/**
 * String reversing by using loop and  StringBuilder
 */
public class string_reversing_by_using_loop_and_StringBuilder {
	public static void main(String[] args) {
	try(Scanner in =new Scanner(System.in)){
		System.out.print("Enter the string to reverse :");
		String str =in.nextLine();
		String rev="";
		for(int i=(str.length()-1);i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("\nthe reverse of the string is \""+rev+"\"\n");
		
		rev = new StringBuilder(str).reverse().toString();
		
		System.out.println("\nthe reverse of the string using reverse() is \""+rev+"\"\n");
		}
	}

}
