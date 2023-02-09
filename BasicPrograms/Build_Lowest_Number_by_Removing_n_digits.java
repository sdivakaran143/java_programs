import java.util.*;
public class Build_Lowest_Number_by_Removing_n_digits {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        String str = "765028321";
                    //60221
                    
        // String str = "121198";
                       //1118
        
        String output="";
for (int i = 0; i < str.length()-1; i+=2) {
    int n=Integer.parseInt(str.charAt(i)+"");
    int m=Integer.parseInt(str.charAt(i+1)+"");
    System.out.println(n+""+m);
    if(n<m){
            output+=str.charAt(i);
    }else{
            output+=str.charAt(i+1);
        }
        if(i+2>str.length()-1)
            if(str.length()%2==1)
                output+=str.charAt((str.length()-1));
        // System.out.println("hh");
}
        
        System.out.println(output);
    }
}
