/*
 * rotate the matrix in anti-clockwise or clockwise
 */
import java.util.*;
public class Rotatae_the_matrix_in_clockwise_or_anticlockwise {
	static 	String str="";
	public static void clockwise(int ch) {
		str=str.substring(str.length()-ch)+str.substring(0,str.length()-ch);
	}
	public static void anticlockwise(int ch) {
		str=str.substring(ch,str.length())+str.substring(0,ch);
	}
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			boolean check=true;
			System.out.print("enter the String : ");
			str =in.nextLine();
			System.out.print("enter count of char : ");
			int l=in.nextInt();
			while(check) {
				System.out.print("enter the (a/c) : ");
				char ch=in.next().charAt(0);
			switch(ch) {
				case 'c':
					clockwise(l);
					System.out.println(str);
					break;
				case 'a':
					anticlockwise(l);
					System.out.println(str);
					break;
				default:
					check=false;
					break;
			}
		}}
	}
}
