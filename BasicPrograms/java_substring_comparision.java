import java.util.Scanner;
public class java_substring_comparision {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String arr[]=new String[s.length()-(k-1)];
       for(int i=0;i<arr.length;i++){
           arr[i]=s.substring(i,i+k);
            // System.out.println(arr[i]);
       }
    //    Arrays.sort(arr);
       
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i].compareTo(arr[j])>0){
                   String temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
       smallest=arr[0];
       largest=arr[arr.length-1];
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava",3));
    }
}
