import java.util.*;

class hill_cipper_encryption {
    static Scanner in = new Scanner(System.in);
    public static void assign(int[][] arr,String key){
        int g=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=key.charAt(g)-'A';
                g++;
            }
        }
    } 

    public static void main(String[] args) {
        System.out.print("Enter the MSG : ");
        String str = in.nextLine().toUpperCase();
        int l =str.length();
        System.out.print("Enter the KEY : ");
        String key = in.nextLine().toUpperCase();
        int[][] arr =new int[l][l];
        int[][] val =new int[l][1];
        int[][] mul =new int[l][1];

       assign(arr, key);
       assign(val, str);

       int sum=0;
			for (int i=0;i<l;i++) {
				for (int j=0;j<1;j++) {
					for (int k=0;k<l;k++) {
						sum+=arr[i][k]*val[k][j];
					}
					mul[i][j]=sum%26;sum=0;
				}
			}

        for (int[] s : mul) {
            for (int r : s) {
                System.out.print((char)(r+1)-'A');
            }
        }

    }
}