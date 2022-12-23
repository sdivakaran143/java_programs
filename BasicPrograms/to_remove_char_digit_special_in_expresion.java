import java.util.*;
public class to_remove_char_digit_special_in_expresion {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Expression : ");
        String str=in.nextLine();
        System.out.print("Enter 1 to remove ALPhabetics\nEnter 2 to remove Digits\nEnter 3 to remove specialCharacters\nEnter other keys to Do Nothing\nEnter choice :");
        int c=in.nextInt();
        for(int i=0;i<str.length();i++){
            while(true){
                char ch=str.charAt(i);
                if(Character.isAlphabetic(ch)&&c==1){
                    break;
                }else if(Character.isDigit(ch)&&c==2){
                        break;
                }
                if(Character.isDigit(ch)&&c==3||Character.isAlphabetic(ch)&&c==3){}
                else if(c==3){
                    break;
                }
                i++;
                System.out.print(ch);
                if(i==str.length()){
                    System.exit(0);
                }
            }

        }
    }
}
