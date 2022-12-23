import java.util.*;
public class sum_between_two_index_values {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the n value : ");
        int n=in.nextInt();
        int[] arr =new int[n];int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("eneter the start index :");
        int s =in.nextInt();
        System.out.print("eneter the stop index :");
        int st =in.nextInt();
        for (int i=s;i<=st;i++) {
            sum+=arr[i];
        }
        System.out.println("Output : "+sum);
    }
}
