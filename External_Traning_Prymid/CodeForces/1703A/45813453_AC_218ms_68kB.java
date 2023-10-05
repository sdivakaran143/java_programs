import java.util.*;

public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
       int n=in.nextInt();
       in.nextLine();
       while(n-->0){
        String s=in.nextLine().toLowerCase();
        if(s.equals("yes")){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
       }
  }
}