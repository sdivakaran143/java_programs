import java.util.*;
import java.util.regex.*;

class ip_validation {
    static Scanner in = new Scanner(System.in);
    static boolean res = true;

    public static void call(Boolean val) {
        if (val) {
            System.out.println("Invalid IP...");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the IP to validate : ");
        String ip = in.nextLine();
        res = Pattern.compile("[a-z]").matcher(ip).find();
        call(res);
        String[] str = ip.split("[.]");
        if (str.length != 4) {
            call(true);
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 4 || Integer.parseInt(str[i]) > 255) {
                call(true);
            }
        }
        System.out.println("Valid IP...");
    }
}