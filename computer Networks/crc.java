import java.util.*;
public class crc {
    static Scanner in =new Scanner(System.in);
    public static String divide(String val,String div){
        String n="";
        if((""+val).charAt(0)!='1'){
           div="0000";
        }
        for (int i = 0; i < 4; i++) {
            if((val).charAt(i)==(div).charAt(i)){
                n+=0;
            }else{
                n+=1;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        String m="1010000";
        String re="1010000000";
        int u=4;
            for (int i = 0; i < (m.length()-4)+4; i++) {
                re=divide(re, "1001"); 
                System.out.println(i+" ==> "+re);  
                if(re.charAt(0)=='0'&& i!=((m.length()-4)+3)){
                    re=re.substring(1)+m.charAt(u);
                }
                else{
                    System.out.println("the transmitted string is "+m+re);
                    m=m+re;break;
                }
            }
            
            System.out.print("enter the recived transmitee :");
            String fin=in.nextLine();
            if(fin.equals(m)){
                System.out.println("the code is transmitted without error....");
            }else{
                System.out.println("Error.....");
            }
    }
}
