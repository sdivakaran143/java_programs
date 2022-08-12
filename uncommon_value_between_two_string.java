import java.util.*;
public class uncommon_value_between_two_string {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        String str1=in.nextLine();
        String str2=in.nextLine();
        String output="";
        if(str1.length()<str2.length()){
            String temp=str2;
            str2=str1;
            str1=temp;
        }
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            int o=str2.indexOf(ch);
            if(o==-1){
                output+=ch;
            }System.out.println(output);
    }
}}
