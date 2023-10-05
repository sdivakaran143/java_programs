import java.util.*;
public class Main {
  static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        int n=in.nextInt();
        int x=in.nextInt();
        in.nextLine();
        HashMap<String,String> hm=new HashMap<>();
        while(n-->0){
          String de[] =in.nextLine().split(" ");
            hm.put(de[1],de[0]);
        }
        while(x-->0){
          String de[]=in.nextLine().split(" ");
          de[1]=de[1].replace(";","");
          if(hm.containsKey(de[1]))
            System.out.println(de[0]+" "+de[1]+"; #"+hm.get(de[1]));
        }
    }
}