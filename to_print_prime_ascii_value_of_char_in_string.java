/*
given string s="Apple" find ASCII value of the character check wherethere ASCII value is prime and print only the character having prime ASCII value o/p egiven string s="Apple" find ASCII value of the character check wherethere ASCII value is prime and print only the character having prime ASCII value o/p e
given string s="Apple"
find ASCII value of the character check wherethere ASCII value is prime and print only the character having prime ASCII value
o/p
    e
 */
import java.util.Scanner;
public class to_print_prime_ascii_value_of_char_in_string {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        String output="";
        System.out.print("Enter the String :");
        String  str= in.nextLine();
        boolean res;
        for(int i=0;i<str.length();i++){
            res=true;
            int as=(char)str.charAt(i);
            for(int j=2;j<=as/2;j++){
                if(as%j==0){
                    res=false;
                }
            }
            if(res==true){
                output+=str.charAt(i);
            }
        }
        System.out.println("Output : "+output);
}
}
