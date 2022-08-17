public class decreassing_array_2 {


 public static void main(String arg[]) {
  int arr[] = {12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101,99,74,0,-5};
  int totCount=0,digCount=0,count=0,max=0;
  for(int i=0;i<arr.length-1;i++) {
    int temp=arr[i];
    for(int j=i+1;j<arr.length;j++) {
        if(temp > arr[j]) {
            digCount++;
            count=1;
            temp = arr[j];  
        }
        else {
            break;
        }
    }i+=digCount;
        if(max < digCount+1) {
            max=digCount+1;
        }
        digCount=0;
        totCount+=count;
     count=0;
     }
        System.out.println(max);
        System.out.println(totCount);

 }

}

