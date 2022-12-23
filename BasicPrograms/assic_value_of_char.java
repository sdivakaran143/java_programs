/**
 * find the ASSIC value for the character
 */
import java.util.*;
public class assic_value_of_char {
	
	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the  character :");
			char ch=in.next().charAt(0);
			System.out.print("\n the ASSIC value of "+ch+" is "+(int)ch);
			
		}
	}
}