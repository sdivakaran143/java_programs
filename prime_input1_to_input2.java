import java.util.*;
public class prime_input1_to_input2 {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the Start 1: ");
		int start =in.nextInt();
		System.out.print("Enter the Start 1: ");
		int stop =in.nextInt();
		boolean res=true;
		for(int i=start ;i<=stop ;i++){
			if(i==0||i==1){continue;}
			res=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					res=false;
					break;
				}
			}
			if(res) {
				System.out.print(i+" ");
			}
		}
	}

}
