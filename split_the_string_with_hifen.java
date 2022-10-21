import java.util.*;
public class split_the_string_with_hifen{
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        String str="2-5g-3-j-";int m=0;
        str=str.replace("-", "");
        for (int i = 0; i < str.length(); i++) {
            if(m==2){
                System.out.print("-");
                m=0;
            }
            System.out.print(str.charAt(i));
            m++;
        }
    }
}