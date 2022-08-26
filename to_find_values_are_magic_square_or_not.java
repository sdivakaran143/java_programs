import java.util.*;
public class to_find_values_are_magic_square_or_not {
    static Scanner in =new Scanner(System.in);
   // static int arr[][]={{1,2,2},{2,2,1},{2,1,2}};
    static int arr[][]={{2,7,6},{9,5,1},{4,3,8}};
    static int n=0;
    static void checksum(int k){
        int sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(k==1){sum+=arr[i][j];}
                if(k==2){sum+=arr[j][i];}
                if(k==3 && i==j){sum+=arr[j][i];}
                if(k==4 && i+j==2){sum+=arr[j][i];}
            }
            if(k!=3&&k!=4){
            if(i==0){ n=sum;}
            else if(n!=sum &&k==3){
               System.out.println("False...");
               System.exit(0);
            }
            sum=0;
            }
        }
        if(k==3&&sum!=n||k==4&&sum!=n){ System.out.println("False...");System.exit(0);}
    }
    public static void main(String[] args) {
        checksum(1);
        checksum(2);
        checksum(3);
        checksum(4);  
        System.out.println("Sum of Each Row and Each column are equal...");
    }
}