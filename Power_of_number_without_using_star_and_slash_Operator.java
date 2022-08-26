import java.util.*;
public class Power_of_number_without_using_star_and_slash_Operator {
 static Scanner in =new Scanner(System.in);
        public static int mul(int val,int times) {
            int n=val;
               for (int j = 1; j <times; j++) {
                   val+=n;
               }
               return val;
        }
    public static void main(String[] args) {
        System.out.print("enter the base :");
        int b=in.nextInt();
        System.out.print("enter the power :");
        int p=in.nextInt();
        int val=b;
        for (int i = 1; i <p; i++) {
            //val=val*b;
            val=mul(val, b);
        }
        System.out.println("The value of "+b+" power "+p+" is "+val);
    }   
}
