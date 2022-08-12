
/*
Remove the character before and after *.
i/p:
String s=&quot;abcd*efgh*de&quot;;
output::
abcfge
 */
import java.util.*;

public class prgm90 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        String str = in.nextLine();
        str = str.replace('*', ' ');
        String[] st = str.split(" ");
        st[0] = " " + st[0];
        str = "";
        for (int i = 0; i < st.length; i++) {
            if (st[i].length() > 2) {
                str += st[i].substring(1, st[i].length() - 1);
            }
        }
        System.out.println("\nOutput : " + str);
    }
}