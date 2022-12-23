
/*to print n number of prime numbers 
*/
import java.util.Scanner;
public class n_number_of_primes {

	public static void main(String[] args) {
		try(Scanner in=new Scanner(System.in)){
			System.out.print("Enter the n value to find : ");
			int value=in.nextInt();
			int res=0;

	for(int j=0;j<=value;j++){
		if( j==0 || j==1 ){
			continue;
		}
		for(int i=2;i<j/2;i++){
		    res=0;
		    if(j%i==0){
		        res=1;
		    break;
		    }
		 }
		 if(res==0){
			 System.out.print(j+"\t");
		 }
		}
	}
	}

}
