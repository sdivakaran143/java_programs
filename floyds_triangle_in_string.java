/*
 * to print prymid by  using characters
 * floyd's triangle
 * and
 * a
 * b b
 * c c c
 * d d d d
 */
import java.util.*;
public class floyds_triangle_in_string {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the value :");
        int n=in.nextInt();
        char ch;
        ch='A';
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(Character.isAlphabetic(ch)&&ch<91){
                    System.out.print(ch+" ");}
            }
            System.out.println();
            ch++;
        }
        System.out.println("\n");
        ch='A';
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(Character.isAlphabetic(ch)&&ch<91){
                    System.out.print(ch+" ");}
                ch++;
            }
            System.out.println();
        }
    }
}
