import java.util.*;
public class Array_find_prime_number {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enTER THE n value :");
        int n=in.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        boolean res=true;
        System.out.print("the prime Numbers ARe :\n\t");
        for (int i = 0; i < arr.length; i++) {
            res=true;
            for (int j = 2; j <=arr[i]/2; j++) {
                if(arr[i]%j==0){
                    res=false;
                    break;
                }
            }
            if (res&&arr[i]!=1) {
                System.out.print(arr[i]+"\t");
            }
        }
    }
}
