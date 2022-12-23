import java.util.*;
public class prime_input1_to_input3_harish_method {
	static Scanner in =new Scanner(System.in);
	static boolean CheckPrime(int n) {
		for(int i=2;i*i<=n;i++){
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.print("Enter the Start 1: ");
		int start =in.nextInt();
		System.out.print("Enter the Start 1: ");
		int stop =in.nextInt();
		System.out.print("the prime Numbers Are : ");
		for(int i=start ;i<=stop ;i++){
			if(i==0||i==1){continue;}
			else if(CheckPrime(i)){
				System.out.print(i+" ");
			}
		}
	}

}
