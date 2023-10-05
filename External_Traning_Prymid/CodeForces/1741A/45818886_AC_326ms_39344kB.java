import java.util.*;

public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
       int n=in.nextInt();
        in.nextLine();
      while(n-->0){
        String s[]=in.nextLine().toLowerCase().split(" ");
        char ch1 =s[0].charAt(s[0].length()-1);
        char ch2 =s[1].charAt(s[1].length()-1);
        int s1,s2;
        if(ch1<ch2){
          System.out.println(">");
        }else if(ch1>ch2){
          System.out.println("<");
        }else{
          if(s[0].equals(s[1])){
            System.out.println("=");
          }
          else if(ch1=='s'){
            if(s[0].length()<s[1].length()){
              System.out.println(">");
            }else{
              System.out.println("<");
            }
          }
          else if(ch1=='l'){
          if(s[0].length()<s[1].length()){
            System.out.println("<");
          }else{
            System.out.println(">");
          }
          }
        }
      }
    }
}