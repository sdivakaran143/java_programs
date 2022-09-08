import java.util.*;
public class next_character_of_the_characters_in_the_string {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        String str=in.nextLine();

            for (int i = 0; i < str.length(); i++) {
                int ch=str.charAt(i);
                if(ch=='z'){System.out.print('a');continue;}
                else if(ch==' '){System.out.print(" ");continue;}
                System.out.print((char)(ch+=1));
            }

    }
}
