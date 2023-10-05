import java.util.*;

public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
       int n=in.nextInt();
       in.nextLine();
        String s=in.nextLine().toLowerCase();
        String output="YES";
        if(n<26){
          output="NO";
        } 
        for(char i='a';i<='z'&&n>25;i++){
          if(s.indexOf(i)==-1){
              output="NO";
              break;
          } 
        }
        System.out.println(output);
  }
}