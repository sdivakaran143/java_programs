import java.util.*;
public class Power_of_number_without_using_star_and_slash_Operator {
 static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the base :");
        int b=in.nextInt();
        System.out.print("enter the power :");
        int p=in.nextInt();
        int val=0,m=b;
        for (int i = 0; i < p; i++) {
            for (int j = 0; j <b; j++) {
                m+=m;
            }
            val+=m;
            m=val;
        }
        System.out.println(val);
    }   
}
