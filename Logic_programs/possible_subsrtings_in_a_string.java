import java.util.Scanner;
/*
Create a program in java to print all possible substrings in a string.
(Eg)
Input:
Hyderabad
Output:
H
Hy
Hyd
Hyde
Hyder
Hydera
Hyderab
Hyderaba
Hyderabad
 * 
 */
public class possible_subsrtings_in_a_string {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        String str=in.nextLine();
        for(int i=0;i<str.length()+1;i++){
            for(int j=0;j<i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
