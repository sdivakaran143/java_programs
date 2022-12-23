import java.util.*;

class missing_number_in_array {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the n value : ");
        int n = (in.nextInt() - 1);
        int[] arr = new int[n];

        System.out.println("Enter the array values : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = arr[0], j = 0; j < 8; i += diff, j++) {
            if (i != arr[j]) {
                System.out.println("Missing Number is : " + i);
                System.exit(0);
            }
        }
        System.out.println("There are no nmissing numbers...");
    }
}