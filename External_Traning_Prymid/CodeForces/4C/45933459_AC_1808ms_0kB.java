import java.util.*;
public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        long n=in.nextInt();
        in.nextLine();
        HashMap <String,Integer> hm= new HashMap<>();
        while(n-->0){
          String v=in.nextLine();
            if(hm.containsKey(v)){
                hm.put(v,hm.get(v)+1);
                System.out.println(v+""+hm.get(v));
            }
            else{
                hm.put(v,0);
                System.out.println("OK");
            }
        }
  }
}