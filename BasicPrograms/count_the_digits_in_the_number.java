
/*number of digit
*/
import java.util.Scanner;
public class count_the_digits_in_the_number {

	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			System.out.print("enter the value: ");
			int num =in.nextInt();
			int a=num;
			int count = 0;
			while(a>0){
				a=a/10;
				count++;
			}
			System.out.println("the value "+num+" contains "+count+" digts");
			
		}

	}

}
