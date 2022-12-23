import java.util.*;
public class sort_the_string_array {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        int n=in.nextInt();
        String[] arr=new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.next();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(0<(arr[i].toLowerCase()).compareTo(arr[j].toLowerCase())){
                    String temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("The sorted array Values are : ");
        for (String string : arr) {
            System.out.println("\t"+string);
        }

    }
}
