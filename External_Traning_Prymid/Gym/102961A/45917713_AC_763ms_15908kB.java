import java.util.*;
public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        int n=in.nextInt();
        Set <Integer> hm= new HashSet<>();
        int max=0;
        int maxKey=0;
      while(n-->0){
        int s=in.nextInt();
        hm.add(s);
      }
      System.out.println(hm.size());
  }
}