import java.util.Scanner;

/**
 * to print character ,numbers special character separately from a string 
 */


public class ro_seprate_character_specialCharacter_numbers_in_the_string {

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the string :");
			String str=in.nextLine();
			String chr="";
			String schr="";
			String num="";
			
			for(int i=0;i<str.length();i++){
				int val=(int)str.charAt(i);
				
				if(64<val&&val<91||96<val&&val<123){
					chr=chr+str.charAt(i);
				}
				else if(47<val&&58>val){
					num=num+str.charAt(i);
				}
				else if(31<val&&val<48||57<val&&val<65||90<val&&val<97){
					schr=schr+str.charAt(i);
				}
				
			}
			System.out.println("\nthe characters in this String :"+chr);
			System.out.println("the numbers in this String  :"+num);
			System.out.println("the special characters in this String :"+schr);
			

		}
	}

}
