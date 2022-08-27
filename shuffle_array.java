import java.util.*;
public class shuffle_array {
    static Scanner in= new Scanner(System.in);
    public static void shuffle(int[] arr){
        Random ran =new Random();
        for (int i = 0; i < arr.length; i++) {
            int r=ran.nextInt(arr.length);
            int temp=arr[r];
            arr[r]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of the Array : ");
        int n=in.nextInt();
        int[] arr =new int[n];
        System.out.println("ENter the values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        shuffle(arr);
        System.out.println("The SHuffled Array is : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
