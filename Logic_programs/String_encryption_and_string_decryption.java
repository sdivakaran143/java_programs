import java.util.Scanner;

/**
 * string Encryption  and Decryption
 */
public class String_encryption_and_string_decryption {
	static char[] arr=new char[27];
	static char[] arr1=new char[27];
	static String output="";
	
	public static void output(int lucase ,int i,int val,int l) {
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
	public static void mthd2( int last,int i ,int lucase,int l) {
		int val=i;
		
		for(int j=0;j<27;j++) {
			if(j-last==val||j-last+26==val) {
				i=j;
			}
		}
		output( lucase , val, i, l);
	}
	public static void mthd( int last,int i ,int lucase,int l) {
		int val=i-last;
		if(val==0||val<0) {
			val+=26;
		}
		output( lucase , i, val, l);
	}
	public static void userMethod( String str,int choice ) {

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
			 }else if(arr1[i]==gh) {
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
				l=0;
					if(i==str.length()-m) {
						l=1;
					}
					 if(str.charAt(i)==arr[j]) {
						if(choice==1) {
							mthd(last,j,0,l);
						}else {
							mthd2(last,j,0,l);
						}
					 }else if(str.charAt(i)==arr1[j]) {
						 if(choice==1) {
							mthd(last,j,1,l);
						 }else {
							mthd2(last,j,1,l);
						 }
					 }
				}
		}
		
		System.out.println("Output = "+output);
	}
	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			Boolean loop =true; 
			while(loop) {
			output="";
			String str;
			System.out.print("\n1) Encrypt\n2) Decrypt\nEnter your choice : ");
			int choice =in.nextInt();
			in.nextLine();
			switch(choice){
				case 1:
					System.out.print("\nEnter the String to Encrypt : ");
					str=in.nextLine();
					userMethod(str,choice);
					break;
					
				case 2:
					System.out.print("\nEnter the String to DEcrypt : ");
					str=in.nextLine();
					userMethod(str,choice);
					break;
					
				default:
					loop=false;
					System.out.println("Sucessfully Exited...");
					break;
			}
			}
		}
	}

}
