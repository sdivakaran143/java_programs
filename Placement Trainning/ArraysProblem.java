import java.util.*;
public class ArraysProblem {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();
        ////sort,product sum
        // int n=8;
        // int[] arr=new int[n]; 
        // int sum=0;
        // int pro=1;
        // System.out.println("Enter the inputs foe array : ");
        // for (int i = 0; i < n; i++) {
        //     arr[i]=in.nextInt();
        //     sum+=arr[i];
        //     pro*=arr[i];
        // }
        // System.out.println("sum:"+sum);
        // System.out.println("product:"+pro);

        // for (int i = 0; i < arr.length-1; i++) {
        //     if(arr[i]>arr[i+1]){
        //         int temp=arr[i];
        //         arr[i]=arr[i+1];
        //         arr[i+1]=temp;
        //         i=-1;
        //     }
        // }
        // System.out.print("sorted array:\n\t");
        // for (int i : arr) {
        //     System.out.print(i+"\t");
        // }

        //vowle or consonent
        char arr[]=("divakaran").toCharArray(); 
        String vwl="aeiou";
        for(int i=0;i<arr.length;i++){
            if(vwl.contains(""+arr[i])){
                System.out.print(arr[i]+" "); 
            }
        }
    }
}
