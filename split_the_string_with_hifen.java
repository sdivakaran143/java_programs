import java.util.*;
public class split_the_string_with_hifen{
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the String : ");
        String str=in.nextLine();
        System.out.print("Enter the split values : ");
        int spvalue=in.nextInt();
        //String str="2-5g-3-j-jjj";
        int m=0;
        str=str.replace("-", "");
        for (int i = 0; i < str.length(); i++) {
            if(m==spvalue){
                System.out.print("-");
                m=0;
            }
            System.out.print(str.charAt(i));
            m++;
        }
    }
}