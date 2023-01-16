import java.util.*;
public class ashok_program {
    static Scanner in =new Scanner(System.in);
    static char[] arr;
    public static int functionforcount(char ch){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print("enter the number : ");
        String str =in.nextLine();
        int initialcount=0;
        arr=str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                initialcount=functionforcount(arr[i]);
            }
            int dummycount=functionforcount(arr[i]);
            if(dummycount!=initialcount){
                System.out.println("OUTPUT : invalid");
                break;
            }
            if(i==arr.length-1){
                System.out.println("OUTPUT : valid");
            }
        }
    }
}
