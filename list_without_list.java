/*
 * list words without list 
 */
import java.util.*;

public class list_without_list {
    static Scanner in =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("enter the size of input : ");
        int n=in.nextInt();
        String[] arr = new String[n];
        System.out.print("enter the key value : ");
        int v=in.nextInt();
        in.nextLine();
        if(v==0){
            System.out.println("invalid");
        }else{
        System.out.println("enter the values :");
        for(int i=0;i<n;i++){
            arr[i]=in.nextLine();
        }
        System.out.print("[");int p=0;
        for(int i=0;i<n;i++){
            if(arr[i].length()!=v){
            System.out.print("\""+arr[i]+"\"");
            p++;

            if(p>0&&i<n-1){
                System.out.print(",");
            }       
        }
            
        }     System.out.print("]");
    }
    }
}
