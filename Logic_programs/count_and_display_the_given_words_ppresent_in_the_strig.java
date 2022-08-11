/*
 * Given an array of words and a string, we need to count all words that are
present in given string. Examples:
Input : words[] = { welcome,to,geeks,portal}
str = geeksforgeeks is a computer science portal for geeks.
Output : 2
Two words portal and geeksis present in str.
 */
import java.util.*;
public class count_and_display_the_given_words_ppresent_in_the_strig {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the n value ");
        int n=in.nextInt();
        String arr[] =new String[n];
        in.nextLine();
        System.out.println("Enter the Strings : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextLine();
        }
        System.out.print("Enter the String to check : ");
        String str=in.nextLine();
        int count=0;
        String ar[] =str.split(" ");
        String arr1[] =new String[100];

        for(int i=0;i<n;i++){
            for(int j=0;j<ar.length;j++){
                if(arr[i].equals(ar[j])) { 
                    arr1[count]="";
                    arr1[count]+=arr[i];
                    count++;
                } 
            }}
        System.out.println("Output : "+count);
        for(int i=0;i<count;i++){
            System.out.print(arr1[i]);
            if(i!=count-1){
                System.out.print(" and ");
            }
        } System.out.print(" are the words found in the string  ");

    }
    
}
