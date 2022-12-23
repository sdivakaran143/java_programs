/*
Create a java program to add two numbers to a specific target number using arrays.
(Eg)
Input:
Num={1,2,3,4,6,8} Target = 5
Output:
Index 0 = 1 Index 3 = 4
Index 1 = 2 Index 2 = 3
*/
import java.util.Scanner;
public class add_two_number_in_specific_target_in_array {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the size of array : ");
        int n=in.nextInt();
        System.out.print("enter the sum value : ");
        int val=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }int b=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==val&&j==0){
                    System.out.println("index : "+i+" = "+arr[i]);
                    b=1;
                }
                if(arr[i]+arr[j]==val){
                    System.out.println("index : "+i+" = "+arr[i]+"  index :"+j+" = "+arr[j]);
                    b=1;
                }
            }
            if(i==n-1 && b==0){
                System.out.println("there are no matching sum values in this array");
            }
        }
    }
}