import java.util.*;
public class expression_valid_or_not {
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
			int bl=0,m=0;
			if(Character.isAlphabetic(str.charAt(0))&&Character.isAlphabetic(str.charAt(str.length()-1))||Character.isDigit(str.charAt(0))&&Character.isDigit(str.charAt(str.length()-1))||Character.isDigit(str.charAt(0))&&Character.isAlphabetic(str.charAt(str.length()-1))||Character.isAlphabetic(str.charAt(0))&&Character.isDigit(str.charAt(str.length()-1))||str.charAt(0)=='('||str.charAt(str.length()-1)==')') {
				for(int i=0;i<str.length();i++) {
					if(Character.isAlphabetic(str.charAt(i))||Character.isDigit(str.charAt(i))||str.charAt(i)=='('||str.charAt(i)==')'){
						m=0;
					}
					else{
						m++;
					}
					if(m>1){
						return bl=1;
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
		System.out.print("Enter the expression : ");
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
		System.out.print("valid");
		in.close();
	}

}
