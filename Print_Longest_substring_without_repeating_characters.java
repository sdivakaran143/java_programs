import java.util.*;
public class Print_Longest_substring_without_repeating_characters {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        // String str=in.nextLine();
        String str="geeksforgeek".toUpperCase();int i=0;int max=0;
      while(str.length()!=0){
            try{if(str.charAt(i)==str.charAt(i+1)){
                arr.add(str.substring(0, i));
                if(max<(str.substring(0, i)).length()){
                    max=(str.substring(0, i)).length();
                }
                str=str.substring(i+1);
            }}
            catch(Exception e){arr.add(str);str="";}
            i++;
        }
        System.out.print("Longest Sting ---> ");
        for (String string : arr) {
            if(string.length()==max){
                System.out.println(string);
            }
        }
    }
}
