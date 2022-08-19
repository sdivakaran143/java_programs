/*
 * User ID Generation
 */
import java.util.*;
public class user_Id_generation {
	static String output="";
	static int arr[]= new int[27];
	static int arr1[]= new int[27];
	public static void toggle() {
		for(int j=0;j<output.length();j++) {
			if(Character.isAlphabetic(output.charAt(j))) {
			if(Character.isUpperCase(output.charAt(j))){
				output=output.replace(output.charAt(j),Character.toLowerCase(output.charAt(j)));
			}else {
					output=output.replace(output.charAt(j),Character.toUpperCase(output.charAt(j)));
			}
		}
		}
	}
	public static void user_id_generation(String fname,String lname,int pin,int n){
		String sname="",gname="",strpin=Integer.toString(pin);

		if(fname.length()<lname.length()) {
			sname=fname;
			gname=lname;
		}else if(fname.length()>lname.length()) {
			sname=lname;
			gname=fname;
		}
		else {
			
			int ch=97;
			for(int j=1;j<27;j++) {
				arr[j]=(char)ch;
				ch++;
			}ch=65;
			for(int j=1;j<27;j++) {
				arr1[j]=(char)ch;
				ch++;
			}
		
			for(int i=0;i<fname.length();i++) {
				char ch1=fname.charAt(i);
				char ch2=lname.charAt(i);
				for(int j=0;j<27;j++) {
					if(ch1!=ch2) {
						if(ch1==arr[j]||ch1==arr1[j]) {
							sname=fname;
							gname=lname;
							i=fname.length();
							break;
						}else if(ch2==arr[j]||ch2==arr1[j]){
							sname=lname;
							gname=fname;
							i=fname.length();
							break;
						}
					}
				}
			}
		}
			
			output+=sname.charAt(sname.length()-1);
			output+=gname;
			output+=strpin.charAt(n-1);
			strpin=new StringBuilder(strpin).reverse().toString();
			output+=strpin.charAt(n-1);
			toggle();
		
	}
	
	public static void main(String[] args) {
		try(Scanner in=new Scanner(System.in)){
			System.out.print("enter your\nFirst name :");
			String fname=in.nextLine();
			System.out.print("Last name :");
			String lname=in.nextLine();
			System.out.print("Pin:");
			int pin=in.nextInt();
			System.out.print("N:");
			int n=in.nextInt();
			while(n>Integer.toString(pin).length()) {
				System.out.print("RE-enterPin value must be <"+Integer.toString(pin).length()+":");
				n=in.nextInt();
			}
			user_id_generation(fname,lname,pin,n);
			System.out.println("UserId : "+output);

		}
	}

}
