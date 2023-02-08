import java.util.*;
public class selection_of_a_string_with_given_string {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        String str = "Hello Welcome to KSR College, TiruchengodE";
        // String con="K__";
        System.out.print("enter the condition : ");
        String con=in.nextLine();
        int single=con.indexOf("_");
        int whole=con.indexOf("%");
        if(single!=-1) {
            String s=con.replaceAll("_", "");
            int index=str.indexOf(s);
            int ini=con.indexOf(s);
            System.out.println(str.substring(index-ini,index+con.length())); 
        }
        else if(whole!=-1){
            con=con.replaceAll("%", "");
            String s=con.replaceAll("_", "");
            String stri[]=str.split(" ");
            for (String st : stri) {
                if(st.contains(s)){
                    System.out.println(st);
                }
            }
        }



    }
}
