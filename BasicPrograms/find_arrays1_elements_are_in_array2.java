import java.util.*;
public class find_arrays1_elements_are_in_array2 {
    static Scanner in =new Scanner(System.in);

    public static void main(String[] args) {
          System.out.print("Enter the size of the array1: ");
          int n=in.nextInt();
          int[] arr=new int[n];
          for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
          }

        System.out.print("Enter the size of the array2: ");
        n=in.nextInt();
        int[] arr2=new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i]=in.nextInt();
            }
        Boolean res;
        for (int i = 0; i < arr.length; i++) {
            res=false;;
            for (int j = 0; j <arr2.length; j++) {
                if(arr[i]==arr2[j]){
                    res=true;
                }
            }
            if(!res){
                System.out.println("False...");
                System.exit(0);
            }
        }
        System.out.println("True...");
    }
}
