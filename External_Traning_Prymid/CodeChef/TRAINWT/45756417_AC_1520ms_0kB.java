import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            long a[] = new long[n];
            long sum = 0;
            long changes[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int s = sc.nextInt();
                int e = sc.nextInt();
                long w = sc.nextLong();
                changes[s - 1] += w;
                if (e < n) {
                    changes[e] -= w;
                }
            }
            for (int i = 1; i < n; i++) {
                changes[i] += changes[i - 1];
            }
            for (int i = 0; i < n; i++) {
                a[i] += changes[i];
            }
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
            }

            System.out.println(sum);
        }
    }
}
