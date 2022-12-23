/*
 * gcd and lcm of the values 
 */
import java.util.Scanner;

public class gcd_and_lcm_of_the_values {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter the num1 :");
			int num1=in.nextInt();
			System.out.print("Enter the num2 :");
			int num2=in.nextInt();
			int lcm=2;
			for(;;) {
				if (lcm%num1 == 0 && lcm%num2 == 0) {
					//System.out.println("the lcm of "+num1+" & "+num2+" is "+lcm);
					break;
				}
				lcm++;
			}
			int gcd=(num1*num2)/lcm;
			System.out.println("the gcd of "+num1+" & "+num2+" is "+gcd);
		}
	}
	
}	
