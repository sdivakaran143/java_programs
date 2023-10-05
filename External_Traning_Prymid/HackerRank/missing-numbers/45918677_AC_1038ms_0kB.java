import java.util.*;
public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        long n=in.nextInt();
        HashMap <Integer,Integer> hm= new HashMap<>();

        while(n-->0){
          int v=in.nextInt();
            if(hm.containsKey(v))
                hm.put(v,hm.get(v)+1);
            else 
                hm.put(v,1);
        }
        n=in.nextInt();
         while(n-->0){
          int v=in.nextInt();
            if(hm.containsKey(v))
                hm.put(v,hm.get(v)-1);
            else
                hm.put(v,1);
        }
      for(int i: hm.keySet()){
        if(hm.get(i)!=0){
          System.out.print(i+" ");
        }
      }
  }
}