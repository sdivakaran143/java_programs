import java.util.Scanner;
/*
 * factorial of the given number
 */
public class factorial_of_the_given_number {

	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			System.out.print("enter the value : ");
			int a=in.nextInt();
			int n=a;
			int fact=1;
			while(n>0){
				fact*=n;
				n--;
			}
			System.out.println("the factorial of "+a+" is "+fact);
		
		}
	}

}
