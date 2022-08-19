import java.util.*;
public class tech_number {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        int n=in.nextInt();
        String str=""+n;
        int a= Integer.parseInt(str.substring(0,str.length()/2));
        int b= Integer.parseInt(str.substring(str.length()/2));
        int sum=a+b;
        sum=sum*sum;
        System.out.println(sum==n);
    }
}
