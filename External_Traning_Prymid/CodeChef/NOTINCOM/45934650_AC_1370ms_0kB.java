import java.util.*;
public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        int n=in.nextInt();
        while(n-->0){
        HashSet<Integer> hs=new HashSet<>();
          int q=in.nextInt(),w=in.nextInt(); 
          int t=q+w;
          for(int i=0;i<t;i++){
            hs.add(in.nextInt());
          }
          System.out.println(t-hs.size());
        }
    }
}