/* 
que 1  https://docs.google.com/document/d/1NfK4CVwum6xU5qW8O53bc_8N2_lyBzAv/edit?usp=sharing&ouid=117349102085628447925&rtpof=true&sd=true

1.Given two strings, write a java program to print characters coming on only one of
the two strings (not both).
Note :
1.The input character may be repeated in that string. 
2.The input characters are in uppercase only.
3.If both the strings has same character then print 000.
Input
String 1 : AFW
String 2: BGF
Output
AWBG
Runtime Input :
AFAAW
BGFFB
Output :
AWBG
*/
import java.util.*;
public class uncommon_char_in_a_two_string {
    static Scanner in=new Scanner(System.in);
    
    public static String  chk(String temp,int m){
        String output="";
        for(int i=0;i<temp.length();i++){
            for(int j=0;j<temp.length();j++){
                if(temp.charAt(i)==temp.charAt(j)&& i!=j){
                    int ind=output.indexOf(temp.charAt(i));
                    if(ind==-1 && m==0){
                        output+=temp.charAt(i);
                    }
                    break;
                }
                if(j==temp.length()-1){
                    output+=temp.charAt(i);
                }
            }
        }
        return output;
    }
   
    public static void main(String[] args) {
        String str1=in.nextLine();
        String str2=in.nextLine();
        str1=chk(str1,0);
        str2=chk(str2,0);
        String temp =str1+str2;
        temp=chk(temp,1);

        System.out.println("Output : "+temp);
    }
}

/*
 * HARISH
 * AIOA
 * HRSO
 */