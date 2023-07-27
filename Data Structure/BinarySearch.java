import java.util.*;
public class BinarySearch{
    static int mvalue=0;
    static Scanner in =new Scanner(System.in);
    public static int search(int[] arr,int s,int l,int m,int val){
        if (arr[m]==val||arr[l]==val){
            if (arr[l]==val){
                mvalue=l;
            }
            return mvalue;
        }
        else{
            if(arr[m]>val) search(arr, s , m , m/2 , val);
            if(arr[m]<val) search(arr, m , l , ((l-m)/2)+m , val);
        }
        return mvalue;
    }
    public static void main(String[] args){
        int[] a={0,1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the Value to find : ");
        int val=in.nextInt();
        System.out.println(val+" found at Position "+search(a,0,a.length-1,(a.length-1)/2,val));
    }
}
