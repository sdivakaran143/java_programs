import java.util.*;
public class find_the_nearst_largest_number {
    static Scanner in =new Scanner(System.in); 
    public static int[] arrayvalue(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        // int arr[]={14,15,16,10,13,19};
        // int arr[]={15,14,16,20,10};
        int arr[]=new int[5];
        arr=arrayvalue(arr);
        System.out.print("output : ");
        if(arr[0]>arr[1])
            System.out.println(arr[0]);
        else if(arr[arr.length-1]>arr[arr.length-2])
            System.out.println(arr[arr.length-1]);
        else{ 

            for (int i = 1; i < arr.length-1; i++) {
                    if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
                        System.out.println(arr[i]);
                        break;
                    }
            }
       
        }
    }
}
