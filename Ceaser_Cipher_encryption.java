import java.util.*;
public class Ceaser_Cipher_encryption {
    static Scanner in =new Scanner(System.in); 
    public static void main(String[] args) {
        String strm =in.nextLine();
        String str=strm.toLowerCase();
        int n=5;
        String encstr="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            ch+=n;
            if(Character.isAlphabetic(ch)){}
            else{
                int j=ch-'z';
                ch=(char)('a'+(j-1));
            }
            if(Character.isUpperCase(strm.charAt(i))){
                ch=Character.toUpperCase(ch);
            }               
            encstr+=ch;
        }
    
        System.out.println(encstr);
    }
}
