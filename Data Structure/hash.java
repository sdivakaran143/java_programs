import java.util.*;

public class hash {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 7, 8, 4, 2, 1, 4, 5, 2, 1, 4, 5, 6, 5 };
		int[] arr1 = { 2, 1, 3, 4 };
		int[] f = new int[arr.length];
		Arrays.sort(arr);
		int m = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr1[i] == arr[j]) {
					f[m] = arr[j];
					m++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					break;
				}
				if (j == (arr1.length - 1)) {
					f[m] = arr[i];
					m++;
				}
			}
		}
		System.out.print("the hashed array is :\n\t");
		for (int i : f) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
