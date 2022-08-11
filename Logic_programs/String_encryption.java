import java.util.Scanner;

/**
 * string Encryption 
 */
public class String_encryption{
	static char[] arr=new char[27];
	static char[] arr1=new char[27];
	static String output="";

	public static void mthd( int last,int i ,int lucase,int l) {
		int val=i-last;
		if(val==0||val<0) {
			val+=26;
		}
		if(l==1) {
			if(lucase==0) {
			output=output+arr[i];
			}else if(lucase==1) {
				output=output+arr1[i];
			}
		}
		if(lucase==0&&l==0) {
			output=output+arr[val];
		}else if(lucase==1&&l==0) {
			output=output+arr1[val];
		}
	}
	public static void userMethod( String str ) {

		int ch=97;
		
		for(int i=1;i<27;i++) {
			arr[i]=(char)ch;
			ch++;
		}ch=65;
		for(int i=1;i<27;i++) {
			arr1[i]=(char)ch;
			ch++;
		}
		int last = 0;
		int m=1;
		char gh;
		for(int i=1;i<27;i++) {
			gh=str.charAt(str.length()-m);
			
			if(Character.isAlphabetic(gh)) {
			 if(arr[i]==gh){last=i;
			 break;
			 }else if(arr1[i]==gh){
				 last=i;break;
			 }
			}
			else{
				 m++;
				 i=0;
			 }
		}
		int l=0;
		for(int i=0;i<str.length();i++) {
			for(int j=1;j<27;j++) {
				if(Character.isAlphabetic(str.charAt(i))) {
					if(i==str.length()-m) {
						l=1;
					}
					 if(str.charAt(i)==arr[j]) {
						mthd(last,j,0,l);
				
					 }else if(str.charAt(i)==arr1[j]) {
							mthd(last,j,1,l);
					 }
				}
			}
		}
		System.out.println("Output = "+output);
	}
	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the String to Encrypt : ");
			String str=in.nextLine();
			userMethod(str);
		}
	}

}
