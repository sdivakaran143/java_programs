/*
 * tto generate romman letters to numeric
 */
import java.util.*;
public class to_convet_romman_letters_ti_nummeric {

	static Scanner in= new Scanner(System.in); 

	public static void main(String[] args) {
		int value=0;
		System.out.print("Enter : ");
		String val=in.nextLine().toUpperCase();
		String[] rl={"I","II","IV","V","VI","IX","X","XX","XL","L","XC","C","CD","D","CM","M" }; 
		int[] arr= {  1 ,  2,   4,  5,   6,   9, 10,   20 ,40,  50, 90, 100, 400,500, 900,1000};
		int m=val.length(),n=0;
		for(int i=0;i<arr.length;i++){
			try {
				String st=val.substring(n,m);
				if(st.equals(rl[i])) {
					value+=arr[i];
					val=val.replace(st,"");
					i=-1;m=val.length();n=0;
				}else if(i==arr.length-1){
					n++;i=-1;
				}
			}
			catch(Exception e) {
				break;
			}
		}
		System.out.println(value);
	}
}

