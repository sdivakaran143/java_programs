import java.util.*;
public class increase_and_decrese_of_numbers {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the inputs size :");
        int n=in.nextInt();
        while(n<2){
            System.out.print("Re-Enter the inputs size :");
             n=in.nextInt();
        }
        int arr[]=new int[n];
        System.out.println("Enter the inputs :");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Boolean res;
        if(arr[0]<arr[1]){
            res=true;
        }else{
            res=false;
        }
       
      for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]&&res==true){
              res=false;
            }else if(arr[i]>arr[i+1]&&res==false){
                res=true;
            }else{
                System.out.print("False!..");
                System.exit(0);
            }
        }
        System.out.print("True!..");
    }
}
