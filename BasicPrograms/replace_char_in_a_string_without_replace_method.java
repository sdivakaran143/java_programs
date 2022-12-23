
/*
 * replace the word by replacement word in a string
 * by without using replace method 
 */
import java.util.Scanner;

public class replace_char_in_a_string_without_replace_method {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        String str=in.nextLine();
        System.out.print("Enter the target string : ");
        String target =in.nextLine();
        System.out.print("Enter replacement the string : ");
        String repalcement =in.nextLine();
        String[] stra=str.split(" ");
        str="";
        for(String i: stra){
            if(i.equals(target)){
                i=repalcement;
            }
            str+=i+" ";
        }
        System.out.println("the modified string is :"+str);
    }
}
