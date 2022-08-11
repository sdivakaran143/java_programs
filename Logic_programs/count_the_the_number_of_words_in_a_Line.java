/*
 * Create a java program to count number of words in a line.
 */
import java.util.*;
public class count_the_the_number_of_words_in_a_Line {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter input  :");
		String line =in.nextLine();
		String[] l=line.split(" ");
		int i=l.length;
	
		System.out.println("there are "+i+" words in line");
	}
}
