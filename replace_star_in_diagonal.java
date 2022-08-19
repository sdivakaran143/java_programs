import java.util.*;
public class replace_star_inm_diagonal {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the row :");
        int r=in.nextInt();
        System.out.print("Enter the coloum :");
        int c=in.nextInt();

        int[][] arr =new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    System.out.print("*"+"\t");
                }else{
                    System.out.print(arr[i][j]+"\t");
                }
            }
            System.out.println();
        }

    }
}
