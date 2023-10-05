import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t1 = Integer.parseInt(br.readLine());
        for (int i = 0; i < t1; i++) {
            int n = Integer.parseInt(br.readLine());
            long[] a = new long[n];
            long[] prefixSum = new long[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j] = Long.parseLong(st.nextToken());
                prefixSum[j+1] = a[j] + prefixSum[j];
            }
            int q = Integer.parseInt(br.readLine());
            for (int j = 0; j < q; j++) {
                StringTokenizer query = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(query.nextToken());
                int r = Integer.parseInt(query.nextToken());
                long sum = prefixSum[r] - prefixSum[l - 1];
                sb.append(sum).append("\n");
            }
        }
        System.out.print(sb);
    }
}