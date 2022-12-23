/*
 * replace the word by replacement word in a string
 * by using replace method 
 */
import java.util.Scanner;

public class replace_a_word_in_a_string {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        String str=in.nextLine();
        System.out.print("Enter the target string : ");
        String target =in.nextLine();
        System.out.print("Enter replacement the string : ");
        String repalcement =in.nextLine();
        str=str.replace(target,repalcement);
        System.out.println("the modified string is :"+str);
    }
}
