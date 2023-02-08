import java.util.*;
public class strings_with_two_options {
    static Scanner in =new Scanner(System.in);
    public static String calloption1(String str1,String str2,int option){
        String output ="";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i)==str2.charAt(j)){
                    output+=(option==0)?str1.charAt(i):"";
                    break;
                }
                else if(option==1&& str2.length()-1==j){
                    output+=str1.charAt(i);
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.print("enter the String 1 :");
        String str1=in.nextLine().toLowerCase();
        System.out.print("enter the String 2 :");
        String str2=in.nextLine().toLowerCase();
        System.out.print("enter the option 1 :");
        int op1=in.nextInt();
        System.out.print("enter the option 2 :");
        int op2=in.nextInt();
        String output;
        output=calloption1(str1,str2,op1);
        output+=calloption1(str2,str1,op1);
        output=(op2==0)?output.toLowerCase():output.toUpperCase();
        System.out.println("OUTPUT : "+output);  
    }
}
