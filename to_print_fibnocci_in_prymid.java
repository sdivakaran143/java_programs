import java.util.*;
public class to_print_fibnocci_in_prymid {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the no of rows : ");
        int row =in.nextInt();
        int a=-1,b=1,n=0;
        while(true) {
            for (int i = 0; i < row-n; i++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n; j++) {
                int c=a+b;
                 System.out.printf("%-5s",c);
                 a=b;b=c;
            }
            System.out.println();
            if(n==row){
                break;
            }
            n++;
        }
    }
}
