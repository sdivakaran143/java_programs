/**
Example 1
If input1=123, input2=456, input3=789, and input4=0
The result will be = 3 + 6 + 9 = 18
Example 2
If input1=123, input2=456, input3=789, and input4=1
The result will be = 2 + 5 + 8 = 15
Example 3
If input1=123, input2=456, input3=789, and input4=2
The result will be = 1 + 4 + 7 = 12
Exceptions/Constraints:
If the tens value is not available for any of the three numbers, i.e. if any of the three number is <10,
          we should use the value 1 for the tens value
If the hundreds value is not available for any of the three number, i.e if any of the three number is <100,
          we should use the value 2 for the hundreds value
 */
import java.util.Scanner;

public class Logic_program_sum_the_position_og_digit_in_three_numbers {
	static int sum=0;
	public static void mthd(int input1,int n) {
		if(input1<10&&n==1){
			sum+=1;
		}
		else if(input1<100&&n==2) {
				sum+=2;
		}else {
		for(int i=0;i<n;i++){
			input1=input1/10;
			}
		 sum+=input1%10;
		}
	}

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the value 1:");
			int input1=in.nextInt();
			
			System.out.print("enter the value 2:");
			int input2=in.nextInt();
			
			System.out.print("enter the value 3:");
			int input3=in.nextInt();
			
			System.out.print("enter the value:");
			int n=in.nextInt();
			
			mthd(input1,n);
			mthd(input2,n);
			mthd(input3,n);

			System.out.println("the sum is "+sum);

		}
	}

}
