/*
 * convert number into positive to negative || negative to positive
 */
import java.util.Scanner;

public class convert_positive_to_negative_and_negative_to_positive {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter the value : ");
			int a=in.nextInt();
			int val=a;
			if(a<0) {
				val=a*(-1);
				System.out.println("the positive of "+a+" is "+val);

			}
			else if(a>0) {
				val=a*(0-1);
				System.out.println("the negetive of "+a+" is "+val);

			}
			
}
	}
}
