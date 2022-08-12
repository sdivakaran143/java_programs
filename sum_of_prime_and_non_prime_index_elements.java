
/*sum of prime number index elements and non prime index elements
*/
import java.util.Scanner;
public class sum_of_prime_and_non_prime_index_elements {

	public static void main(String[] args) {
		try(Scanner in=new Scanner(System.in)){
			System.out.print("Enter the n value of array : ");
			int n=in.nextInt();
			int res=0;
			int sum=0;
			int sum1=0;
			int[] arr=new int[n];

			for(int i=0;i<n;i++){
				System.out.print("\nenter the value "+i+" : ");
				arr[i]=in.nextInt();
			}
			System.out.print("\nthe prime indexed values are : \n\t");
	for(int j=0;j<n;j++){
		if( j==0 || j==1 ){
			sum1=sum1+arr[j];
			continue;
		}
		for(int i=2;i<=j/2;i++){
		    res=0;
		    if(j%i==0){
		        res=1;
		    break;
		    }
		 }
		 if(res==0){
			 System.out.print(arr[j]+"\t");
			 sum+=arr[j];
		 }
		 else if(res==1){
			 sum1+=arr[j];
		 }
		}
	System.out.print("\n\nthe sum of the prime indexed value is : "+sum);
	System.out.print("\nthe sum of the non-prime indexed value is : "+sum1);
	}
	}
}
