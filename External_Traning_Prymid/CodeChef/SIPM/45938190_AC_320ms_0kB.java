import java.util.*;
public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        int n=in.nextInt(); 
        while(n-->0){
        Set <Integer> st= new HashSet<>();
        int v=in.nextInt(); 
          for(int i=0;i<v;i++){
            st.add(in.nextInt());
          }
          Iterator it =st.iterator();
          int neg=0,pos=0;
          while(it.hasNext()){
            int j=(int)it.next();
            if(j<0){
              neg+=j;
            }else{
              pos+=j;
            }
          }
          System.out.println(pos+" "+neg);
        }
  }
}