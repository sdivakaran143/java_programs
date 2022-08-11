/*
 * Java program to find duplicate characters in a String
	i/p: String string1 = Great responsibility
	o/p:retsi
 */
import java.util.*;
public class find_duplicate_characters_in_a_String {

	public static void main(String[] args) {
			try(Scanner in =new Scanner(System.in)){
				System.out.print("Enter the string  :");
				String str =in.nextLine();
				int n=str.length();
				  HashMap<Character, Integer> occ = new HashMap<Character, Integer>();
				int c=0;
				char cr;
				for(int i=0;i<n;i++) {
					 cr=str.charAt(i);
				occ.put(str.charAt(i),c); 
				}
				
				 for(int i=0;i<n;i++) {
					 c=1;
					  cr=str.charAt(i);
						 if(i!=0) {
							 if(occ.get(str.charAt(i))>=1) {
								 c=occ.get(str.charAt(i))+1;
							 }
						 }
						occ.put(str.charAt(i),c);
				 }
				 
				  for (Character i : occ.keySet()) {
					  if(Character.isAlphabetic(i)) {
					  if(occ.get(i)>1) {
				      System.out.print( i +" ");
				    }
					  }
				}
			}

	}

}