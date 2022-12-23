/*
 * to find the power of the number
 */
import java.util.Scanner;

public class power_of_the_number {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter the base :");
			int base=in.nextInt();
			System.out.print("Enter the power :");
			int pow=in.nextInt();
			int l=base;
		for(int i=0;i<pow-1;i++) {
				base*=l;
		}
		System.out.println("the value is "+base);
		}
	}	

}
