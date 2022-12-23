/*
 * square_root of the number
 */
import java.util.Scanner;

public class square_root_of_the_number {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("enter the value :");
			int a=in.nextInt();
			double sqrt = a / 2;
			double t = 0;

			    while(sqrt!=t){
			        t=sqrt;
			        sqrt=(a/t+t)/2;
			    }
		System.out.println("the squqre root of "+a+" is "+sqrt);
		
		System.out.println("the squqre root of "+a+" is "+Math.sqrt(a));
		//java has a method math.sqrt() here 
		//i am used to verify the answer is correct or not
		}
	}
}
