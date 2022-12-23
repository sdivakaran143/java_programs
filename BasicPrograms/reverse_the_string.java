import java.util.*;
public class reverse_the_string {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        String output="";
        System.out.print("Enter the string : " );
        String str=in.nextLine();
        int j=0;
        for (int i=str.length()-1;i>=0;i--) {
            if(str.charAt(j)==' '){
                output+=" ";
            }
            if(Character.isAlphabetic(str.charAt(i))&&str.charAt(i)!=' '){
                output+=str.charAt(i);
            }
            j++;
        }System.out.println("OUTPUT : "+output);

    }
}