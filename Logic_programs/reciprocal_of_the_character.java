/*
 Given a string S, we need to find reciprocal of it. The reciprocal of the letter is
found by finding the difference between the position of the letter and first letter
‘A’. Then moving the same number of steps from letter ‘Z’. The character that
we reach after above steps is reciprocal.
Reciprocal of Z is A and vice versa because if you reverse the position of the
alphabet A will be in the position of Z. 
Similarly, T is the reciprocal of G, J is the reciprocal of Q.
Examples : 
 
Input : PRAKHAR
Output : KIZPSZI

 */
import java.util.*;
public class reciprocal_of_the_character {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        String output="";
        System.out.print("Enter the string : " );
        String str=in.nextLine().toUpperCase();
        for(int i=0;i<str.length();i++){
            char A=65;
            char Z=90;
            for(int j=1;j<27;j++){
            if(A==str.charAt(i)){
                output+=Z;
            }           
             A++;Z--;
          }
        }System.out.print("Output : "+output);
    }
}
