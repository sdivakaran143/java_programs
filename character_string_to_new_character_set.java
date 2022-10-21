/*
Change string to a new character set
Given a 26 letter character set, which is equivalent to character set of English
alphabet i.e. (abcd….xyz) and act as a relation. We are also given several
sentences and we have to translate them with the help of given new character
set.
https://www.geeksforgeeks.org/change-string-to-a-new-character-set/?ref=lbp
Examples: 
New character set : qwertyuiopasdfghjklzxcvbnm
Input : utta;
Output : geek
 */
import java.util.*;
public class character_string_to_new_character_set {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        String string=   "qwertyuiopasdfghjklzxcvbnm";
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        System.out.print("Enter your input :");
        String str=in.nextLine().toLowerCase();
        System.out.print("OUTPUT  :  ");
        for (int i = 0; i < str.length(); i++) {
            int n=string.indexOf(str.charAt(i));
            System.out.print(alphabets.charAt(n));
        }
    }
}