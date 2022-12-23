import java.util.Scanner;

public class neon_number {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        int n =in.nextInt();
        int m=n*n;
        int a,sum=0;
        while(m>0){
            a=m%10;
            sum+=a;
            m=m/10;
        }
        if(n==sum){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
}
