/*
 * one time password generator
 */
import java.util.*;
public class One_time_password_generator {

	public static String output="";
	public static int count(String ano,int i,int n ) {
		int sum = 0;int s=0;
		int rev, a=0;
		for(int j=i;j<=n;j++) {
			 sum+=ano.charAt(j)-'0';
		}
		for(;;) {
		if(sum/10>0) {
			a=sum;
			while(a>0) {
				if(a%10==0) {
					a=a/10;
					s=a;
					break;
				}
				rev=a%10;
				s+=rev;
				a=a/10;
			}
			sum=s;
		}else {
			break;}
		}
		return sum;
	}
	
	public static void userMethod(String name, long accno, String type ) {
		int len=name.length();
		String accnostr=Long.toString(accno);
		int lenaccno=accnostr.length();

		if(len>2) {
			if(11==lenaccno) {
				if(type.equals("Current")||type.equals("Loan")||type.equals("Savings")) {
				
						for(int j=0;j<2;j++) {
							output=output+type.charAt(j);
						}
						output+=accnostr.charAt(0);
						int sum=count(accnostr,0,4);
						output+=Integer.toString(sum);
						output+=name.charAt(0);
						sum=count(accnostr,5,9);
						output+=Integer.toString(sum);
						output+=name.charAt(len-1);
						output+=accnostr.charAt(lenaccno-1);
				}
				else {
					output="invalide account type";
				}
			}else {
				output="invalide account number";
			}
		}else {
			output="invalide account name";
		}
		
	}
	
	public static String uppercase(String name) {
	    String firstLetter = name.substring(0, 1);
	    String remainingLetters = name.substring(1, name.length());

	    firstLetter = firstLetter.toUpperCase();

	    name = firstLetter + remainingLetters;
	    return name;
	}
	
	public static void main( String [] args ) {
			try(Scanner in=new Scanner(System.in)){
				
				System.out.print("enter your name :");
				String name=in.nextLine();
				System.out.print("enter Account type  :");

				String acctype=in.nextLine();
				
				System.out.print("enter Account number  :");
				long accno=in.nextLong();
				
				name=uppercase(name);
				acctype=uppercase(acctype);

	
				userMethod(name,accno,acctype);		
				System.out.println( output); //Check the output value
			}
			}

}
