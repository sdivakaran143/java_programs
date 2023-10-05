import java.util.*;
import java.math.*;
public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
      int n=in.nextInt();
      while(n-->0){
        int l=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        String output="";
        for(int i=s.length()-1;i>=0;i--){
          int m=Integer.parseInt(s.charAt(i)+"");
          if(m==0){
            m=Integer.parseInt(s.charAt(i-2)+""+s.charAt(i-1));
            i-=2;
            output=((char)(m+'`'))+output;
          }else {
            output=((char)(m+'`'))+output;
          }
        }        
          System.out.println(output);
      }
    }
}