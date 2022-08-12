/*
 *Encoding the string
 */
import java.util.*;
public class Encoding_the_string {
	static  char[] arr=new char[27];
	 static char[] arr1=new char[27];
	static void assign() {
		int ch=97;
		for(int i=1;i<27;i++) {
			arr[i]=(char)ch;
			ch++;
		}ch=65;
		for(int i=1;i<27;i++) {
			arr1[i]=(char)ch;
			ch++;
		}
	}
	public static int key=0;
	public static String output="";
	public static void keyvalue(String inp) {
		for(int i=0;i<inp.length();i++) {
			char ch=inp.charAt(i);
			if(Character.isDigit(ch)) {
				int v=ch-'0';
				v=v*v;
				key+=v;
			}
		}
	}
	
	public static void encodeThreeStrings(String inp) {
		keyvalue(inp);
		assign();
		
		
		for(int i=0;i<inp.length();i++) {
			char ch=inp.charAt(i);						
			if(Character.isAlphabetic(ch)) {
				if(Character.isUpperCase(ch)) {
					for(int j=1;j<27;j++) {
					if(ch==arr1[j]) {
							output+=j;
							break;
						}
					}
				}else {
					for(int j=1;j<27;j++) {
						if(ch==arr[j]) {
								output+=j;
								break;

							}
						}
				}
			}
			else if(Character.isDigit(ch)) {
				int dig=ch-'0';
				dig+=key;
				while(dig>=27) {
					dig-=26;
				}
				char fn=arr[dig];
				
				try{
					if(Character.isAlphabetic(inp.charAt(i-1))) {
							if(Character.isLowerCase(inp.charAt(i-1))) {
									fn=Character.toLowerCase(fn);
							}else {
									fn=Character.toUpperCase(fn);
									}
				}}
				catch(Exception e){
					fn=Character.toUpperCase(fn);
				}
				if(i!=0&&Character.isDigit(inp.charAt(i-1))) {
					fn=Character.toUpperCase(fn);
				}
				output+=fn;	
			}
				
		}
	}

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the String :");
			String input=in.next();
			encodeThreeStrings(input);
			System.out.println("Output 1 :"+key);
			System.out.println("Output 2 :"+output);
		}
	}

}
