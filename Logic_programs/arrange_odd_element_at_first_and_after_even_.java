import java.util.*;

public class arrange_odd_element_at_first_and_after_even_ {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("enter the size of the array : ");
        int n=in.nextInt();

        int arr[]= new int[n];

        System.out.print("enter the value to the array :");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        //Arrays.sort(arr);
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Output :");
        for(int i=0;i<arr.length;i++){
            if(min%2==0&&arr[i]%2==0){
                System.out.print(arr[i]+" ");
                arr[i]=-1;
            }if(min%2==1&&arr[i]%2==1){
                System.out.print(arr[i]+" ");
                arr[i]=-1;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>-1){
                System.out.print(arr[i]+" ");
            }
        
        }
    }
}
