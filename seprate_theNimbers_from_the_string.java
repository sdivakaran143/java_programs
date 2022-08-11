/*
 * to seperate numbers from a string 
 */
import java.util.Scanner;
public class seprate_theNimbers_from_the_string {
    static Scanner in =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the string :");
        String str=in.nextLine();
        int number=0;
        for(int i=0;i<str.length();i++){
            int as=str.charAt(i);
            if(47<as && as<58){
                number=(number*10)+str.charAt(i)-'0';
            }
        }
        System.out.println("numbers : "+number);
    }
    
}
