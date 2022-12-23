
/* to find given number is prime number or not
*/
import java.util.Scanner;
public class given_number_is_prime_or_not {

	public static void main(String[] args) {
		try(Scanner in=new Scanner(System.in)){
			System.out.print("Enter the value to find : ");
			int value=in.nextInt();
			int res=0;
		for(int i=2;i<value/2;i++){
		    res=0;
		    if(value%i==0){
		        res=1;
		    break;
		    }
		 }
		 if(res==0){
			 System.out.println(value+" is  prime number");
		 }
		 else{
		    System.out.println(value+" is not prime number");
		 	}
		}
	}

}
