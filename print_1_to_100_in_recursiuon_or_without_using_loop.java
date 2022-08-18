import java.util.*;
public class print_1_to_100_in_recursiuon_or_without_using_loop{
    public static void main(String[] args) {
        System.out.print("enter the Start value :");
        int s =in.nextInt();
        System.out.print("enter the Stop value :");
        int n =in.nextInt();
        rec(s,n);
    }
    static Scanner in =new Scanner(System.in); 
    public static int rec(int n,int t){
        if(n==t){
            System.out.println(n);
            return 0;
        }
        System.out.println(n);
        return rec(n+1, t);
    }
}
