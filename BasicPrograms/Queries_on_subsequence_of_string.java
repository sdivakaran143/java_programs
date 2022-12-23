import java.util.*;
public class Queries_on_subsequence_of_string {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the String to check : ");
        String str = in.nextLine();
        String arr[] ={"gg","gro","gfg","orf"};
        for (int i = 0; i < arr.length; i++) {
            int k=0;String str1 =str;
            for (int j = 0; j < arr[i].length(); j++) {
                int m=str1.indexOf(arr[i].charAt(k));
                if(m!=-1){
                    str1=str1.substring(m+1); 
                }else{
                    System.out.println("No");break;
                }
                if(k==arr[i].length()-1){
                    System.out.println("Yes");break;
                }k++;
            }
        }    
    }
}