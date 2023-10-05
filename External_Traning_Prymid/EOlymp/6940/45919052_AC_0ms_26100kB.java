import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();
        TreeMap < String, Integer > mp = new TreeMap < > (Collections.reverseOrder());
        int max = 0;
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            mp.put(s, mp.getOrDefault(s, 0) + 1);
            if (mp.get(s) > max) max = mp.get(s);
        }
        for (Map.Entry < String, Integer > e: mp.entrySet()) {
            if (e.getValue() == max) {
                System.out.println(e.getKey() + " " + e.getValue());
                break;
            }
        }
    }
}