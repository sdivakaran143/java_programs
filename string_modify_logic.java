/*
4.) String being given as input(which contains multiple words) and modify it using the
following algorithm. Replace every letter in the string with the letter following it in the
alphabet (ie. a becomes b,b becomes c,c becomes d,.... z becomes a). Then
capitalize every vowel in this new string (a, e, i, o, u) and finally print this modified
string. If the input string contains non-alphabetic characters then do not change it.
Note1: If the given input string is not having any alphabetic character, then print
NON-ALPHABETIC
Note2: Do not consider the cases in input but in output expect vowel other
characters should be lowercase.

Runtime Input :
hello
Output :
Ifmmp

*/
import java.util.*;
public class string_modify_logic {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        Boolean t=true;
        String output="";char ch;String vow="aeiou";
        String str=in.nextLine().toLowerCase();
        for(int i=0;i<str.length();i++){
            int asci=str.charAt(i);
            ch=(char)(asci);
            
            if(Character.isAlphabetic(str.charAt(i))){
            if(asci==122){
                ch=97;
            }else{
                ch=(char)(asci+1);
            }
            t=false;
        }
        output+=ch;
        if(t&&i==str.length()-1){
            output="Non-albhabetic";
        }
        }
        if(t==false){
        for(int i=0;i<output.length();i++){
            for(int j=0;j<vow.length();j++){
                if(output.charAt(i)==vow.charAt(j)){
                    output=output.substring(0, i)+Character.toUpperCase(output.charAt(i))+output.substring(i+1);
                }
            }
        }}
        System.out.print("Output :"+output);
    }
}
