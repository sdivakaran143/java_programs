import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        TreeMap < String, String > data = new TreeMap < > ();
        TreeMap < String, Integer > name = new TreeMap < > ();
        TreeMap < String, Integer > country = new TreeMap < > ();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String s1 = sc.next(), s2 = sc.next();
            data.put(s1, s2);
            name.put(s1, 0);
            country.put(s2, 0);
            sc.nextLine();
        }
        int nmax = 0, cmax = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            name.put(s, name.getOrDefault(s, 0) + 1);
            if (name.get(s) > nmax) nmax = name.get(s);
            country.put(data.get(s), country.getOrDefault(data.get(s), 0) + 1);
            if (country.get(data.get(s)) > cmax) cmax = country.get(data.get(s));
        }
        for (Map.Entry < String, Integer > e: country.entrySet()) {
            if (e.getValue() == cmax) {
                System.out.println(e.getKey());
                break;
            }
        }
        for (Map.Entry < String, Integer > e: name.entrySet()) {
            if (e.getValue() == nmax) {
                System.out.println(e.getKey());
                break;
            }
        }
    }
}