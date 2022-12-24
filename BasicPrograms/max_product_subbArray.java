/**
 * max_product_subbArray
 */
public class max_product_subbArray {
    public static void main(String[] args) {
        // int arr[]={-1, 3, 10,0,2 };
        // int arr[]={2,-4,3,1,0,2,3,0,5};
        // int arr[]={-1, -3, -10, 0, 60 };
        int arr[]={ 6, -3, -10, 0, 2 };
        // int arr[]={ -2, -3, 0, -2, -40 };
        int max=0;
        int tempMax;
        for (int j = 0; j < arr.length; j++) {
            tempMax=arr[j];
            for (int i = j+1; i < arr.length; i++) {
                tempMax*=arr[i];
                if(tempMax>max){
                    max=tempMax;
                }
            }            
        }
        if(arr[arr.length-1]>max){
            max=arr[arr.length-1];
        }
        System.out.println("Output : "+max);
    }
}