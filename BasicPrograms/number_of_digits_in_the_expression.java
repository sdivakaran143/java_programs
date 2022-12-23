import java.util.*;
class number_of_digits_in_the_expression{
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the expresion : ");
        String str=in.nextLine();
        String[] num=new String[str.length()];
        int inc=0;
        for(int i=0;i<str.length();i++){
            while(true){
                char ch=str.charAt(i);
                if(Character.isDigit(ch)){
                    num[inc]+=""+ch;
                }
                else{
                    if(num[inc]==null||num[inc].equals("")){
                        num[inc]="";
                    }
                    else{inc++;
                    num[inc]="";}
                    break;
                }
                i++;
                if(i==str.length()){
                    System.out.println("the expression "+str+" Contains "+(inc+1)+" Numbers");
                    System.exit(0);
                }
            }

        }
    }
}