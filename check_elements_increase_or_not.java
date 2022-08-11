import java.util.Scanner;

public class check_elements_increase_or_not {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the inputs size :");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the inputs :");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                System.out.print("False!..");
                System.exit(0);
            }
        }
        System.out.print("True!..");
    }
}
