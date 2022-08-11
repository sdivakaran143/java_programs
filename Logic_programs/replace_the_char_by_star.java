/**
 * program to replace given key to ‘*’ in the string
	i/p
		String--Programming
		key---m	
	o/p
		Progra**ing

 */
import java.util.*;

public class replace_the_char_by_star {
	static Scanner in =new Scanner(System.in); 

	public static void main(String[] args) {
	    System.out.print("enter the main string : ");
			String str =in.nextLine();
		System.out.print("enter the key char : ");
		char key =in.next().charAt(0);

		//str=str.replace(key,'*');
		for(int i=0;i<str.length();i++) {
				if(key==str.charAt(i)) {
					str=str.substring(0, i)+"*"+str.substring(i+1);
				}
			}
			System.out.print("the modified string is "+str);
	}

}
