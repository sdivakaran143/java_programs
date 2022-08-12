/*
Write a java program to count and print the highest occurrence of a character in a
string.
*/import java.util.*;
public class highest_occurence_of_char_in_string {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap <Character,Integer> hm=new HashMap<Character,Integer>();
        System.out.print("Enter the string : ");
        String str=in.nextLine();
        for(int i=0;i<str.length();i++){hm.put(str.charAt(i), 0);}

        for(int i=0;i<str.length();i++){
            if(hm.get(str.charAt(i))>=1){
                hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
                continue;
            }
            hm.put(str.charAt(i), 1);
        }
        
        char j=' ';
        for (Character i : hm.keySet()) {
            if(Character.isAlphabetic(i)) {
                if(hm.get(i)>1) {
                  j=i;
                }
            }
      }
      System.out.print( j +" occurs "+hm.get(j)+" times ");
    }

}
