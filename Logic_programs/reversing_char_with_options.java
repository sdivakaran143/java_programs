
/*
 *Reversing Words with options
 */
import java.util.*;
 
public class reversing_char_with_options {
	
	static Scanner in ;
	static String rev="";

	public static void reverse(String str) {
		String[] s=str.split(" ");
		for(String i:s) {
			rev=rev+new StringBuilder(i).reverse().toString()+" ";
		}
	}
	public static void reversewithoutcase(String str) {
		reverse(str);
		String[] stra=new String[str.length()];
		for(int i=0;i<str.length();i++) {
			char ch1 =rev.charAt(i);
			rev=rev.replace(ch1, Character.toLowerCase(ch1));
		}
		for(int i=0;i<rev.length();i++) {
			stra[i]=Character.toString(rev.charAt(i));
		}
		
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			char ch1 =stra[i].charAt(0);
			
			if(Character.isAlphabetic(ch1)) {
				if(Character.isUpperCase(ch)&&Character.isLowerCase(ch1)){
					
					stra[i]=Character.toString(Character.toUpperCase(ch1));
				}else if(Character.isUpperCase(ch1)&&Character.isLowerCase(ch)){
					stra[i]=Character.toString(Character.toUpperCase(ch1));
				} 
			}
			else {
				stra[i]=Character.toString(rev.charAt(i));
				continue;
			}
		}
		rev="";
		for(int i=0;i<stra.length-1;i++) {
			rev+=stra[i];
		}
		
		
	}
	public static void reversetoogle(String str) {
		reverse(str);
		String[] stra=new String[str.length()];
		for(int i=0;i<rev.length();i++) {
			stra[i]=Character.toString(rev.charAt(i));
		}
		for(int i=0;i<str.length();i++) {
			char ch1 =stra[i].charAt(0);
			
			if(Character.isAlphabetic(ch1)) {
				if(Character.isLowerCase(ch1)){
					stra[i]=Character.toString(Character.toUpperCase(ch1));
				}else if(Character.isUpperCase(ch1)){
					stra[i]=Character.toString(Character.toLowerCase(ch1));
				} 
			}
			else {
				stra[i]=Character.toString(rev.charAt(i));
				continue;
			}
		}
		rev="";
		for(int i=0;i<stra.length-1;i++) {
			rev+=stra[i];
		}
	}

	public static void reverseWordsAndCase(String str, int coptn) {
		str+=" ";
		while(2<coptn|| 0>coptn) {
			System.out.println("enter the valid option 0,1,2 :");
			coptn=in.nextInt();
			}
		switch(coptn) {
		case 0 :
			reverse(str);
			break;
		case 1:
			reversewithoutcase(str);
			break;
		case 2:
			reversetoogle(str);
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		in=new Scanner(System.in);
		String str=in.nextLine();
		int optn=in.nextInt();
		reverseWordsAndCase(str, optn);
		System.out.println("The Give String is :\t"+str);
		
		System.out.println("\nOutput :\t\t"+rev);
		
	}
	
}
