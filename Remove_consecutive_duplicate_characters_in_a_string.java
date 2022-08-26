import java.util.*;
public class Remove_consecutive_duplicate_characters_in_a_string {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        String str =" "+in.nextLine()+" ";
        System.out.print("OUTPUT : ");
        for (int i = 1; i < str.length()-1; i++) {
            char ch=str.charAt(i);
            if(str.charAt(i-1)!=ch&&ch!=str.charAt(i+1)){
                System.out.print(ch);
            }
        }
    }
}
