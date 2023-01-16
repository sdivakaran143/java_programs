import java.util.*;
public class Pig_Latin_Program {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("ENTER THE WORD :");
        String str=in.nextLine().toLowerCase();
        String vow="aeiou"; 
        int m=str.length();
        boolean available=false;
        for (int i = 0; i < vow.length(); i++) {
            char ch=vow.charAt(i);
            if(str.indexOf(ch)>-1){
                available=true;
                if(m>str.indexOf(ch)){
                    m=str.indexOf(ch);
                }
            }
         }
         if(available){
            String substr=str.substring(m);
            str=substr+str.substring(0,m);
            if(vow.contains(""+str.charAt(0))&&m==0){
                str+="yay";
            }else{
                str+="ay";
            }
         }
         else{
            str="Not Possible to generate Pig Latin Word";
         }
         System.out.println("OUTPUT : "+str);

        
    }
}
