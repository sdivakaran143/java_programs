import java.util.*;

public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
      String s=in.nextLine().trim().replace(" ","").toLowerCase();
      int n=s.length();
      Set<Character> st=new HashSet<Character>();
      if(n>=26){
        for(int i=0;i<n;i++) st.add(s.charAt(i));
      }
      if(st.size()==26)
        System.out.println("pangram");
      else
        System.out.println("not pangram");
  }
}