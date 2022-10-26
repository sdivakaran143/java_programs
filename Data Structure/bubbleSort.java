public class bubbleSort {
    public static void main(String[] args) {
        int[] arr= {10,55,22,66,88,25,6,54};
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
                i=-1;
            }
        }
        for (int i : arr) {
           System.out.println(i);
        }
    } 
}
