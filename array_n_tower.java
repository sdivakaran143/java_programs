import java.util.*;

class array_n_tower {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the key value : ");
        int k = in.nextInt();

        System.out.print("Enter the n value : ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array values : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k) {
                arr[i] += k;
                continue;
            }
            if (arr[i] >= k) {
                arr[i] -= k;
                continue;
            }
        }
        Arrays.sort(arr);
        System.out.println("OUTPUT : " + (arr[arr.length - 1] - arr[0]));

    }
}