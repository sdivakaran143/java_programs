import java.util.*;

public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
       int n=in.nextInt();
      while(n-->0){
        int a=in.nextInt();
        in.nextLine();
        String s=in.nextLine().toLowerCase()+" ";
        String output="";
        for(int i=0;i<s.length()-1;i++)
          if(s.charAt(i)!=s.charAt(i+1))
            output+=s.charAt(i);
        if(output.equals("meow")) System.out.println("YES");
        else System.out.println("NO");
      }
    }
}