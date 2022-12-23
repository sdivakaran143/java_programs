public class Sorting_Array_half_Asc_half_Desc {
    public static void main(String[] args) {
        int arr[]={ 1 , 7 , 4 , 23  ,65 , 2 , 12 , 45  ,18,  35};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]&&i<arr.length/2){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                if(arr[i]<arr[j]&&i>arr.length/2){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
