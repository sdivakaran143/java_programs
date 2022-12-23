import java.util.*;
class encode_the_input_run_length{
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        String str = in.nextLine();
        String n="";
        int c=0;
        for(int i=0;i<str.length();i++){
          char ch=str.charAt(i);
          if(n.contains(""+ch)){
            c++;
          }
          else{
            n+=ch;
            c++;
          }

          try{
            if(ch!=str.charAt(i+1)){
            System.out.print(ch+""+(c));
            c=0;
            }
          }catch (Exception e) {
            System.out.print(ch+""+(c));
          }
        }
    }
}