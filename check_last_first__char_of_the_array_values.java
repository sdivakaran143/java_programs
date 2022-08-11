/*.)Program to check first and last character of string should match with key value first and last character
i/p
key—programming
apple,ping,training,placement,planning,processing,task
o/p
ping
planning
processing
*/
import java.util.*;
public class check_last_first__char_of_the_array_values {
	static Scanner in =new Scanner(System.in); 

    public static void main(String[] args) {
        System.out.print("enter the main string : ");
		String str =in.nextLine();
 
        System.out.print("enter the count : ");
		int n =in.nextInt();
        String arr[] =new String[n];
        in.nextLine();
        System.out.println("enter the  strings :");
        for(int i=0;i<n;i++){
            arr[i]=in.nextLine();
        }in.nextLine();
        System.out.println("the matched strings are :");
        for(int i=0;i<n;i++){
            if(str.charAt(0)==arr[i].charAt(0) &&  str.charAt(str.length()-1)==arr[i].charAt(arr[i].length()-1)){
                System.out.println(arr[i]);
            }
        }

    }
}
