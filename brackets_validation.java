import java.util.*;
public class brackets_validation {
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
		
		public static int chechspclch(String str) {
			int bl=0;
			if(Character.isAlphabetic(str.charAt(0))&&Character.isAlphabetic(str.charAt(str.length()-1))||Character.isDigit(str.charAt(0))&&Character.isDigit(str.charAt(str.length()-1))) {
				for(int i=0;i<str.length();i++) {
					if(Character.isAlphabetic(str.charAt(i))||Character.isDigit(i)){
						
					}
					
				}
				
			}else {
				bl=1;
			}
			return bl;
		}
		
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int bl=0,br=0;
		String str =in.nextLine();
		bl=brackets_check(str);
		
		
		if(bl!=br) {
			System.out.print("Not valid");
			System.exit(0);
		}
		bl=chechspclch(str);
		if(bl!=br) {
			System.out.print("Not valid");
			System.exit(0);
		}
		
		in.close();
	}

}
