import java.util.*;
public class sumed_partitioned_into_two_subsets_equals_sumed_combination {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr={1,2,4,7,5,3};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        sum=sum/2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    int s=arr[i]+arr[j2]+arr[j];
                    if (s==sum){ 
                        System.out.println(arr[i]+" "+arr[j2]+" "+arr[j]);
                    }
                }
            }
        }
    }
}
