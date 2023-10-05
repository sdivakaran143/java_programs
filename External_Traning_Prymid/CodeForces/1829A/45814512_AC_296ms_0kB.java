import java.util.*;

public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
       int n=in.nextInt();
       in.nextLine();
       String p="codeforces";
       while(n-->0){
       int count=0;
        String s=in.nextLine().toLowerCase();
        for(int i=0;i<s.length();i++)
          if(s.charAt(i)!=p.charAt(i))
            count++;
        
        System.out.println(count);
       }
  }
}