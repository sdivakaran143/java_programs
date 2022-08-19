import java.util.*;
public class next_greater_elements {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr ={9,9,4,2,8 ,0};
        boolean key =true;
        for(int i=0;i<arr.length;i++){
            key=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    System.out.println(arr[i]+" = "+arr[j]);
                    key=false;
                    break;
                }
            } 
            if(key && i==arr.length-1||key){
                System.out.println(arr[i]+" = -1");
                key=false;
            }
        }
    }
}
