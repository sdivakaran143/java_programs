/*
 * swapping two values
 */
import java.util.Scanner;

public class Swap_two_variables_without_third_variable {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter the value A: ");
			int a=in.nextInt();
			System.out.print("Enter the value B: ");
			int b=in.nextInt();
			System.out.println("before swapping\nthe value of A is "+a+"\nthe value of B is "+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("\nafter swapping\nthe value of A is "+a+"\nthe value of B is "+b);
			
		}
	}
}

/*a=a+b;
b=a-b;
a=a-b;*//*
a=a+(b+c);
b=a-(b+c);
c=a-(b+c);
a=a-(b+c);*/