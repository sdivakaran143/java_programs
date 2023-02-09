import java.util.*;
public class Build_Lowest_Number_by_Removing_n_digits {
    static Scanner in =new Scanner(System.in);
    public static String perform(String str) {
                    //60221
                    
        // String str = "121198";
                       //1118
        String addon="empty";
        String output="";
        for (int i = 0; i < str.length()-1; i+=2) {
            int n=Integer.parseInt(str.charAt(i)+"");
            int m=Integer.parseInt(str.charAt(i+1)+"");
            // System.out.println(n+""+m);
            if(str.length()%2==1&&i==0)
                addon=""+str.charAt((str.length()-1));
                // System.out.println(str.charAt((str.length()-1)));
            if(n<m){
                    output+=str.charAt(i);
            }else if(m<n){
                    output+=str.charAt(i+1);
            }
            else{
                output+=str.charAt(i)+""+str.charAt(i+1);
            }
        }
        if(str.length()%2==1){
            output+=addon;
        }
        return output;
    }
    public static void main(String[] args) {
        // String str="765028321";
        // String str="121198";
        String str="4325043";
        int n=5;
        while(str.length()!=4){
            str=perform(str);
        }
        System.out.println(str);
    }
}
