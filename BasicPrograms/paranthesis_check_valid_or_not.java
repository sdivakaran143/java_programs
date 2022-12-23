import java.util.*;
public class paranthesis_check_valid_or_not {
		public static int brackets_check(String str) {
			int bl=0;
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(ch=='(') {
					bl++;
				}
				if(ch==')') {
					bl--;
				}
				if(bl<0) {
				break;
				}
			}
			return bl;
		}
		
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int bl=0,br=0;
		System.out.print("Enter The Expression :");
		String str =in.nextLine();
		bl=brackets_check(str);
		
		if(bl!=br) {
			System.out.print("Not valid");
			System.exit(0);
		}
		System.out.print("valid");
		
		in.close();
	}

}
