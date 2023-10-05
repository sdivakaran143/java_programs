import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long res = 0;
        for (int i = 0; i < n; i++) {
            res ^= in.nextLong();
        }
        System.out.println(res);
    }
}