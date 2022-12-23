public class wave_form {
    public static void main(String[] args) {
        int[] arr={7,8,4,5,6,3,2,1};
        
    //sort the array
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];    
                    arr[i]=arr[i]-arr[j];    
                }
            }
        }

    //swaps the values 
       for(int i=0;i<arr.length;i+=2){
           try {
               arr[i]=arr[i]+arr[i+1];
               arr[i+1]=arr[i]-arr[i+1];    
               arr[i]=arr[i]-arr[i+1];    

           } catch (Exception e) {}
       }
        for(int i :arr){
            System.out.print(i+" ");
        }
    }
}
