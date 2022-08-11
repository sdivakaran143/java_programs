/*
Write a java program to find sum of digits in a string
(Eg)
Input : Wel387come
Output: 18
*/
import java.util.*;
public class sum_of_digits_in_a_string {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        String str =in.nextLine(); 
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                sum+=str.charAt(i)-'0';
            }
        }
        System.out.println("the sum of the digits in the string is : "+sum);
    }
}
