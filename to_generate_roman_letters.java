/*
 * to generate roman letters 
 */
import java.util.*;

public class to_generate_roman_letters {
    static Scanner in= new Scanner(System.in); 

    public static void main(String[] args) {
    	String output="";
    	System.out.print("Enter the value : ");
    	int val=in.nextInt();
    	String[] rl={"I","II","IV","V","VI","IX","X","XX","XL","L","XC","C","CD","D","CM","M" }; 
		int[] arr= {    1 ,  2,   4,  5,   6,   9,  10, 20 , 40,  50, 90, 100, 400,500, 900,1000};
        for(int i=arr.length-1;i>=0;i--){
          while(val>=arr[i]) {
        	  val-=arr[i];
        	  output+=rl[i];
          }
        }System.out.println("the value is "+output);
    }
}
