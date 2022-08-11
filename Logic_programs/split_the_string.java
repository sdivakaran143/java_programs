/*
 * to splite the string by user inpuut
 */
import java.util.Scanner;
public class split_the_string {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.print("Enter the String :");
		String str=in.nextLine();
		System.out.print("Enter the num :");
		int k=in.nextInt();
		for(int i=0;i<k;i++) {
		str+=" ";}
		for(int i=0;i<str.length()-1;) {
			for(int j=0;j<k;j++) {
				System.out.print(str.charAt(i));
				i++;
			}
			System.out.print(" ");
		}
	}

}
