import java.util.*;
public class LinnerSearch{
    static int mvalue=0;
    static Scanner in =new Scanner(System.in);
    public static int search(int[] arr,int val){
        int position=-1;
        for(int i=0;i<arr.length;i++){
            if(val==arr[i])
                return i;
        }
        return position;
    }
    public static void main(String[] args){
        int[] a={0,1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the Value to find : ");
        int val=in.nextInt();
        System.out.println(val+" found at Position "+search(a,val));
    }
}
