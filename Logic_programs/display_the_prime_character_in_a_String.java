import java.util.*;
public class display_the_prime_character_in_a_String {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        String str=in.nextLine().toUpperCase();
        System.out.print("result\n\t");
        for (int j = 0; j < str.length(); j++) {
            int ch=str.charAt(j)-64;
            Boolean res=true;
            if(ch==1){
                res=false;
            }
            for(int i=2;i<=ch/2;i++){
                res=true;
                if(ch%i==0){
                    res=false;
                    break;
                }
             }
             if(res){
                System.out.print(str.charAt(j));
             }
        }
    }
}
