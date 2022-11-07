import java.util.*;
public class print_matrix_in_snake_pattern {
    static Scanner in =new Scanner(System.in);
    public static void  ascending(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
                i=-1;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.print("\t");
    }
    public static void  decending(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
                i=-1;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.print("\t");
    }

    public static void main(String[] args) {
        // int arr[][] =new int[1][3];
        boolean res=true;
        int arr[][]={ {10, 20,40, 30,},{15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
        
        for (int[] is : arr) {
            if(res){
                ascending(is);
                res=false;
            }
            else{
                decending(is);
                res=true;
            }
        }
    }
} 
    