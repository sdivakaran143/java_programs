import java.util.Scanner;

/**
 * Password Validation
 */
/*
 * check https://telegra.ph/Password-Validation-07-16
 */
public class password_validation {
	static int valid=1;
	
	public static void minimum_conditions_check(String str) {
		String uchr="";
		String lchr="";
		String chr="";
		String schr="";
		String num="";
		
		for(int i=0;i<str.length();i++){
			int val=(int)str.charAt(i);
			
			if(64<val&&val<91||96<val&&val<123){
				chr=chr+str.charAt(i);
				if(64<val&&val<91){
					uchr=uchr+str.charAt(i);
				}
				if(96<val&&val<123){
					lchr=lchr+str.charAt(i);
				}
			}
			else if(47<val&&58>val){
				num=num+str.charAt(i);
			}
			else if(31<val&&val<48||57<val&&val<65||90<val&&val<97){
				schr=schr+str.charAt(i);
			}
			
		}
		

		if(uchr.length()<1){
			 valid=0;
		}
		if(lchr.length()<2){
			 valid=0;
		}
		if(chr.length()<3){
			 valid=0;
		}
		if(schr.length()<1){
			 valid=0;
		}
		if(num.length()<2){
			 valid=0;
		}
	}
	
	public static void start_and_end_check(String str,int n) {
		int v=(int)str.charAt(n-1);
		if((31<v&&v<48||57<v&&v<65||90<v&&v<97)) {}
		else {
			valid=0;
		}
		v=(int)str.charAt(0);
		if(64<v&&v<91||96<v&&v<123){}
		else {
			valid=0;
		}
	}
	public static void check_repetation(String str) {
		for(int i=1;i<str.length();i++){
			int val=(int)str.charAt(i);
			if(64<val&&val<91||96<val&&val<123){
				if(64<val&&val<91){
					if(str.charAt(i)==str.charAt(i-1) && str.charAt(i)==str.charAt(i+1)) {
						 valid=0;
					}
				}
				if(96<val&&val<123){
					if(str.charAt(i)==str.charAt(i-1) && str.charAt(i)==str.charAt(i+1)) {
						 valid=0;
					}
				}
			}
		}
	}
	public static void length_condition(int n) {
		if(n<8 && n>28) {
			 valid=0;
		}
	}
	public static void main(String[] args) {
		
		try(Scanner in =new Scanner(System.in)){

			System.out.print("Enter the password for validation : ");
			String str=in.nextLine();
			int n=str.length();
			
			length_condition(n);
			minimum_conditions_check(str);
			start_and_end_check(str,n);
			check_repetation(str);
			if(valid==1) {
				System.out.println("\nvalid");
				}else {
					System.out.println("\nNot valid");
				}
		}

	}

}
