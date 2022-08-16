/*
 * Email validation
 */
import java.util.*;
public class email_id_validation {
	static String lchr="", num="";
	static String output="valid"; 
	public static void validate2(String mailid) {
		String as="@.";
		int f=0,l=0,r=0;
			for(int i=0;i<mailid.length();i++) {
				if(as.charAt(0)==mailid.charAt(i)) {
					if(r==0) {
					f=i;r++;}
					else {
						output="not valid";
					}
				}
				if(as.charAt(1)==mailid.charAt(i)) {
					l=i;
					try{if((mailid.length()-1)<1&&Character.isAlphabetic(mailid.charAt(i+1))||Character.isAlphabetic(mailid.charAt(i+2))){}
					else {output="not valid";}}catch(Exception e){output="not valid";}
				}
				else{
					if(i!=mailid.length()-1) {
						if(mailid.charAt(i+1)!=as.charAt(0)&&mailid.charAt(i+1)!=as.charAt(1)){
					try{if(Character.isAlphabetic(mailid.charAt(i+1))||Character.isDigit(mailid.charAt(i+1))){}
					else {output="not valid";}
					}catch(Exception e){output="not valid";}}
					}
				}
		}
		if(Character.isAlphabetic(mailid.charAt(f+1))){}
		else {output="not valid";}
		
		if(f>l||f==0||l==0){
			output="not valid";
		}
		if(f>64){
			output="not valid";
		}


	}
	public static void validate1(String mailid) {
		for(int i=0;i<mailid.length();i++){
			char ch=mailid.charAt(i);
			if(Character.isAlphabetic(ch)) {
				if(Character.isLowerCase(ch)) {
					lchr+=ch;
				}
				else if(Character.isUpperCase(ch)){
					output="not valid";
					break;
				}
			}else if(Character.isDigit(ch)){
				num+=ch;
			}

		}
		if(Character.isAlphabetic(mailid.charAt(0))&&Character.isAlphabetic(mailid.charAt(mailid.length()-1))
				||Character.isDigit(mailid.charAt(0))&&Character.isAlphabetic(mailid.charAt(mailid.length()-1))){
		}
		else {
			output="not valid";
		}
		
	}

	public static void main(String[] args) {
		try(Scanner in=new Scanner(System.in)){
			System.out.print("Enter E-Mail ID :");
			String mailid=in.nextLine();
			validate1(mailid);
			validate2(mailid);
			System.out.print("Output :"+output);

		}
	}

}
