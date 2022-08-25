import java.util.*;
public class file_name_generator {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the string : ");
        String str =in.nextLine(); 
        System.out.print("enter the extension : ");
        String ex =in.nextLine(); 
        String[] stra=str.split(" ");
        for (int i=0;i<stra.length;i++) {
            System.out.print(stra[i]);
            if(i!=stra.length-1){
            System.out.print("_");
            }
        }
        System.out.print("."+ex);

    }
}
