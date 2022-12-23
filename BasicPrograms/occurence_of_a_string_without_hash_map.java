/*
 * occurence of the String without hash map
 */
import java.util.*;
public class occurence_of_a_string_without_hash_map {
    static Scanner in= new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.print("enter the string : ");
        String str=in.nextLine();

      // char[] ch=str.toCharArray();
       int [] arr=new int[str.length()];
       char [] cha=new char[100];
        char c;
        int inc=1;
        cha[inc]=str.charAt(0);
        arr[inc]++;
        int max=0; char maxch='a';
       for(int i=1;i<str.length();i++){
        c=str.charAt(i);
      
            for(int j=1;j<=inc;j++){
                if(cha[j]==c){
                    arr[j]++;
                    break;
                }
                else if(j==inc){
                    inc++;
                    cha[inc]=c;
                    arr[inc]++;
                    break;
                }
             }
    }
    for(int i=1;i<=inc;i++){
        System.out.println(cha[i]+" -- "+arr[i]);
        
    }
    for(int i=1;i<=inc;i++){
        if(max<arr[i]){
            max=i;
            maxch=cha[i];
        }
        if(i==inc){
            System.out.println("the maximum occured character is "+maxch+" occurs "+arr[max]+" times ");
        }
    }
 
    }
    }
