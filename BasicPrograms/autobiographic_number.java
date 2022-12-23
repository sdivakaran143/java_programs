import java.util.*;
class autobiographic_number{
    static Scanner in=new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter the value : "); 
        int n=in.nextInt();
        String str =""+n;
        int sum=0;
         for (int i = 0; i < str.length(); i++) {
            int ch =str.charAt(i) -'0';
            sum+=ch;
         }
         if(sum==str.length()){
            System.out.println(str+" is Autobiographic number");
         }else{
            System.out.println(str+" is not Autobiographic number");
         }

    }
}