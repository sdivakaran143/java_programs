import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList < Integer > l = new ArrayList < > ();
        while (sc.hasNextInt()) {
            l.add(sc.nextInt());
        }
        int a[] = new int[l.size()];
        int k = 0;
        for (int x: l) {
            a[k++] = Integer.valueOf(x);
        }
        int z[] = split(a);
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
    }
    public static int[] split(int a[]) {
        if (a.length == 1)
            return a;
        int mid = a.length / 2;
        int l[] = split(Arrays.copyOfRange(a, 0, mid));
        int r[] = split(Arrays.copyOfRange(a, mid, a.length));
        return sort(l, r);
    }
    public static int[] sort(int l[], int r[]) {
        int join[] = new int[l.length + r.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.length && j < r.length) {
            if (l[i] < r[j])
                join[k++] = l[i++];
            else
                join[k++] = r[j++];
        }
        while (i < l.length)
            join[k++] = l[i++];
        while (j < r.length)
            join[k++] = r[j++];
        return join;
    }
}