/*
 * Create a java programs to sort list of names in Ascending and Descending order.
 */
import java.util.*;
public class list_of_names_in_acending_order {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the n : ");
        int n=in.nextInt();
        String[]name =new String[n];
        for(int i=0;i<n;i++){
            name[i]=in.nextLine();
        }        
        System.out.println("\nthe value before sort :");
        for(String i :name){
            System.out.println(i);
        }
        System.out.println("\nthe value after sort :");
        Arrays.sort(name);
        for(String i :name){
            System.out.println(i);
        }
    }
}