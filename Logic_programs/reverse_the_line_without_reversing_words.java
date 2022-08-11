/*
Let the input string be “i like this program very much”. The function should
change the string to “much very program this like i”
output
Enter the String : i love java
Output : java love i
 */
import java.util.*;
public class reverse_the_line_without_reversing_words {
    static Scanner in = new Scanner(System.in);
    static String output="";
    public static void mail(String str){
        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>-1;i--){
            output+=arr[i]+" ";
        }
    }
    public static void read(){
    System.out.println("Output : "+output);
    }
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        String str=in.nextLine();
        mail(str);
        read();
    }
}
