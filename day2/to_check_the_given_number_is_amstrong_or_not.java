/*
 * to check the given number is Armstrong or not
 * 
 */
import java.util.Scanner;

public class to_check_the_given_number_is_amstrong_or_not {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter the value : ");
			int a=in.nextInt();
			int ams=0,n=a,ln;
			while(a>0) {
				ln=a%10;
				ams+=(ln*ln*ln);
				a=a/10;
			}
			if(n==ams) {
				System.out.println("Its a armstrong");
			}
			else {
				System.out.println("Its not a armstrong");
			}
}
	}
}
