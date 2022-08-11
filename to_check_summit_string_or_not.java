/*
2. Given a string &#39;S&#39; , u need to tell whether it is &#39;sumit&#39;s string or not&#39;.
A string is called &#39;Sumit&#39;s String&#39; , if distance between adjacent character is 1. Consider that
the alphabets are arranged in cyclic manner from &#39;a&#39; to &#39;z&#39;. distance between any character &#39;x&#39;
and &#39;y&#39; will be defined as minimum number of steps it takes &#39;x&#39; to reach &#39;y&#39;. Here, character &#39;x&#39;
can start moving clockwise or anti-clockwise in order to reach at position where character &#39;y&#39;
is placed.
Print YES if it is Sumits string else print NO.
Input :A line contains a string(which contains a word).
Note: Input contains only lower case alphabets

Runtime Input :
    aba
Output :
    YES
 */
import java.util.*;
public class to_check_summit_string_or_not {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        String str =in.nextLine();boolean res=true;
        for(int i=0;i<str.length()-1;i++){
            if(Math.abs(str.charAt(i)-str.charAt(i+1))==1||Math.abs(str.charAt(i)-str.charAt(i+1))==25){
                continue;
            }
            else{
                res=false;
                break;
            }
        }
        if(res){
            System.out.println("Output : YES");
        }else{
            System.out.println("Output : NO");
        }
    }
    
}
