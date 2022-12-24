public class maximum_weight_ratio {
    public static void main(String[] args) {
        int arr[] = {4, 8,9};
        int arr1[] = {2, 4, 6};
        double k = 2;
        double max=0;
        for (int i = 0; i < arr1.length; i++) {
            double v1=arr[i],v2=arr1[i];
            for (int j = i; j < arr1.length; j++) {
                if(v1/v2==(double)k){
                    if(max<v1){
                        max=v1;
                    }
                }
               try {
                v1=arr[i]+arr[j+1];
                v2=arr1[i]+arr1[j+1];
               } catch (Exception e) {}
            }
        }
        System.out.println("Output : "+(int)max);
    }
}
