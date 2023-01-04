import java.util.*;
public class longest_consecutive_elements_in_array {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        // int arr[]={49, 1, 3, 200, 2, 4, 70, 5};
        int arr[]={1,2,3,4,5,6,17,18,19,20,21,22,23,45};
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
                i=-1;
            }
        }
        HashMap<Integer,int[]> hm=new HashMap<Integer,int[]>();
        int g=arr[1]-arr[0];
        int h=0,max=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(g!=arr[i+1]-arr[i]){
                int temp[]=new int[i-h];
                for (int j = 0,j2 = h; j <temp.length;j2++,j++) {
                        temp[j]=arr[j2];
                }
                if(max<temp.length){
                    max=temp.length;
                    hm.put(temp.length,temp);
                }
                g=arr[i+1]-arr[i];
                h=i;
            }
        }
        for (int i : hm.keySet()) {
            if(hm.get(i).length==max){
                for (int v : hm.get(i)) {
                    System.out.println(v);
                }
            }
        }
    }
}
