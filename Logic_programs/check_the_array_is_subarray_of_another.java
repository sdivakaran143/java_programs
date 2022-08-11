/*
3.)Check whether an Array is Subarray of another
Array
Given two arrays A[] and B[] consisting of  and  integers. The task is to check
whether the array B[] is a  subarray  of the array A[] or not.
Examples:
Input : A[] = {2, 3, 0, 5, 1, 1, 2}, B[] = {3, 0, 5, 1}
Output : Yes
Input : A[] = {1, 2, 3, 4, 5}, B[] = {2, 5, 6}
Output : No
 */
import java.util.*;
public class check_the_array_is_subarray_of_another {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the source array size : ");
        int n1=in.nextInt();
        System.out.println("Enter the target array size : ");
        int n2=in.nextInt();

        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        System.out.println("Enter the source array values : ");
        for(int i=0;i<n1;i++){
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter the target array values : ");
        for(int i=0;i<n2;i++){
            arr2[i]=in.nextInt();
        }
    boolean res=true;
        for(int i=0;i<n2;i++){
            for(int j=0;j<n1;j++){
                if(arr2[i]==arr1[j]){
                    break;
                }
                if(j==n1-1){
                    res=false;
                }
            }
        }

        if(res){
            System.out.print("Output : Yes");
        }else{
            System.out.print("Output : No");
        }




    }
}
