import java.util.*;
public class next_greater_elements {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr ={4, 5, 2, 25};
        boolean key =true;
        for(int i=0;i<arr.length;i++){
            key=true;
            for(int j=i+1;i<arr.length;i++){
                if(arr[i]<arr[j]){
                    System.out.println(arr[i]+" = "+arr[j]);
                    key=false;
                    break;
                }
            } if(key && j==arr.length-1){
                System.out.println(arr[i]+" = -1");
            }
        }
    }
}
