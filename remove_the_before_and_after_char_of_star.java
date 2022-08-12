
/*
Remove the character before and after *.
i/p:
String s=&quot;abcd*efgh*de&quot;;
output::
abcfge
 */
import java.util.*;

public class remove_the_before_and_after_char_of_star {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='*'){
            str=str.substring(0, i)+str.substring(i+1);
            if(i==0){
                str=str.substring(i+1);
                i=0;
                continue;
            }
            if(i==str.length()-1){
                str=str.substring(0, i);
                i=0;
                continue;
            }
            else{
                str=str.substring(0, i-1)+str.substring(i+1);
                i=0;
            }
            } 
        }
        System.out.println("\nOutput : " + str);
    }
}