/*
 1.)Given a string, check if all the characters of the string are the same or not.
    Examples: 
    Input : s = "geeks";
    Output : No

    Input : s = "gggg";
    Output : Yes
 */
import java.util.*;
public class character_of_strings_are_same_or_not {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        boolean res ;
        System.out.print("enter the String :");
        String str =in.nextLine();
        res=true;
        for(int i=1;i<str.length();i++){
            if(str.charAt(0)!=str.charAt(i)){
                res=false;
            }
        }
        if(res==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
