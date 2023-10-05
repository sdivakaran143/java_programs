import java.util.*;
import java.math.*;
public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
      int n=in.nextInt();
      while(n-->0){
        int l=in.nextInt(),v=in.nextInt();
        in.nextLine();
        int valpos=l;
        String s=in.nextLine();
        String m=s;
        for(int i=0;i<l;i++){
            if(v>(s.charAt(i)-'0')){
              valpos=i;
              break;
            }
        }
        System.out.println(new StringBuilder(s).insert(valpos,v).toString());
      }
    }
}