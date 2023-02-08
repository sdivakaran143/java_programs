import java.util.*;
public class Build_Lowest_Number_by_Removing_n_digits {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        String str = "765028321";
                    //012345678
        // String str = "121198";
        int n = 5;
        char[] ch= str.toCharArray();
        Arrays.sort(ch);
        int len=str.length()-n;
        int arr[]=new int[ch.length];
        String str1=str;
        for (int i = 0,j=0; i < ch.length; i++) {
            int val=str.indexOf(ch[i],arr[j]);
            if(val!=-1){
                arr[j]=val;
                str=str.substring(0,arr[j])+"U"+str.substring(arr[j]+1);
                j++;
            }
        }
        String Output="";
        // Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            Output+=str1.charAt(arr[i]);

            // if(arr[i-1]<arr[i]){
            //     // Output+=str1.charAt(arr[i]);
            // }
        }
        System.out.println();
        System.out.println(Output);
    }
}
