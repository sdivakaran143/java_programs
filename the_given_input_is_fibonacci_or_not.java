import java.util.*;
public class the_given_input_is_fibonacci_or_not {
    static Scanner in= new Scanner(System.in);
    static void findIffibno(int val){
        int a=-1,b=1;
        for (int i = 0; i <10000; i++) {
            int c=a+b;
            if(c==val){
                System.out.println(val+" is the fibonacii number..");
                System.exit(0);
            }
            a=b;b=c;
        }
        System.out.println(val+" is the not a fibonacii number..");
    }
    public static void main(String[] args) {
        System.out.print("Enter the  value :");
        int n=in.nextInt();
        findIffibno(n);
    }
}
