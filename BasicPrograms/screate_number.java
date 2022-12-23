import java.util.*;
public class screate_number {
    static Scanner in =new Scanner(System.in);
    static   String str1="",str2="";
    public static String place_fill(String str){
        while(str.length()!=4){
            str=" "+str;
        }
        return str;
    }
    public static int check_common(){
        int p=0;
        for (int i = 0 ;i < str1.length(); i++) {
            if(str1.charAt(i)==str2.charAt(i)){
                p++;
                str1= new StringBuffer(str1).replace(i, i+1, " ").toString();
                str2= new StringBuffer(str2).replace(i, i+1, " ").toString();
            }
        }
        return p;
    }
    public static void main(String[] args) {
        System.out.println("enter the value 1 : ");
        str1=in.next();
        System.out.println("enter the value 2 : ");
        str2=in.next();

        str2=place_fill(str2);
        str2=place_fill(str2);
        int p =check_common();
        str1=str1.replace(" ", "");
        str2=str2.replace(" ", "");

       int r=0;
       for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i)==str2.charAt(j)){
                    r++;
                    str1= new StringBuffer(str1).replace(i, i+1, " ").toString();
                    str2= new StringBuffer(str2).replace(j, j+1, " ").toString();
                    break;
                }
            }
       }
    System.out.println("Output : "+p+"P"+r+"R");
    }
}
