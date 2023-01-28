import java.util.*;
public class reverse_a_string {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("input a string :");
        String str=in.nextLine();

        String splitedstring[]=str.split(" ");
        String[] output=new String[splitedstring.length];
        for(int i=splitedstring.length-1,j=0;i>=0;i--,j++){
            output[j]=splitedstring[i];
        }
        System.out.println("output :\n");
        for (String string : output) {
            System.out.print(string+" ");
        }
        // System.out.println("Output : "+output);
    }
}