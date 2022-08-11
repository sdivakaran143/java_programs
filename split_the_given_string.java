import java.util.*;
/*
 * string spliter
 */
public class split_the_given_string {

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the string");
			String str=in.nextLine();
			String[] s=str.split(" ");
			
			for(String i : s) {
				System.out.print("\n"+i);
			}
		}
	}

}
