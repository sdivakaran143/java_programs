import java.util.*;
public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
       int n=in.nextInt();
       in.nextLine();
       while(n-->0){
        String s=in.nextLine();
        if(s.length()>10){
          s=s.charAt(0)+((s.length()-2)+"")+s.charAt(s.length()-1);
        }
        System.out.println(s);
       }
  }
}